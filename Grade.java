

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alper
 */
public class Grade {
    private int grade;
    private double percentage;

    public Grade(int grade, double percentage) {
        this.grade = grade;
        this.percentage = percentage;
    }

    public int getGrade() {
        return grade;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return this.grade+" "+ percentage * 100+" %";
    }
    
    
    
    
}
