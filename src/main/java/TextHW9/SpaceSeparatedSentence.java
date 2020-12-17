package TextHW9;

import java.util.Arrays;
import java.util.List;

public class SpaceSeparatedSentence implements Sentence {

    private final String text;


    public SpaceSeparatedSentence(String text) {
        this.text = text;
    }


    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public List<String> words() {
        return Arrays.asList(text.split(" +"));
    }
}
