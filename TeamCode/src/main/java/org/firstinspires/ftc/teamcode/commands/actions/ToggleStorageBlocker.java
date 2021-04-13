package org.firstinspires.ftc.teamcode.commands.actions;

import org.firstinspires.ftc.teamcode.commands.basecommands.Command;
import org.firstinspires.ftc.teamcode.mechanisms.Storage;
import org.firstinspires.ftc.teamcode.mechanisms.mechanismhandlers.MechanismEngine;

public class ToggleStorageBlocker extends Command {

    private Storage storage = MechanismEngine.getInstance().getMechanism(Storage.class);

    public ToggleStorageBlocker() { Requires(storage); }

    public void initialize() {}

    public void execute() { storage.toggle(); }

    public boolean isFinished() { return true; }

    public void end() {}
}
