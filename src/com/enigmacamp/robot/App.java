package com.enigmacamp.robot;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
      try{
          Robot robot = new Robot(Directions.NORTH, new Position(2,3));
          robot.moves("RLFB");
      } catch (IllegalArgumentException e){
          System.out.println(e.getMessage());
      }

    }
}
