package TextHW9;


import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<String> lines = readFileLines();
        File result = new File("result.txt");
        try (FileWriter writer = new FileWriter(result);
             BufferedWriter lineWriter = new BufferedWriter(writer)) {
            for (String line : lines) {
                Sentence sentence = new SpaceSeparatedSentence(line);
                Sentence has3to5words = new LimitedWordsSentence(sentence);
                Sentence hasPalindrome = new HasPalindromeSentence(sentence);

                if (has3to5words.isValid() || hasPalindrome.isValid()) {
                    lineWriter.write(line);
                    lineWriter.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to write results to " + result.getAbsolutePath(), e);
        }
    }

    private static List<String> readFileLines() {
        File sentences = new File("sentences.txt");
        try (FileReader fileReader = new FileReader(sentences);
             BufferedReader linesReader = new BufferedReader(fileReader)) {
            return linesReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file " + sentences.getAbsolutePath(), e);
        }
    }
}

