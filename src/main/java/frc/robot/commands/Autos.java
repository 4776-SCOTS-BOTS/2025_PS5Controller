// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

/**
 * Factory class for autonomous routines.
 *
 * <p>Each static method returns a Command that the robot will run during the autonomous period.
 * Add new static methods here for each auto routine you want to be selectable.
 * This class cannot be instantiated - it is purely a namespace for static factory methods.
 */
public final class Autos {
  /**
   * A placeholder autonomous routine that runs the example subsystem command followed by
   * ExampleCommand in sequence. Replace or expand this with real autonomous logic.
   *
   * @param subsystem the subsystem required by both commands in the sequence
   * @return a sequential command group that constitutes the auto routine
   */
  public static Command exampleAuto(ExampleSubsystem subsystem) {
    // Commands.sequence() runs each command one after the other, waiting for each to finish
    // before starting the next.
    return Commands.sequence(subsystem.exampleMethodCommand(), new ExampleCommand(subsystem));
  }

  // Prevent instantiation - all methods are static
  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
