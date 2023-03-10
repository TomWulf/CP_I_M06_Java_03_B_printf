public class Main
{
    public static void main(String[] args)
    {
        String userName1 = "The Wizardly Tom Wulf";
        String userName2 = "The Marvelous Ms. Chou";
        String userName3= "The Devious Dexter Blake";
        String userName4 = "The Willful Buffy Summers";

        int age1 = 65;
        int age2 = 45;
        int age3 = 13;
        int age4 = 23;

        double favCost1 = 23.50;
        double favCost2 = 123.50;
        double favCost3 = 423.50;
        double favCost4 = 263.50;

        System.out.printf("Hello to %25s!\n", userName1);
        System.out.printf("Hello to %-25s!", userName1);

        System.out.println();

        System.out.printf("%-25s (Age: %3d)\n", userName1, age1);

        System.out.println();

        System.out.printf("%-25s (Age: %3d)\n", userName1, age1);
        System.out.printf("%-25s (Age: %3d)\n", userName2, age2);
        System.out.printf("%-25s (Age: %3d)\n", userName3, age3);
        System.out.printf("%-25s (Age: %3d)\n", userName4, age4);

        System.out.println();

        System.out.printf("%-25s (Age: %3d) Fav: %6.2f\n", userName1, age1, favCost1);
        System.out.printf("%-25s (Age: %3d) Fav: %6.2f\n", userName2, age2, favCost2);
        System.out.printf("%-25s (Age: %3d) Fav: %6.2f\n", userName3, age3, favCost3);
        System.out.printf("%-25s (Age: %3d) Fav: %6.2f\n", userName4, age4, favCost4);

        double salary = 123.23456;
        String salaryDisplay = String.format("%10.2f", salary);

        System.out.println("Salary is: " + salaryDisplay);
    }
}