package org.firstinspires.ftc.teamcode.commands.looped;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.framework.controllers.Axis;
import org.firstinspires.ftc.teamcode.mechanisms.DriveTrain;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

public class Drive extends Command {

    private DriveTrain driveTrain = MechanismEngine.getInstance().getMechanism(DriveTrain.class);

    private Axis leftX, leftY, rightX;

    public Drive(Axis leftAxisX, Axis leftAxisY, Axis rightAxisX) {
        Requires(driveTrain);
        this.leftX = leftAxisX;
        this.leftY = leftAxisY;
        this.rightX = rightAxisX;
    }

    public void initialize() {}

    public void execute() {
        driveTrain.driveAll(leftX.get(), leftY.get(), rightX.get());
    }

    public boolean isFinished() { return false; }

    public void end() {}
}