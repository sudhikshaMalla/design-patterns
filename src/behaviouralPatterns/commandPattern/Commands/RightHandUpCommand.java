package behaviouralPatterns.commandPattern.Commands;

import behaviouralPatterns.commandPattern.Robot;

public class RightHandUpCommand implements Command {

    Robot robot;

    public RightHandUpCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.setRightHand(1);
    }
}