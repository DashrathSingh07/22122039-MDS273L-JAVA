import java.util.Scanner;

/**
 * lab3
 */
public class lab3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = 0;// initialize conditional variable it is used to exit do while loop
        String[][] st = new String[5][5]; // initialize two D array

        // start do while loop for infinite time choice till user do not want to exit
        do {
            // Create menu driven options
            System.out.println("\n ********* WELCOME *********");
            System.out.println(
                    "Your choices \n  1. Collect the details\n  2. Display the details\n  3. Search the student \n  4. Exit");
            System.out.print("Enter your choice: ");
            int ch;
            ch = Integer.parseInt(scan.nextLine()); // user choice
            switch (ch) {
                case 1:
                    st = Collectdetails(); // calling Collectdetails mathod with no argument
                    break;
                case 2:
                    Displaydetails(st);// calling Displaydetails mathod with argument
                    break;
                case 3:
                    Searchdetails(st); // condition
                    break;
                case 4:
                    a = a + 1; // condition
                    break;

                default:
                    System.out.print("invalid Choise.........");
                    break;
            }
        } while (a == 0); // end while loop

    }

    // start Collectdetails mathod to collect data of student
    static String[][] Collectdetails() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many students you want to enter: ");
        int x = Integer.parseInt(scan.nextLine());

        String[][] arr = new String[x][6];
        for (int i = 0; i < x; i++) {
            System.out.println("\n....... Enter Details of student " + (i + 1) + " ...");
            System.out.print("Enter Name: ");
            arr[i][0] = scan.nextLine();
            System.out.print("Enter Register No.: ");
            arr[i][1] = scan.nextLine();
            System.out.print("Enter Email: ");
            arr[i][2] = scan.nextLine();
            System.out.print("Enter Class: ");
            arr[i][3] = scan.nextLine();
            System.out.print("Enter Department: ");
            arr[i][4] = scan.nextLine();

        }
        return arr;

    }

    // start Displaydetails mathod to display data of student
    static void Displaydetails(String[][] arr) {
        // Scanner scan=new Scanner(System.in);
        System.out.println("\n\n ...The Students details is given below...");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\n*************** Student " + (i + 1) + " Details ***************");
            System.out.println("\t Name: " + arr[i][0]);
            System.out.println("\t Register No.: " + arr[i][1]);
            System.out.println("\t Email: " + arr[i][2]);
            System.out.println("\t Class: " + arr[i][3]);
            System.out.println("\t Department: " + arr[i][4]);
        }

    }

    static void Searchdetails(String[][] arr) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Search Name: ");
        String nm = scan.nextLine();
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0].equalsIgnoreCase(nm)) {
                System.out.println("\n*************** Student " + nm + " Details ***************");
                System.out.println("\t Name: " + arr[i][0]);
                System.out.println("\t Register No.: " + arr[i][1]);
                System.out.println("\t Email: " + arr[i][2]);
                System.out.println("\t Class: " + arr[i][3]);
                System.out.println("\t Department: " + arr[i][4]);
                a = 1;
            }
        }
        if (a == 0) {
            System.out.println(nm + " Student ont found.....");
        }

    }

}