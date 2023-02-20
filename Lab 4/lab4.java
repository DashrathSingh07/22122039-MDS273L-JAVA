import java.util.Scanner;

public class lab4 {
    static Scanner scan = new Scanner(System.in);
    static int Account_Number = 22122039;
    static String Account_Holder_Name = "Dashrath Singh";
    static int Account_Balance = 23500;

    public static void main(String[] args) {
        int x = 0, c = 0;
        String a;
        String[][] transactions = new String[1024][3];
        String[] ac = new String[3];
         
                    // ac = initialize_the_customer();
                    // Account_Number = Integer.parseInt(ac[0]);
                    // Account_Holder_Name = ac[1];
                    // Account_Balance = Integer.parseInt(ac[2]);
        System.out.println("\n--------------- Account Details ---------------");
        System.out.print("A/c Number: "+Account_Number);
       
        System.out.print("A/c Holder Name: "+Account_Holder_Name);
        
        System.out.print("A/c Balance: "+Account_Balance);
       


              
        do {

            System.out.println("\n--------------- Your choices ---------------");
            System.out.println(
                    "\n1. To deposit money \n2. To withdraw money \n3. To print the transactions \n4. To print account summary \n5. Exit");
            System.out.print("Enter your choice: ");
            int key = Integer.parseInt(scan.nextLine());

            switch (key) {
               
                case 1:
                    transactions[c] = depositmoney();
                    System.out.println("Account balance deposit succesfully\nBalance: " + Account_Balance);
                    c = c + 1;
                    break;
                case 2:
                    transactions[c] = withdrawmoney();
                    System.out.println("Account balance withdraw succesfully\nBalance: " + Account_Balance);
                    c = c + 1;
                    break;
                case 3:
                    a = printthetransactions(transactions,c);
                    a="";
                    break;
                case 4:
                    a=summary();
                    break;
                case 5:
                    x = 1;
                    break;

                default:
                    break;
            }

        } while (x != 1);

    }

    // static String[] initialize_the_customer() {
    // String[] arr = new String[3];
    // System.out.println("\n--------------- Account Details ---------------");
    // System.out.print("Enter A/c Number: ");
    // arr[0] = scan.nextLine();
    // System.out.print("Enter A/c Holder Name: ");
    // arr[1] = scan.nextLine();
    // System.out.print("Enter A/c Balance: ");
    // arr[2] = scan.nextLine();

    // return arr;
    // }

    static String[] depositmoney() {
        String[] tr = new String[3];
        tr[0] = "Deposit";
        System.out.println("\n---------------- Deposit Money ----------------");
        System.out.println("Your Current Balance: " + Account_Balance);
        System.out.print("How much money want to deposit: ");
        String bl = scan.nextLine();
        tr[1] = bl;
        Account_Balance = Account_Balance + Integer.parseInt(bl);
        tr[2] = Integer.toString(Account_Balance);
        return tr;
    }

    static String[] withdrawmoney() {
        String[] tr = new String[3];
        tr[0] = "Withdraw";
        System.out.println("\n---------------- Withdraw Money ----------------");
        System.out.println("Your Current Balance: " + Account_Balance);
        System.out.print("How much money want to withdraw: ");
        String bl = scan.nextLine();
        tr[1] = bl;
        Account_Balance = Account_Balance - Integer.parseInt(bl);
        tr[2] = Integer.toString(Account_Balance);
        return tr;
    }

    static String printthetransactions(String[][] arr, int c) {
        System.out.println("\n---------------- Transaction ----------------");
        System.out.print("Transaction ");
        System.out.print("\ttype: ");
        System.out.print("\t\tBalance: ");
        System.out.print("\tAvailable Balance: ");

        for (int i = 0; i < c; i++) {
            System.out.print("\n\t" + (i + 1) + "\t" + arr[i][0]);
            if (arr[i][0].equalsIgnoreCase("Deposit")) {
                System.out.print("\t\t" + arr[i][1] + " \tcr\t" + arr[i][2]);

            } else {
                System.out.print("\t" + arr[i][1] + "\tdr\t" + arr[i][2]);
            }

        }

        return "true";
    }

    static String summary() {
        System.out.println("\n---------------- Account Summary ----------------");
        System.out.println("\n Account No.: " + Account_Number + "\n Account Holder Name : " + Account_Holder_Name
                + "\n Available Account Balance : " + Account_Balance);
        return "true";
    }

}
