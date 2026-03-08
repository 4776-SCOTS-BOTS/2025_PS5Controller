// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * ExampleSubsystem is a placeholder subsystem included by the WPILib project template.
 *
 * <p>In a real robot project, each physical mechanism (drivetrain, arm, intake, etc.) would have
 * its own SubsystemBase subclass. This example shows the required structure: a constructor for
 * hardware initialization, command factory methods, and periodic/simulationPeriodic overrides.
 *
 * <p>Replace this class with real subsystem implementations as the robot is built out.
 */
public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. Hardware objects (motors, sensors, etc.) are initialized here. */
  public ExampleSubsystem() {}

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
