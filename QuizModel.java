package model;

import java.util.ArrayList;
import java.util.List;

public class QuizModel {

    private List<String> questions;
    private List<String[]> options;
    private List<String> correctAnswers;

    public QuizModel() {
    
        questions = new ArrayList<>();
        options = new ArrayList<>();
        correctAnswers = new ArrayList<>();
        questions.add("Which keyword is used to define a constant in Java?");
        options.add(new String[]{"1. final", "2. const", "3. static", "4. immutable"});
        correctAnswers.add("1");

        questions.add("What is the return type of the hashCode() method in Java?");
        options.add(new String[]{"1. int", "2. long", "3. String", "4. Object"});
        correctAnswers.add("1");

        questions.add("Which of the following loops in Java is an entry-controlled loop?");
        options.add(new String[]{"1. while", "2. do-while", "3. for", "4. both 1 and 3"});
        correctAnswers.add("4");

        questions.add("Which operator is used for bitwise AND in Java?");
        options.add(new String[]{"1. &", "2. &&", "3. |", "4. ||"});
        correctAnswers.add("1");

        questions.add("Which method is called automatically when an object is garbage collected?");
        options.add(new String[]{"1. finalize()", "2. destructor()", "3. gc()", "4. dispose()"});
        correctAnswers.add("1");
    }
    public int getTotalQuestions() {
        return questions.size();
    }
    public String getQuestion(int index) {
        return questions.get(index);
    }
    public String[] getOptions(int index) {
        return options.get(index);
    }
    public String getCorrectAnswer(int index) {
        return correctAnswers.get(index);
    }
}