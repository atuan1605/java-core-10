package model;

import team.Position;

public class Player {

    private int number;
    private String fullName;
    private Position position;

    public Player() {
    }

    public Player(int number, String fullName, Position position) {
        this.number = number;
        this.fullName = fullName;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "model.Player{" +
                "number=" + number +
                ", fullName='" + fullName + '\'' +
                ", position=" + position +
                '}';
    }
}