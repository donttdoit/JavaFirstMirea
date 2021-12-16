package ru.mirea.task30;

import java.util.ArrayList;

public class Game {
    public String nameLevel;
    private int level;
    private String difficult;


    public Game(String nameLevel, int level, String difficult) {
        this.nameLevel = nameLevel;
        this.level = level;
        this.difficult = difficult;
    }

    public String getName() {
        return nameLevel;
    }

    public void setName(String name) {
        this.nameLevel = nameLevel;
    }

    public int getWeight() {
        return level;
    }

    public void setWeight(int weight) {
        this.level = weight;
    }

    public String getEyesColor() {
        return difficult;
    }

    public void setEyesColor(String eyesColor) {
        this.difficult = eyesColor;
    }


    @Override
    public String toString() {
        return "Woman: " + "nameLevel=" + nameLevel + "; " +
                "level=" + level + "; " +
                "difficult=" + difficult +
                '.';
    }

    @Override
    public int hashCode() {
        return level + 31 * difficult.hashCode();
    }
}