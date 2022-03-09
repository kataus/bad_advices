package ru.itvitality.otus.ba.after.scoring;

public class ScoringResult {
    private int score;
    private ResultEnum result;
    private String message;

    public int getScore() {
        return score;
    }

    public void setScore( int score ) {
        this.score = score;
    }

    public ResultEnum getResult() {
        return result;
    }

    public void setResult( ResultEnum result ) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage( String message ) {
        this.message = message;
    }
}
