package com.kkiran.quiz;

/**
 * Created by kkanchamreddy on 1/6/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answer) {
        mAnswerTrue = answer;
    }

    public  Question(int textResId, boolean answer){
        mTextResId = textResId;
        mAnswerTrue = answer;
    }
}
