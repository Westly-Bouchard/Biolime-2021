package org.firstinspires.ftc.teamcode.commands.actions;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.mechanisms.Storage;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

public class ExtendServoBlocker extends Command {
    private Storage storage = MechanismEngine.getInstance().getMechanism(Storage.class);

    public ExtendServoBlocker() { Requires(storage); }

    public void initialize() {}

    public void execute() { storage.extend(); };

    public boolean isFinished() { return true; }

    public void end() {}
}
