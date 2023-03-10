// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  
  public static class DriveTrainConstants {
    public static final int PIGEON2_CAN_ID               = 9;
    public static final int LEFT_DRIVE_PRIMARY_CAN_ID    =10;
    public static final int LEFT_DRIVE_SECONDARY_CAN_ID  =11; 
    public static final int RIGHT_DRIVE_PRIMARY_CAN_ID   =12;
    public static final int RIGHT_DRIVE_SECONDARY_CAN_ID =13;

    public static final double DRIVE_WHEEL_DIAMETER       =6; 
    public static final double DRIVE_WHEEL_CIRC           =DRIVE_WHEEL_DIAMETER * Math.PI;
    public static final double GEAR_BOX_RATIO             =8.46;
    public static final double MOTOR_ENCODER_CPR          =42;
    public static final double WHEEL_CPR                  =GEAR_BOX_RATIO * MOTOR_ENCODER_CPR;
    public static final double DRIVE_CPI                  =WHEEL_CPR / DRIVE_WHEEL_CIRC; 


    public static final double OPEN_LOOP_RAMP_RATE        =1;
  }

  public static class OperatorConstants {
    public static final int kDriverControllerPort         = 0;
  }
}
