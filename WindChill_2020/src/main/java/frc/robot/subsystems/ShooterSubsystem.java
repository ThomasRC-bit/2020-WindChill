/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {

  private final PWMVictorSPX rightLaunchMotor = new PWMVictorSPX(4);
  private final PWMVictorSPX leftLaunchMotor = new PWMVictorSPX(5); 
  private final PWMVictorSPX conveyorMotor = new PWMVictorSPX(6); 

  /**
   * Creates a new ExampleSubsystem.
   */
  public ShooterSubsystem() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
