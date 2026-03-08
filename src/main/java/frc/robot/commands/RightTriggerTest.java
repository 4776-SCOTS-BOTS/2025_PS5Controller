// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */

/**
 * A test command intended to fire when the PS5 right trigger (R2) is fully pressed.
 *
 * <p>NOTE: This command is not currently wired to any button or trigger binding in RobotContainer.
 * To activate it, add a Trigger in configureBindings() that reads axis 4 (the R2 axis on PS5),
 * normalizes it the same way as the left trigger, and calls .onTrue(new RightTriggerTest()).
 */
public class RightTriggerTest extends Command {
  /** Creates a new RightTriggerTest. */
  public RightTriggerTest() {
    // No subsystem requirements; this command only prints to the console.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Right Trigger Test");
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
