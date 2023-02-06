import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String person[] = new String[1024];
        int c = 0, ch, x = 0;

        do {
            System.out.println("******************");
            System.out.println("1. Enter a name");
            System.out.println("2. Search for a name");
            System.out.println("3. Remove a name");
            System.out.println("4. Exit");
            System.out.println("******************");
            System.out.print("Enter choise which you want perform: ");
            ch = Integer.parseInt(scan.nextLine());
            String nm;
            int y = -1;

            switch (ch) {
                case 1:
                    System.out.print("1. Enter a name :");
                    nm = scan.nextLine();
                    for (int i = 0; i <= c; i++) {
                        if (c > 0 && person[i].equalsIgnoreCase(nm.toLowerCase())) {
                            System.out.print(nm + " Already Exist.......");
                            break;
                        } else {
                            if (y > 1) {
                                person[y] = nm.toLowerCase();
                                y = -1;
                            } else {
                                person[c] = nm.toLowerCase();
                                c = c + 1;
                            }

                        }
                    }
                    break;
                case 2:
                    System.out.print("2. Search for a name :");
                    nm = scan.nextLine();
                    for (int i = 0; i <= c; i++) {
                        if (person[i].equalsIgnoreCase(nm.toLowerCase())) {
                            System.out.print(nm + " is in person list......");
                            break;
                        } else {
                            System.out.print(nm + " is not in person list......");
                        }
                    }
                    break;
                case 3:
                    System.out.print("3. Remove a name: ");
                    nm = scan.nextLine();

                    for (int i = 0; i <= c; i++) {
                        if (person[i].equalsIgnoreCase(nm.toLowerCase())) {
                            person[i] = "";
                            y = i;
                        }

                    }
                    break;
                case 4:
                    System.out.print("4. Exit......");
                    x = x + 1;
                    break;

                default:
                    System.out.print("Invalid Choise");
                    break;
            }
        } while (x == 0);
        System.out.print("\n ******The list of all person given below** *** *");
        for (int z = 0; z < c; z++) {
            System.out.println(person[z]);

        }
    }
}
