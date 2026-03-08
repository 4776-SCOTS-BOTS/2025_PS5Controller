// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */

/**
 * A test command that fires when the PS5 left trigger (L2) is fully pressed.
 *
 * <p>The trigger condition in RobotContainer normalizes axis 3 from the range [-1, 1] to [0, 1]
 * and checks for a value of exactly 1 (fully depressed). This command prints a confirmation
 * message and ends immediately - replace the body of initialize() with real robot actions.
 *
 * <p>This command is only registered when a PS5 DualSense is detected (joystick type 21).
 */
public class LeftTriggerTest extends Command {
  /** Creates a new LeftTriggerTest. */
  public LeftTriggerTest() {
    // No subsystem requirements; this command only prints to the console.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Left Trigger Test");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
