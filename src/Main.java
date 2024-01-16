import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gasoline = 0;
        int alcohol = 0;
        int diesel = 0;
        int total = 0;
        System.out.println("*******************************");
        System.out.println("|  WELCOME TO GAS STATION COUNTER |");
        System.out.println("*******************************");
        System.out.println("|  SELECT THE FUEL THAT YOU USE  |");
        System.out.println("|-------------------------------|");
        System.out.println("| 1- Gasoline                   |");
        System.out.println("| 2- Alcohol                    |");
        System.out.println("| 3- Diesel                     |");
        System.out.println("| 4- Exit the program           |");
        System.out.println("*******************************");
        System.out.print("Enter your choice: ");
        int type = sc.nextInt();

        while (type != 4) {
            if (type == 1) {
                gasoline++;
            } else if (type == 2) {
                alcohol++;
            } else if (type == 3) {
                diesel++;
            }
            total++;
            System.out.print("Enter your choice: ");
            type = sc.nextInt();
        }
        System.out.println("*******************************");
        System.out.println("|          THANK YOU           |");
        System.out.println("|   THERE'S THE RESULTS :      |");
        System.out.println("|-----------------------------|");
        System.out.println("|   GASOLINE: " + gasoline + "         |");
        System.out.println("|   ALCOHOL:  " + alcohol + "         |");
        System.out.println("|   Diesel:   " + diesel + "         |");
        System.out.println("|-----------------------------|");
        System.out.println("|   Total votes: " + total + "       |");
        System.out.println("*******************************");
        sc.close();
    }

}