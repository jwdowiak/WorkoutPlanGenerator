package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrainingPlan {
    private List<Exercise> exercises;

    public TrainingPlan(List<Exercise> exercises) {
        this.exercises = exercises;
    }


    public void generatePlan(int days) {
        Random random = new Random();

        for (int i = 1; i <= days; i++) {
            System.out.println("Day " + i + ":");
            TrainingType trainingType = getRandomTrainingType();

            for (int j = 0; j < 4; j++) { // zakładam 4 ćwiczenia w 1 treningu
                Exercise randomExercise = getRandomExercise(trainingType);
                System.out.println("- " + randomExercise.getName() +
                        " (" + randomExercise.getCategory() +
                        ", Difficulty: " + randomExercise.getDifficulty() +
                        ", Type: " + randomExercise.getTrainingType() +
                        ", Sets: " + randomExercise.getSets() +
                        ", Repetitions: " + randomExercise.getRepetitions() +
                        ", Duration: " + (randomExercise.getDurationInSeconds() > 0 ?
                        randomExercise.getDurationInSeconds() + " seconds" : "N/A") + ")");

            }
            System.out.println();
        }
    }

    private Exercise getRandomExercise(TrainingType trainingType) {
        Random random = new Random();
        List<Exercise> filteredExercises = new ArrayList<>();

        for (Exercise exercise : exercises) {
            if (exercise.getTrainingType() == trainingType) {
                filteredExercises.add(exercise);
            }
        }

        if (filteredExercises.isEmpty()) {
            return exercises.get(random.nextInt(exercises.size()));
        } else {
            return filteredExercises.get(random.nextInt(filteredExercises.size()));
        }

    }

    private TrainingType getRandomTrainingType() {
        Random random = new Random();
        return TrainingType.values()[random.nextInt(TrainingType.values().length)];
    }





}
