package org.firstinspires.ftc.teamcode.commands.actions;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.mechanisms.Intake;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

public class FlipIntake extends Command {

    private Intake intake = MechanismEngine.getInstance().getMechanism(Intake.class);

    public FlipIntake() { Requires(intake); }

    public void initialize() {}

    public void execute() { intake.toggle(); }

    public boolean isFinished() { return true; }

    public void end() {}
}
