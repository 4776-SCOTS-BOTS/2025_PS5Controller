// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */

/**
 * A test command that fires when the PS5 DualSense home (PlayStation logo) button is pressed.
 *
 * <p>The home button is button 13 on the DualSense and is PS5-exclusive - it does not exist on
 * Xbox controllers. This binding is therefore only registered in RobotContainer when a PS5
 * controller is detected (joystick type 21).
 *
 * <p>The command prints a confirmation message and ends immediately.
 */
public class PS5HomeButtonTest extends Command {
  /** Creates a new PS5HomeButtonTest. */
  public PS5HomeButtonTest() {
    // No subsystem requirements; this command only prints to the console.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("PS5 Home Button Test");
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
