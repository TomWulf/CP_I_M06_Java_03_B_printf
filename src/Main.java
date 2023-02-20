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

        System.out.printf("Hello to %25s!\n", userName1);
        System.out.printf("Hello to %-25s!", userName1);

        System.out.println();

        System.out.printf("%-25s (Age: %3d)\n", userName1, age1);

        System.out.println();

        System.out.printf("%-25s (Age: %3d)\n", userName1, age1);
        System.out.printf("%-25s (Age: %3d)\n", userName2, age2);
        System.out.printf("%-25s (Age: %3d)\n", userName3, age3);
        System.out.printf("%-25s (Age: %3d)\n", userName4, age4);




    }
}