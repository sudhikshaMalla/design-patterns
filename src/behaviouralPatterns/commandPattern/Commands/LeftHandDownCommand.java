package behaviouralPatterns.commandPattern.Commands;

import behaviouralPatterns.commandPattern.Robot;

public class LeftHandDownCommand implements Command {

    Robot robot;

    public LeftHandDownCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.setLeftHand(0);
    }
}