package behaviouralPatterns.commandPattern;

import behaviouralPatterns.commandPattern.Commands.LeftHandDownCommand;
import behaviouralPatterns.commandPattern.Commands.LeftHandUpCommand;
import behaviouralPatterns.commandPattern.Commands.RightHandDownCommand;
import behaviouralPatterns.commandPattern.Commands.RightHandUpCommand;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        Remote remote = new Remote();

        remote.setButton(1, new LeftHandDownCommand(robot));
        remote.setButton(2, new LeftHandUpCommand(robot));
        remote.setButton(3, new RightHandDownCommand(robot));
        remote.setButton(4, new RightHandUpCommand(robot));

        remote.pressButton(4);
        remote.pressButton(2);
        remote.pressButton(1);
        remote.pressButton(3);

    }
}