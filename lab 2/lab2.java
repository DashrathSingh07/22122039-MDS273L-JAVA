import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String person[] = new String[1024];
        int c = 0, ch, x = 0;

        do {
            System.out.println("\n******************");
            System.out.println("1. Enter a name");
            System.out.println("2. Search for a name");
            System.out.println("3. Remove a name");
            System.out.println("4. Show person");
            System.out.println("5. Exit");
            System.out.println("******************");
            System.out.print("Enter choise which you want perform: ");
            ch = Integer.parseInt(scan.nextLine());
            String nm;
            int y = -1;
            int a = 0;
            int flag = 1;
            switch (ch) {

                case 1:
                    System.out.print("1. Enter a name : ");
                    nm = scan.nextLine();
                    if(person[0]!=null){
                        for (int i = 0; i < c; i++) {
                            if (person[i].compareToIgnoreCase(nm) == 0) {
                                System.out.print(person[i] + " Already Exist.......");
                                flag = 0;
                                break;
                            }
                        }
                        if (flag == 1) {
                            for (int i=0 ;i<person.length;i++) {
                                if(person[i]==null){
                                    person[i] = nm;
                                    break;
                                }
                                
                            }
                            
                            break;
                        }
                    }else{
                        person[0]=nm;
                        break;
                    }
                    break;
                    
                case 2:
                    System.out.print("2. Search for a name : ");
                    nm = scan.nextLine();
                    for (int i = 0; i < person.length; i++) {
                        if (person[i].equalsIgnoreCase(nm)) {
                            System.out.print(nm + " is in person list......");
                            a = 0;
                            break;
                        } else {
                            a = a + 1;
                        }
                    }
                    if (a >= 1) {
                        System.out.print(nm + " is not in person list......");
                    }
                    break;
                case 3:
                    System.out.print("3. Remove a name: ");
                    nm = scan.nextLine();

                    for (int i = 0; i < person.length; i++) {
                        if (person[i] != null) {
                            if (person[i].equalsIgnoreCase(nm.toLowerCase())) {
                                for (int j = i; j < person.length - 1; j++) {
                                    person[j] = person[j + 1];
                                    c = c - 1;
                                }

                            }
                        }
                    }
                    break;
                case 4:
                    for (int z = 0; z < person.length; z++) {
                        if (person[z] != null) {
                            System.out.print(person[z]+",");
                        }
                    }
                    break;
                case 5:
                    System.out.print("4. Exit......");
                    x = x + 1;
                    break;

                default:
                    System.out.print("Invalid Choise");
                    break;
            }
        } while (x == 0);

    }
}
