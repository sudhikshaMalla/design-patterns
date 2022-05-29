package behaviouralPatterns.commandPattern;

import behaviouralPatterns.commandPattern.Commands.Command;

public class Remote {

    Command[] commands;

    public Remote() {
        commands = new Command[4];
    }

    public void setButton(int index, Command command) {
        commands[index-1] = command;
    }

    public void pressButton(int index) {
        commands[index-1].execute();
    }
}