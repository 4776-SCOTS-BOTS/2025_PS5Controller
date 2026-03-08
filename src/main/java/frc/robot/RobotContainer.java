// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.LeftTriggerTest;
import frc.robot.commands.OutputControllerType;
import frc.robot.commands.PS5HomeButtonTest;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Constants.ControllerConstants;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  // Replace with CommandPS4Controller or CommandJoystick if needed
  //private final CommandXboxController m_driverController = new CommandXboxController(OperatorConstants.kDriverControllerPort);

  // GenericHID is used instead of CommandXboxController or CommandPS4Controller so that
  // the same controller object works regardless of which physical controller is connected.
  // The port number (0) matches kDriverControllerPort in OperatorConstants.
  private final GenericHID m_driverController = new GenericHID(0);


    /** The container for the robot. Contains subsystems, OI devices, and commands. */
    public RobotContainer() {

      // Configure the trigger bindings
      configureBindings();

      // Print the controller name at startup so the drive team can confirm the right
      // controller was detected (useful when switching between PS5 and Xbox).
      System.out.println("Controller Name, Output From RobotContainer =  " + m_driverController.getName());
    }
    /**
     * Use this method to define your trigger->command mappings. Triggers can be created via the
     * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
     * predicate, or via the named factories in {@link
     * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
     * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
     * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
     * joysticks}.
     */
    private void configureBindings() {
      // Cache the joystick type so we can conditionally register PS5-only bindings below.
      int type = DriverStation.getJoystickType(0);

      // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
      new Trigger(m_exampleSubsystem::exampleCondition)
          .onTrue(new ExampleCommand(m_exampleSubsystem));

      // Pressing the bottom face button (Cross on PS5, A on Xbox) prints the raw controller
      // type number to the console - useful for identifying unknown controllers.
      new JoystickButton(m_driverController, ControllerConstants.bottomButton).onTrue(new OutputControllerType(0));

      // The following bindings only apply when a PS5 DualSense is connected (type == 21).
      // They use features that don't exist on Xbox (home button, touchpad, etc.).
      if (type == 21) {
        new JoystickButton(m_driverController, ControllerConstants.PS5HomeButton).onTrue(new PS5HomeButtonTest());

        // The PS5 left trigger (L2) is reported as axis 3, ranging from -1.0 (released)
        // to +1.0 (fully pressed).  The expression (axis + 1) / 2 normalizes this to
        // 0.0–1.0, and we fire the command only when that value equals exactly 1
        // (i.e., the trigger is fully depressed).
        new Trigger(() -> (m_driverController.getRawAxis(3) + 1) / 2 == 1).onTrue(new LeftTriggerTest());
      }

    }
  
    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
      // An example command will be run in autonomous
      return Autos.exampleAuto(m_exampleSubsystem);
    }
  /**
   * Main method to run the robot.
   *
   * @param args command line arguments
   */
}

