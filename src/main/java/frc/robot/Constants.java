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
    // USB port on the Driver Station laptop where the primary driver controller is plugged in.
    public static final int kDriverControllerPort = 0;
  }

  /**
   * ControllerConstants maps abstract input names (e.g. "bottomButton", "leftStickX") to the
   * raw button/axis IDs reported by the WPILib Driver Station for whichever controller is
   * connected at port 0.
   *
   * <p>The static initializer block runs once at startup, detects whether a PS5 DualSense
   * (joystick type 21) or an Xbox controller is plugged in, and sets every constant accordingly.
   * This lets the rest of the code refer to logical names without caring which physical controller
   * is in use.
   *
   * <p>PS5-only fields (PS5MuteButton, PS5HomeButton, PS5TouchpadButton) are set to -1 when an
   * Xbox controller is detected, so any bindings that depend on them must guard against -1.
   */
  public static final class ControllerConstants {

      // Face buttons - named by position on the controller face
      // Xbox: A=bottom, B=right, X=left, Y=top - PS5: Cross=bottom, Circle=right, Square=left, Triangle=top
      public static final int topButton;
      public static final int rightButton;
      public static final int bottomButton;
      public static final int leftButton;

      // Shoulder buttons (bumpers sit above the triggers on the top edge)
      public static final int leftBumper;
      public static final int rightBumper;

      // Triggers - these are AXIS indices, not button indices.
      // Read them with getRawAxis(), not getRawButton().
      public static final int leftTrigger;
      public static final int rightTrigger;

      // Clicking the analog sticks down registers as a button
      public static final int leftStickButton;
      public static final int rightStickButton;

      // D-pad values are reported as a POV angle in degrees (0 = up, 90 = right, etc.)
      // Use getPOV() to read the d-pad; these constants are the expected angle values.
      public static final int dpadUp;
      public static final int dpadRight;
      public static final int dpadDown;
      public static final int dpadLeft;

      // PS5 DualSense-specific buttons; set to -1 when an Xbox controller is connected.
      public static final int PS5MuteButton;      // The microphone mute button on the DualSense
      public static final int PS5HomeButton;      // The PlayStation logo button
      public static final int PS5TouchpadButton;  // Clicking the touchpad registers as a button

      // Menu / start / select buttons (named generically so they work on both controllers)
      public static final int leftMenuButton;   // "Create" on PS5, "Back" on Xbox
      public static final int rightMenuButton;  // "Options" on PS5, "Start" on Xbox

      // Analog stick axes - read with getRawAxis()
      public static final int leftStickX;
      public static final int leftStickY;
      public static final int rightStickX;
      public static final int rightStickY;

      static {
        // DriverStation.getJoystickType() returns a HID type code.
        // Type 21 corresponds to the PS5 DualSense controller.
        // Any other value falls through to the Xbox defaults.
        if (DriverStation.getJoystickType(0) == 21) {
          //PS5 Controller
          topButton = 4;    // Triangle
          rightButton = 3;  // Circle
          bottomButton = 2; // Cross (X)
          leftButton = 1;   // Square
          leftBumper = 5;   // L1
          rightBumper = 6;  // R1
          leftTrigger = 3;  //Axis, called X Rotate in Driver Station (L2)
          rightTrigger = 4; //Axis, called Y Rotate in Driver Station (R2)
          leftStickButton = 11;  // L3
          rightStickButton = 12; // R3
          // D-pad angles (degrees, clockwise from top)
          dpadUp = 0;
          dpadRight = 90;
          dpadDown = 180;
          dpadLeft = 270;
          PS5MuteButton = 15;
          PS5HomeButton = 13;   // PlayStation logo button
          leftMenuButton = 9;   // Create button
          rightMenuButton = 10; // Options button
          PS5TouchpadButton = 14;

          leftStickX = 0;  //Axis, called X Axis in Driver Station
          leftStickY = 1;  //Axis, called Y Axis in Driver Station
          rightStickX = 2; //Axis, called Z Axis in Driver Station
          rightStickY = 5; //Axis, called Z Rotate in Driver Station
        } else {
          //Xbox Controller
          topButton = 4;    // Y
          rightButton = 2;  // B
          bottomButton = 1; // A
          leftButton = 3;   // X
          leftBumper = 5;   // LB
          rightBumper = 6;  // RB
          leftTrigger = 2;  //Axis (LT)
          rightTrigger = 3; //Axis (RT)
          leftStickButton = 9;   // LS
          rightStickButton = 10; // RS
          dpadUp = 0;
          dpadRight = 90;
          dpadDown = 180;
          dpadLeft = 270;
          // These buttons do not exist on Xbox; -1 signals "not available"
          PS5MuteButton = -1;
          PS5HomeButton = -1;
          leftMenuButton = 7;   // Back
          rightMenuButton = 8;  // Start
          PS5TouchpadButton = -1;

          leftStickX = 0;  //Axis
          leftStickY = 1;  //Axis
          rightStickX = 4; //Axis
          rightStickY = 5; //Axis
        }
      }
  }
}
