package org.firstinspires.ftc.teamcode.commands.looped;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.mechanisms.Storage;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

public class Shoot extends Command {

    private Storage storage = MechanismEngine.getInstance().getMechanism(Storage.class);

    public void initialize() {
        Requires(storage);
        storage.retract();
    }

    public void execute() { storage.setMotorPower(1); }

    public boolean isFinished() { return false; }

    public void end() { storage.extend(); }
}
