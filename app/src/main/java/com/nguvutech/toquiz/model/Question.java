package com.nguvutech.toquiz.model;

import java.util.List;

public class Question {
    private String mQuestion;
    private List<String> mListAnswers;
    private int mIndexAnswers;

    public Question(String question) {
        mQuestion = question;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public Question(List<String> listAnswers) {
        mListAnswers = listAnswers;
    }

    public List<String> getListAnswers() {
        return mListAnswers;
    }

    public Question(int indexAnswers) {
        mIndexAnswers = indexAnswers;
    }

    public int getIndexAnswers() {
        return mIndexAnswers;
    }
}
