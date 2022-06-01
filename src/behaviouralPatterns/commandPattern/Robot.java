package behaviouralPatterns.commandPattern;

public class Robot {
    int leftHand;
    int rightHand;

    public Robot() {
        printRobot();
    }

    public void setLeftHand(int leftHand) {
        this.leftHand = leftHand;
        printRobot();
    }

    public void setRightHand(int rightHand) {
        this.rightHand = rightHand;
        printRobot();
    }

    private void printRobot() {
        System.out.println();
        System.out.println("(* *)");
        System.out.println("  |  ");
        System.out.print(" ");
        if(leftHand == 1) {
            System.out.print("\\");
        }
        else {
            System.out.print("/");
        }
        System.out.print("|");
        if(rightHand == 1) {
            System.out.print("/");
        }
        else {
            System.out.print("\\");
        }
        System.out.println();
        System.out.println("  |  ");
        System.out.println(" / \\ ");
    }

}