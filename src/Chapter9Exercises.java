import javafx.scene.paint.Color;
import javafx.scene.paint.Stop;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Chapter9Exercises {



    public static void main(String[] args) {
        System.out.println("Choose Exercise number.");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();

        if (choise == 2) //Creating a stock as assigned in exercise 2, with the Stock class i created
        { Stock orcl = new Stock("ORCL","Oracle Corporation",34.5,34.35);
        orcl.getChangePercent();}

//Use Random to create a random object with seed 1000 and display first 50 ints between 0 - 100
        if (choise == 4)
          { Random randomObject = new Random(1000);
            System.out.println("From randomObject: ");
                  for (int i = 0; i < 50; i++)
                  { System.out.print(randomObject.nextInt(100) + " ");
                  //To make it easier too look at, i've added below to get 10 numbers pr line
                  if (i == 10 || i == 20 || i == 30 || i == 40)
                  {System.out.println();}
              }
          }

          if (choise == 6)
              //Designed my own StopWatch using the CurrenTime Function, which can be seen in StopWatch.java.
              //I've generated an array with 100000 ints from 0 to 9, and with the Arrays.sort method i've sorted numbers.
          {StopWatch sorting = new StopWatch();
              int[] numbers = new int[100000];
              for (int i = 0; i < 100000; i++)
              { numbers[i] = (int)(Math.random()*100); }
              sorting.start(); //Starting the StopWatch
              Arrays.sort(numbers); // Sorting Numbers
              sorting.stop(); //Ending StopWatch
              System.out.println(sorting.getElapsedTime() + " milliseconds ");
              System.out.println("To prove its sorted");
              System.out.println(numbers[3213] + " " + numbers[70000] + " " + numbers[99999]);
          }

          if (choise == 8)
              //This is the Fan class, with specified data fields and methods
          { Fan fan1 = new Fan();
              System.out.print("fan1: ");
           fan1.setSpeed(Fan.HIGH);
           fan1.setColor("YELLOW");
           fan1.setRadius(10);
           fan1.setOn(true);
           fan1.toStrings();
              System.out.println();

           Fan fan2 = new Fan();
              System.out.print("fan2: ");
           fan2.setSpeed(Fan.MEDIUM);
           fan2.toStrings();


          }


 else
        { System.out.println("☠☣ Invalid input ☣☠");}
    }
}
