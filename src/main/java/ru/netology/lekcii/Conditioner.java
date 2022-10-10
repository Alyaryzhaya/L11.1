package ru.netology.lekcii;

public class Conditioner {

    private int id;
    private String name = "noname";
    private int maxTemp = 30;
    private int minTemp = 15;
    private int currentTemp = 22;
    private boolean on;

    public int getMaxTemp() {
        return maxTemp;
    }

    public String getName() {
        return name;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

}
