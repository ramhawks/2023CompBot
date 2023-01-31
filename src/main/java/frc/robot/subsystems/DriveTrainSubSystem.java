// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSubSystem extends SubsystemBase {

public static double OPEN_LOOP_RAMP_RATE =1;

private static final CANSparkMax leftPrimary    = new CANSparkMax(Constants.DriveTrainConstants.LEFT_DRIVE_PRIMARY_CAN_ID, MotorType.kBrushless);
private static final CANSparkMax leftSecondary  = new CANSparkMax(Constants.DriveTrainConstants.LEFT_DRIVE_SECONDARY_CAN_ID, MotorType.kBrushless);
private static final CANSparkMax rightPrimary   = new CANSparkMax(Constants.DriveTrainConstants.RIGHT_DRIVE_PRIMARY_CAN_ID, MotorType.kBrushless);
private static final CANSparkMax rightSecondary = new CANSparkMax(Constants.DriveTrainConstants.RIGHT_DRIVE_SECONDARY_CAN_ID, MotorType.kBrushless);


  public DriveTrainSubSystem() {
    leftPrimary.restoreFactoryDefaults();   leftSecondary.restoreFactoryDefaults();
    rightPrimary.restoreFactoryDefaults();  rightSecondary.restoreFactoryDefaults();

    leftPrimary.setIdleMode(IdleMode.kCoast);  leftSecondary.setIdleMode(IdleMode.kCoast);
    rightPrimary.setIdleMode(IdleMode.kCoast); rightSecondary.setIdleMode(IdleMode.kCoast);

    leftSecondary.follow(leftPrimary); rightSecondary.follow(rightPrimary);

    leftPrimary.setOpenLoopRampRate(OPEN_LOOP_RAMP_RATE); rightPrimary.setOpenLoopRampRate(OPEN_LOOP_RAMP_RATE);

    leftPrimary.getEncoder(); rightPrimary.getEncoder();

    leftPrimary.burnFlash(); leftSecondary.burnFlash();
    rightPrimary.burnFlash(); rightSecondary.burnFlash(); 
    

  }

  public static void GTA_Drive(double leftPower, double rightPower, double turn) {
    leftPrimary.setOpenLoopRampRate(OPEN_LOOP_RAMP_RATE); rightPrimary.setOpenLoopRampRate(OPEN_LOOP_RAMP_RATE); 
    setMotors((rightPower - leftPower) - turn, (rightPower - leftPower) + turn);
  }

  public static void setMotors(double leftPower, double rightPower){
    leftPrimary.set(leftPower); rightPrimary.set(rightPower);

  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
