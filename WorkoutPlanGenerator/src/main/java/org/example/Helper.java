package org.example;

import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static List<Exercise> createExerciseList() {
        List<Exercise> exercises = new ArrayList<>();

        exercises.add(new Exercise("Push-ups", "Upper Body", Difficulty.MEDIUM, TrainingType.STRENGTH, 3, 15, 0));
        exercises.add(new Exercise("Squats", "Lower Body", Difficulty.MEDIUM, TrainingType.STRENGTH, 3, 12, 0));
        exercises.add(new Exercise("Plank", "Core", Difficulty.EASY, TrainingType.STRENGTH, 3, 60, 0));
        exercises.add(new Exercise("Lunges", "Lower Body", Difficulty.MEDIUM, TrainingType.STRENGTH, 3, 12, 0));
        exercises.add(new Exercise("Pull-ups", "Upper Body", Difficulty.HARD, TrainingType.STRENGTH, 3, 8, 0));
        exercises.add(new Exercise("Crunches", "Core", Difficulty.EASY, TrainingType.STRENGTH, 3, 20, 0));
        exercises.add(new Exercise("Running", "Cardio", Difficulty.MEDIUM, TrainingType.CARDIO, 0, 0, 300));
        exercises.add(new Exercise("Jump Rope", "Cardio", Difficulty.EASY, TrainingType.CARDIO, 0, 0, 180));
        exercises.add(new Exercise("Burpees", "Full Body", Difficulty.HARD, TrainingType.CARDIO, 0, 0, 60));
        exercises.add(new Exercise("Hip-Thrust", "Lower Body", Difficulty.HARD, TrainingType.STRENGTH, 10, 3, 0));

        return exercises;

    }
}
