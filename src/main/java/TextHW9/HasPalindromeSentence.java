package TextHW9;

import java.util.List;

public class HasPalindromeSentence implements Sentence {

    private final Sentence sentence;


    public HasPalindromeSentence(Sentence sentence) {
        this.sentence = sentence;
    }


    @Override
    public boolean isValid() {
        if (sentence.isValid()) {
            for (String word : words()) {
                if (isPalindrome(word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isPalindrome(String word) {
        // TODO: 14/12/2020 optimize word check process, it is unnecessary to check the second part of the word
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<String> words() {
        return sentence.words();
    }
}

