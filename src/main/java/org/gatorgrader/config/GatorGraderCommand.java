package org.gatorgrader.config;

import org.gatorgrader.Command;

import java.util.Arrays;
import java.util.List;

/**
 * GatorGraderCommand automatically adds the python and gatorgrader path to the beginning of the
 * command.
 */
public class GatorGraderCommand extends Command {
    static String pythonPath;
    static String gatorgraderPath;

    static {
        pythonPath      = "python3";
        gatorgraderPath = "gatorgrader/gatorgrader.py";
    }

    public GatorGraderCommand(String... command) {
        this(Arrays.asList(command));
    }

    public GatorGraderCommand(List<String> command) {
        super(pythonPath, gatorgraderPath);
        command.addAll(command);
    }
}
