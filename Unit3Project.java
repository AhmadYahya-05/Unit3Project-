/** *************
 * Project: Unit3Project
 * Programmer: Ahmad Yahya
 * Date: October 12
 * Program Name: Unit3Project.java
 ************** */
package unit3project;

import java.util.Scanner;

public class Unit3Project {

    public static void main(String[] args) {
//Declare Scanners
        Scanner scanN = new Scanner(System.in);
        Scanner scanS = new Scanner(System.in);

//Variables

        int num; String name; String answer; double year; 
        String yesno;

//Ask for name
        System.out.println("Please type your name:")
        name = scanS.nextLine();
        
        do {
            System.out.println("""
                   \nWelcome to Jeapordy, todays category is the Toronto Maple leafs,
                   select one of the followng dollar values 
                   200 400 600 800 1000""");
        num = scanN.nextInt();

//cases
        switch (num) {
            case 200: {
                System.out.println("\nWho is the current captain of the Toronto Maple Leafs?");
                answer = scanS.nextLine();

                if (answer.equalsIgnoreCase("John Tavares") || answer.equalsIgnoreCase("Tavares")) {
                    System.out.print("\nCorrect " + name + ",you win $200!");
                } else {
                    System.out.println("\nSorry " + name + ",the correct answer was John Tavares");
                }
            }

            break;

            case 400: {
                System.out.println("\nWho led the Toronto Maple Leafs in goals scored last season?");
                answer = scanS.nextLine();

                if (answer.equalsIgnoreCase("Auston Matthews") || answer.equalsIgnoreCase("Matthews")) {
                    System.out.print("\nNice " + name + ",you win $400!");
                } else {
                    System.out.println("\nIncorrect " + name + ",the correct answer was Auston Matthews");
                }

                break;
            }
            case 600: {
                System.out.println("\n When was the last year the Toronto Maple Leafs won the Stanley Cup?");
                year = scanN.nextDouble();
            }

            if (year == 1967) {
                System.out.print("\nWow " + name + ",you win $600!");
            } else {
                System.out.println("\nWrong " + name + ",the correct answer was 1967");
            }

            break;

            case 800: {
                System.out.println("\n What year were the Toronto Maple Leafs founded?");
                year = scanN.nextDouble();
            }

            if (year == 1917) {
                System.out.print("\nSuperb " + name + ",you win $800!");
            } else {
                System.out.println("\nSorry " + name + ",the correct answer was 1917");
            }

            break;

            case 1000: {
                System.out.println("\nWho is the only original six team the Leafs have not defeated in the Stanley Cup Final?");
                answer = scanS.nextLine();

                if (answer.equalsIgnoreCase("Boston Bruins") || answer.equalsIgnoreCase("Bruins") || answer.equalsIgnoreCase("Boston")) {
                    System.out.print("\nGreat Job " + name + "! You win $1000!");
                } else {
                    System.out.println("\nSorry " + name + ",the correct answer was the Boston Bruins");
                }

                break;
            }

            default: {
                System.out.println("Not a valid choice");
                break;

            }
        }
        
            System.out.println("Would you like to play again?");
            yesno = scanN.nextLine();
        
        
        
        } 
        
        
        while (true);
        
        
//Print block message
        
    }
}
