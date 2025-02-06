package model;

import java.util.Arrays;

public class Question {

    private int qsnId;
    private String question;

    private String[] options;
    private String answer;

    public Question(int qsnId, String answer, String[] options, String question) {
        this.qsnId = qsnId;
        this.answer = answer;
        this.options = options;
        this.question = question;
    }

    public int getQsnId() {
        return qsnId;
    }

    public void setQsnId(int qsnId) {
        this.qsnId = qsnId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "qsnId=" + qsnId +
                ", answer='" + answer + '\'' +
                ", question='" + question + '\'' +
                ", options=" + Arrays.toString(options) +
                '}';
    }
}
