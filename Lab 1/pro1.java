import java.util.Scanner;

/*Write a Java Program that will collect an employee's basic details that fall into different data types and displays them.
After the details have been displayed, with the help of conditional statements, check if the gender of the employee is 'm' or 'f'. It should print "MALE" for 'm' and "FEMALE" for 'f'.
Assume that you can divide the states among India into different regions (North, South, Central, East, and West). If the employee is from the southern part of India, with the help of a switch statement, it should display "The Employee is from the southern states of India; Preferable work location is in <state>", along with the basic details.
Identify if the employee belongs to the top MNC Companies (Facebook, Google, Microsoft, Samsung, IBM, Apple); if so, print a message "The employee is working in Top MNC Companies".
*/
public class pro1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*****Enter the basic details of employee.******");
        System.out.print("Enter name of Employee: ");
        String emp_Name = scan.nextLine();
        System.out.print("Enter Gender of Employee: ");
        String gender = scan.nextLine();
        System.out.print("Enter Age of Employee: ");
        int Age = Integer.parseInt(scan.nextLine());
        System.out.print("Enter Mobile No. of Employee: ");
        String mobile = scan.nextLine();
        System.out.print("Enter Salary of Employee: ");
        int salary = Integer.parseInt(scan.nextLine());
        System.out.print("Enter State of Employee: ");
        String state = scan.nextLine();
        System.out.print("Enter Company name of Employee: ");
        String company = scan.nextLine();

        System.out.println("*****The basic details of employee is given below.******");
        System.out.println("Name of Employee: " + emp_Name);
        System.out.println("Gender of Employee: " + gender);
        System.out.println("Age of Employee: " + Age);
        System.out.println("Mobile No. of Employee: " + mobile);
        System.out.println("Salary of Employee: " + salary);
        System.out.println("Region of Employee: " + state);
        System.out.println("Company name of Employee: " + company);
        System.out.println("***********************************************************************");

        if (gender.compareToIgnoreCase("M") == 0) {
            System.out.println("Employee gender is: MALE");
        } else if (gender.compareToIgnoreCase("f") == 0) {
            System.out.println("Employee gender is: FEMALE");
        } else {
            System.out.println("Employee gender is not valid");
        }
        System.out.println("***********************************************************************");
        switch (state) {
            case "Arunachal Pradesh", "Assam", "Meghalaya", "Manipur", "Mizoram", "Nagaland", "Tripura", "Sikkim":
                System.out.println(
                        "The Employee is from the Northeastern states of India; Preferable work location is in " + state
                                + ".");
                break;
            case "Rajasthan", "Uttar Pradesh", "Ladakh", "Himachal Pradesh", "Uttarakhand", "Punjab", "Haryana",
                    "Jammu and Kashmir", "	Delhi", "Chandigarh":
                System.out.println("The Employee is from the Northern states of India; Preferable work location is in "
                        + state + ".");

                break;
            case "Karnataka", "Tamil Nadu", "Andhra Pradesh", "Telangana", "Kerala", "Puducherry":
                System.out.println("The Employee is from the southern states of India; Preferable work location is in "
                        + state + ".");
                break;
            case "Maharashtra", "Gujarat", "Goa", "Dadra and Nagar Haveli and Daman and Diu":
                System.out.println("The Employee is from the Western states of India; Preferable work location is in "
                        + state + ".");
                break;
            case "Jharkhand", "West Bengal", "Bihar", "Odisha":
                System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "
                        + state + ".");
                break;
            case "Chhattisgarh", "Madhya Pradesh":
                System.out.println("The Employee is from the Central states of India; Preferable work location is in "
                        + state + ".");
                break;
            default:
                break;
        }
        System.out.println("***********************************************************************");
        if (company.compareToIgnoreCase("Facebook") == 0 || company.compareToIgnoreCase("Google") == 0
                || company.compareToIgnoreCase("Microsoft") == 0 || company.compareToIgnoreCase("Samsung") == 0
                || company.compareToIgnoreCase("IBM") == 0 || company.compareToIgnoreCase("Apple") == 0) {
            System.out.println("The employee is working in Top MNC Companies.");
        }
        System.out.println("**************************** The End *******************************************");

    }

}
