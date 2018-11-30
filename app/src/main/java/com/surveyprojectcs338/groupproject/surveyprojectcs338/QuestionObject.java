package com.surveyprojectcs338.groupproject.surveyprojectcs338;

public class QuestionObject {
    // 0 = Input Text
    // 1 = Radio Buttons
    // 2 = Rick
    int questionType;
    String questionName;
    String[] radioAnswers;

    public QuestionObject(int qType, String qName, String[] rAnswers) {
        questionType = qType;
        questionName = qName;
        radioAnswers = rAnswers;
    }

    public int getQuestionType() {
        return questionType;
    }

    public void setQuestionType(int questionType) {
        this.questionType = questionType;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String[] getRadioAnswers() {
        return radioAnswers;
    }

    public void setRadioAnswers(String[] radioAnswers) {
        this.radioAnswers = radioAnswers;
    }
}
