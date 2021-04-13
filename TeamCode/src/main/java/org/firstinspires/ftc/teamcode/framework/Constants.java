package org.firstinspires.ftc.teamcode.framework;

/*
  <------------INCLUDE LINE - NONSTANDARD-------------------------------->
    import static org.firstinspires.ftc.teamcode.framework.Constants.*;
  <---------------------------------------------------------------------->
*/

//This is where you'll put all the constants for your mechanisms and stuff. The framework constants are for Olympia and Olympia **ONLY**, you shouldn't touch them.
public class Constants {

    //Intake positions
    public static final double INTAKE_EXTENDED_POSITION = 1;
    public static final double INTAKE_RETRACTED_POSITION = 0;
    public static final double kIntakeRunPower = 1;

    //Storage positions
    public static final double STORAGE_EXTENDED_POSITION = 1;
    public static final double STORAGE_RETRACED_POSITION = 0;
    public static final double kStorageRunPower = 1;

    //Shooter Constants:
    public static final double kShooterLvl3Rpm = 0;
    public static final double kShooterPwrshtRpm = 0;
    public static final double kShooterRPMAdjustment = 5;

    public static final double kShooterP = 0;
    public static final double kShooterI = 0;
    public static final double kShooterD = 0;
    public static final double kShooterF = 0;

    public enum ShooterProfiles {
        LVL3,
        POWERSHOT
    }

    //For the getDistance method:
    public static final double kDrivetrainWheelDiameter = 96; //mm
    public static final double kYJacketTicksPerRevolution = 537.7;
    
    //Angle PID Values:
    public static final double kAngleP = 0;
    public static final double kAngleI = 0;
    public static final double kAngleD = 0;

    //IsFinished thresholds:
    public static final double kAngleFinishedThreshold = 1;
    public static final double kDistanceFinishedThreshold = 1;

    //Distance PID Values:
    public static final double kDistanceP = 0;
    public static final double kDistanceI = 0;
    public static final double kDistanceD = 0;

    //Offset PID Values:
    public static final double x_offset_kP = 0;
    public static final double x_offset_kI = 0;
    public static final double x_offset_kD = 0;
}
