package ru.mirea.task12;

public class Student {
    private int id = 0;
    private int score = 0;

    public Student(int id, int score) { this.id = id; this.score = score; }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void set_score(int score) {
        this.score = score;
    }

    public int get_score() {
        return score;
    }
}
