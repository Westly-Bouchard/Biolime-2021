package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.teamcode.framework.Constants;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.Mechanism;

public class Shooter extends Mechanism {

    private DcMotorEx motor1, motor2;

    private Constants.ShooterProfiles currentProfile;

    private double rpmSpeedAdjust = 0;

    private double RPMtoAngleUnits(double RPM) {
        return RPM * 28 / 60;
    }

    public void init(HardwareMap hwMap) {
        motor1 = hwMap.get(DcMotorEx.class, "shooter1");
        motor2 = hwMap.get(DcMotorEx.class, "shooter2");

        motor1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor2.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motor1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        motor1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);

        currentProfile = Constants.ShooterProfiles.LVL3;
    }

    public void setPIDCoefficients(double P, double I, double D, double F) {
        motor1.setVelocityPIDFCoefficients(P, I, D, F);
        motor2.setVelocityPIDFCoefficients(P, I, D, F);
    }

    public void setSpeed(double speed) {
        motor1.setVelocity(RPMtoAngleUnits(speed));
        motor2.setVelocity(RPMtoAngleUnits(speed));
    }

    public void setProfSpeed() {
        if (currentProfile == Constants.ShooterProfiles.LVL3) {
            setSpeed(Constants.kShooterLvl3Rpm + rpmSpeedAdjust);
        } else {
            setSpeed(Constants.kShooterPwrshtRpm + rpmSpeedAdjust);
        }
    }

    public void changeRPMAdjustment(double amt) {
        this.rpmSpeedAdjust += amt;
    }

    public void resetRPMAdjustment() { this.rpmSpeedAdjust = 0; }

    public void toggleProfile() {
        if (currentProfile == Constants.ShooterProfiles.LVL3) {
            currentProfile = Constants.ShooterProfiles.POWERSHOT;
        } else {
            currentProfile = Constants.ShooterProfiles.LVL3;
        }
    }

    public double getCurrentRPMTarget() {
        return currentProfile == Constants.ShooterProfiles.LVL3 ? Constants.kShooterLvl3Rpm : Constants.kShooterPwrshtRpm;
    }
}
