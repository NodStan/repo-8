package repo8;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        int ScoreInput = new Scanner(System.in).nextInt();
        if (ScoreInput >= 90){
            System.out.println("Your grade is A");
        }else if (ScoreInput >= 80 && ScoreInput <90){
            System.out.println("Your grade is B");
        } else if (ScoreInput >= 70 && ScoreInput <80) {
            System.out.println("Your grade is C");
        } else if (ScoreInput >= 60 && ScoreInput <70) {
            System.out.println("Your grade is D");
        } else if (ScoreInput <60) {
            System.out.println("Your grade is E");
        }
    }
}
