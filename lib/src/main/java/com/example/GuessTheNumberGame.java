package com.example;
import java.util.*;

    public class GuessTheNumberGame
    {
        public static void main(String[] args)
        {
            Scanner userNumber = new Scanner(System.in);


            int computerNumber = (int) (Math.random() * 10 + 1);
            int myNumber;

            Boolean j = true;
            System.out.println("You get three chances to guess the number: ");

            for (int i = 0; i < 3; i++)
            {

                System.out.println("This is try number " + (i + 1) + ".\nPlease guess a number between 1 and 10: ");
                myNumber = userNumber.nextInt();

                if (myNumber > computerNumber)
                {
                    System.out.println("\nYour number is too high. Please try again.");

                }
                else if (myNumber < computerNumber)
                {
                    System.out.println("\nYour number is too low. Please try again.");

                }
                else
                {
                    System.out.println("\nCongratulations. You have guessed the number. You win a prize!!!!!!");
                    j = false;
                    break;
                }

            }

            if (j == true)

            {
                System.out.println("\nI am sorry. You did not guess the right number. You did not win the prize. ");

            }
        }

    }

