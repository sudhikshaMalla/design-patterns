package behaviouralPatterns.commandPattern.Commands;

import behaviouralPatterns.commandPattern.Robot;

public class LeftHandUpCommand implements Command {

    Robot robot;

    public LeftHandUpCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.setLeftHand(1);
    }
}