package org.firstinspires.ftc.teamcode.commands.actions;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.mechanisms.Shooter;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

public class ToggleShooterProfile extends Command {
    public Shooter shooter = MechanismEngine.getInstance().getMechanism(Shooter.class);

    public ToggleShooterProfile() { Requires(shooter); }

    public void initialize() {}

    public void execute() { shooter.toggleProfile(); }

    public boolean isFinished() { return true; }

    public void end() {}
}
