// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Vortex1;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class Vortex1Command extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Vortex1 vortex1;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public Vortex1Command(Vortex1 vortex1) {
    this.vortex1 = vortex1;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(vortex1);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    vortex1.run();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    vortex1.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
