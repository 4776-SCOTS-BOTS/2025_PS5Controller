// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static int topButton, rightButton, bottomButton, leftButton, leftBumper, rightBumper, leftTrigger, 
      rightTrigger, leftStickButton, rightStickButton, dpadUp, dpadRight, dpadDown, dpadLeft, 
      PS5MuteButton, PS5HomeButton, leftMenuButton, rightMenuButton, PS5TouchpadButton, leftStickX, 
      leftStickY, rightStickX, rightStickY;

  public static void controllerConstants() {

      if (DriverStation.getJoystickType(0) == 21) {
        //PS5 Controller
        topButton = 4;
        rightButton = 3;
        bottomButton = 2;
        leftButton = 1;
        leftBumper = 5;
        rightBumper = 6;
        leftTrigger = 3; //Axis, called X Rotate in Driver Station
        rightTrigger = 4; //Axis, called Y Rotate in Driver Station
        leftStickButton = 11;
        rightStickButton = 12;
        dpadUp = 0;
        dpadRight = 90;
        dpadDown = 180;
        dpadLeft = 270;
        PS5MuteButton = 15;
        PS5HomeButton = 13;
        leftMenuButton = 9;
        rightMenuButton = 10;
        PS5TouchpadButton = 14;

        leftStickX = 0; //Axis, called X Axis in Driver Station
        leftStickY = 1; //Axis, called Y Axis in Driver Station
        rightStickX = 2; //Axis, called Z Axis in Driver Station
        rightStickY = 5; //Axis, called Z Rotate in Driver Station
      } else {
        //Xbox Controller
        topButton = 4;
        rightButton = 2;
        bottomButton = 1;
        leftButton = 3;
        leftBumper = 5;
        rightBumper = 6;
        leftTrigger = 2; //Axis
        rightTrigger = 3; //Axis
        leftStickButton = 9;
        rightStickButton = 10;
        dpadUp = 0;
        dpadRight = 90;
        dpadDown = 180;
        dpadLeft = 270;
        //PS5MuteButton = null;
        //PS5HomeButton = null;
        leftMenuButton = 7;
        rightMenuButton = 8;
        //PS5TouchpadButton = null;
        
        leftStickX = 0; //Axis
        leftStickY = 1; //Axis
        rightStickX = 4; //Axis
        rightStickY = 5; //Axis
      }
  }
}
