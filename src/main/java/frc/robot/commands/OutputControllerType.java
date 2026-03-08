// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.Command;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */

/**
 * A diagnostic command that prints the HID type number of the controller connected to a given
 * Driver Station USB port.
 *
 * <p>Common type values:
 * <ul>
 *   <li>1  - Xbox 360 / Xbox One controller</li>
 *   <li>21 - PS5 DualSense controller</li>
 * </ul>
 *
 * <p>This command finishes immediately after printing; it does not hold any subsystem.
 * Bind it to a button to identify unfamiliar controllers at runtime.
 */
public class OutputControllerType extends Command {

  // The Driver Station USB port index (0-5) to query.
  private final int port;

  /**
   * Creates a new OutputControllerType.
   *
   * @param port the Driver Station joystick port to query (0-based)
   */
  public OutputControllerType(int port) {
    // No subsystem requirements because this command only reads from DriverStation.
    this.port = port;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // getJoystickType() returns a HID descriptor type integer reported by the OS.
    // Printing it lets the drive team or developer confirm which controller is recognized.
    int type = DriverStation.getJoystickType(port);
    System.out.println("Controller type = " + type);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
