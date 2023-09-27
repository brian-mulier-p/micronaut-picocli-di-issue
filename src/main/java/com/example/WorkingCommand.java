package com.example;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.serde.ObjectMapper;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;

@Command(name = "picocli-working", description = "...",
    mixinStandardHelpOptions = true)
public class WorkingCommand extends InjectCommand {
    @Inject
    @Nullable
    private ObjectMapper mapper;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(WorkingCommand.class, args);
    }
}
