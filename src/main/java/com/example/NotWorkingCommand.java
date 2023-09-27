package com.example;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;

@Command(name = "picocli-not-working", description = "...",
    mixinStandardHelpOptions = true)
public class NotWorkingCommand extends InjectCommand {
    public static void main(String[] args) throws Exception {
        PicocliRunner.run(NotWorkingCommand.class, args);
    }
}
