package org.example;

import java.util.List;

public class TrainingPlanGenerator {
    public static void main(String[] args) {

        List<Exercise> exercises = Helper.createExerciseList();
        TrainingPlan trainingPlan = new TrainingPlan(exercises);

        int numberOfDays = 7; // generowanie 7-dniowego planu
        trainingPlan.generatePlan(numberOfDays);
    }
}
