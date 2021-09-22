import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
  playGame(int randomNum, int userNum);
  Random r = new Random();
  Scanner s = new Scanner(System.in);
    System.out.println("Give us a number");
    int userNum;
    userNum=s.nextInt();
    int randomNum= r.nextInt(userNum);
    System.out.println("A random number to guess has been generated:");

  }
}

public static int playGame(int guessNum, int originalNum) {


}