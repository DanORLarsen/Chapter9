import java.util.Scanner;

public class Chapter9Exercises {



    public static void main(String[] args) {
        System.out.println("Choose Exercise number.");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();



        if (choise == 2)
        { Stock orcl = new Stock("ORCL","Oracle Corporation",34.5,34.35);
        orcl.getChangePercent();}

        




 else
        { System.out.println("Invalid input");}
    }
}
