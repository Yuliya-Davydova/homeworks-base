package TextHW9;

import java.util.List;

public class LimitedWordsSentence implements Sentence {

    private final Sentence sentence;


    public LimitedWordsSentence(Sentence sentence) {
        this.sentence = sentence;
    }


    @Override
    public boolean isValid() {
        return sentence.isValid() && (words().size() >= 3) && (words().size() <= 5);
    }

    @Override
    public List<String> words() {
        return sentence.words();
    }
}
