package risk.utils.command;

import java.util.Arrays;

public class Command {

    public String original;
    protected String commandName;
    protected String[] parameters;

    /**
     * parses the command
     */
    public Command(String cmd) {
        this.original = cmd;
        String[] words = cmd.split("\\s+");
        this.commandName = words[0];
        this.parameters = Arrays.copyOfRange(words, 1, words.length);
    }

    public String getCommandName() {
        return this.commandName;
    }

    public String[] getParameters() {
        return this.parameters;
    }

    @Override
    public String toString() {
        String params = this.parameters[0] != null ? this.parameters[0] : "";
        for (int i = 1; i < this.parameters.length; i++) {
            params += ", " + this.parameters[i];
        }
        return this.commandName + "->" + params;
    }
}
