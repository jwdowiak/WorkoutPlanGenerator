package org.example;

public class Exercise {
    private String name;
    private String category;
    private Difficulty difficulty;
    private TrainingType trainingType;
    private int sets;
    private int repetitions;
    private int durationInSeconds;


    public Exercise(String name, String category, Difficulty difficulty, TrainingType trainingType,
                    int sets, int repetitions, int durationInSeconds) {
        this.name = name;
        this.category = category;
        this.difficulty = difficulty;
        this.trainingType = trainingType;
        this.sets = sets;
        this.repetitions = repetitions;
        this.durationInSeconds = durationInSeconds;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public TrainingType getTrainingType() {
        return trainingType;
    }

    public int getSets() {
        return sets;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
}
