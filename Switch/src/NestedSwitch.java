import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empId= in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Hey Istiak");
            case 2 -> System.out.println("Hey Mahi");
            case 3 -> {
                System.out.println("Hey Lazy");
                switch (department) {
                    case "IT" -> System.out.println("Hey IT");
                    case "Management" -> System.out.println("Hey Manger");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("No empID");
        }
    }
}
