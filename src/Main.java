import java.util.Scanner;

public class Main {
    public static final int MIN_VALUE_OF_DAY = 1;
    public static final int MAX_VALUE_OF_DAY = 31;
    public static final int MIN_VALUE_OF_MONTH = 1;
    public static final int MAX_VALUE_OF_MONTH = 12;
    public static final int MIN_VALUE_OF_YEAR = 1900;
    public static final int CURRENT_YEAR = 2020;
    public static Town town=new Town();
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new household");
            System.out.println("2. Display household that has longgity perso");
            System.out.println("0. Exit");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("enter the number of household you want to add");
                    int numberOfHousehold=Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < numberOfHousehold; i++) {
                        addNewHoushold();
                    }
                    break;
                case 2:
                    town.displayHouseholdHasLongityPerson();
                    break;
                case 0:
            }
        }while (choice!=0);

    }
    public static void addNewHoushold(){
        System.out.println("enter house number");
        int houseNumber=Integer.parseInt(scanner.nextLine());
        System.out.println("enter number of person in household");
        int numberOfPerson =Integer.parseInt(scanner.nextLine());
        Household household=new Household(numberOfPerson,houseNumber);
        addNewPerson(numberOfPerson, household);
        town.addNewHousehlod(household);
    }

    private static void addNewPerson(int numberOfPerson, Household household) {
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println("enter name");
            String name=scanner.nextLine();
            int dayOfBirth;
            do {
                System.out.println("enter day of bith");
                dayOfBirth =Integer.parseInt(scanner.nextLine());
            }while (dayOfBirth< MIN_VALUE_OF_DAY &&dayOfBirth> MAX_VALUE_OF_DAY);
            int monthOfBirth;
            do {
                System.out.println("enter month of birth");
                monthOfBirth =Integer.parseInt(scanner.nextLine());
            }while (monthOfBirth< MIN_VALUE_OF_MONTH &&monthOfBirth> MAX_VALUE_OF_MONTH);
            int yearOfBirth;
            do {
                System.out.println("enter year of birth");
                yearOfBirth =Integer.parseInt(scanner.nextLine());
            }while (yearOfBirth< MIN_VALUE_OF_YEAR &&yearOfBirth> CURRENT_YEAR);
            System.out.println("enter job");
            String job=scanner.nextLine();
            Person person =new Person(name,dayOfBirth,monthOfBirth,yearOfBirth,job);
            household.addNewPerson(person);
        }
    }
}
