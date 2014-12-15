package com.example.gabriela.structure;

/**
 * Created by Gabriela on 11/12/2014.
 */
public class Question {

    private int idQuestion;
    private String questionText;
    private int idQuestionChildYes;
    private int idQuestionChildNo;
    private String solutionYes;
    private String solutionNo;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getIdQuestionChildYes() {
        return idQuestionChildYes;
    }

    public void setIdQuestionChildYes(int idQuestionChildYes) {
        this.idQuestionChildYes = idQuestionChildYes;
    }

    public int getIdQuestionChildNo() {
        return idQuestionChildNo;
    }

    public void setIdQuestionChildNo(int idQuestionChildNo) {
        this.idQuestionChildNo = idQuestionChildNo;
    }

    public String getSolutionNo() {
        return solutionNo;
    }

    public void setSolutionNo(String solutionNo) {
        this.solutionNo = solutionNo;
    }

    public String getSolutionYes() {
        return solutionYes;
    }

    public void setSolutionYes(String solutionYes) {
        this.solutionYes = solutionYes;
    }
}
