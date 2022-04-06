package day11_Switch_Scanner;

public class CydeoBatches {
    public static void main(String[] args) {
        String[]batches={"US morning", "US evening", "EU"};
      for(int i=0;i<=2;i++) {
          if (batches[i].equals("US morning")) {
              System.out.println("Class times are 10-5 EST. M, T, Th, F.");
          } else if (batches[i].equals("US evening")) {
              System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");

          } else if (batches[i].equals("EU")) {
              System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
          } else {
              System.out.println("invalid");
          }

          switch(batches[i]){
              case "US morning":
                  System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                  break;
              case "US evening":
                  System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                  break;
              case "EU":
                  System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
                  break;
              default:
                  System.out.println("invalid");


          }
          if(batches[i] != "0"){
              switch(batches[i]){
                  case "US morning":
                      System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                      break;
                  case "US evening":
                      System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                      break;
                  case "EU":
                      System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
                      break;
                  default:
                      System.out.println("invalid");


              }

          }
      }
      }

}
