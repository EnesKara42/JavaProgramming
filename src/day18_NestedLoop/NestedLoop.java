package day18_NestedLoop;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+"Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((i+6)+"Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((i+11)+"Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((i+16)+"Wooden Spoon");
        }

        System.out.println("-------------------------------------------------");
        int y=1;

        for (int j = 0; j < 20; j++) { // j: 0, 1, 2, 3

            for (int i = 0; i < 5; i++) { //i: 0,1,2,3,4
                System.out.println((y++)+"Wooden Spoon");
            }

        }




    }

}