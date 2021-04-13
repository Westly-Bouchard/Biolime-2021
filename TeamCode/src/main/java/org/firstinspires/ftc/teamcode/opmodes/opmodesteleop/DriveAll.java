package org.firstinspires.ftc.teamcode.opmodes.opmodesteleop;

import org.firstinspires.ftc.teamcode.commands.actions.*;
import org.firstinspires.ftc.teamcode.commands.looped.*;

public class DriveAll extends TeleOpModeWrapper {

    public void teleOpInit() {
        scheduler.enableDebugTelemetry();
        scheduler.add(new ResetOdometry());
    }

    public void teleOpLoop() {
        scheduler.add(new UpdateDriveTrainValues());

        scheduler.add(new Drive(DriverLeftXAxis, DriverLeftYAxis, DriverRightXAxis));

        DriverRightBumper.whileHeld(new AngleAlign(timekeeper, DriverLeftXAxis, DriverLeftYAxis));
        DriverLeftBumper.whileHeld(new Shoot());

        OperatorBButton.whileHeld(new RunIntake());
        OperatorBButton.whileHeld(new RunStorage());

        OperatorDPadRight.whenPressed(new AdjustShooterRPM(false));
        OperatorDPadLeft.whenPressed(new AdjustShooterRPM(true));
        OperatorDPadUp.whenPressed(new ToggleShooterProfile());
        OperatorDPdDown.whenPressed(new ToggleShooterProfile());
    }
}
