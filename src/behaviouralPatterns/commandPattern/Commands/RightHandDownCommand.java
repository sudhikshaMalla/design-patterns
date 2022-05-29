package behaviouralPatterns.commandPattern.Commands;

import behaviouralPatterns.commandPattern.Robot;

public class RightHandDownCommand implements Command{

    Robot robot;

    public RightHandDownCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.setRightHand(0);
    }
}