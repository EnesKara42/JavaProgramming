package day11_Switch_Scanner;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 3;
        if (floorNum == 1 || floorNum == 2 || floorNum == 3) {
            if (floorNum == 1) {
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            } else if (floorNum == 2) {
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            } else {
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }

        } else {
            System.out.println("Invalid floor - 6");
        }

        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;

            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;


            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;

            default:
                System.out.println("Invalid floor - 6");

        }
        if (floorNum==0 || floorNum!=0) {
            switch (floorNum) {
                case 1:
                    System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                    break;

                case 2:
                    System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                    break;


                case 3:
                    System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                    break;

                default:
                    System.out.println("Invalid floor - 6");

            }

        }
    }
}
