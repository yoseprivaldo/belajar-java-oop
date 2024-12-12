package com.enigmacamp.robot;

public class Robot {
    private Directions direction;
    private Position position;

    public Robot(Directions direction, Position position) {
        this.direction = direction;
        this.position = position;
    }

    public void moves(String commands)  {
        String[] commandArr = commands.split("");
        for (String command: commandArr){
            move(command);
            System.out.println(this);
        }
    }

    public void move(String command){
        switch (command) {
            case "F" -> forward();
            case "R" -> this.direction.turnLeft();
            case "L" -> this.direction.turnRight();
            default -> throw new IllegalArgumentException("Masukkan format (F,R, L)");
        }
    }

    public void forward(){
        switch (direction){
            case NORTH -> this.position.getTop();
            case EAST -> this.position.getRight();
            case SOUTH -> this.position.getBottom();
            case WEST -> this.position.getLeft();
            default -> System.out.println("Wrong command");
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "direction=" + direction +
                ", position=" + position +
                '}';
    }


}
