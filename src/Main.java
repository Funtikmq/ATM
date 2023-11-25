import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        int atmNumber= 12345;
        int atmPin =123;

        Operation operation = new Implementation();

        System.out.println("WELCOME!");
        System.out.print("Enter Your Number: ");
        int number = scanner.nextInt();
        System.out.print("Enter Your Pin: ");
        int pin = scanner.nextInt();
        if((atmNumber==number)&&(atmPin==pin))
        {
            System.out.print("1.Check The Balance\n2.Deposit\n3.Withdraw\n4.Statement\n5.Exit\n");
            while (true){
                System.out.println("Select the operation: ");
                int option = scanner.nextInt();
                switch (option){
                    case 1: operation.check();
                    break ;
                    case 2:
                        System.out.print("Enter The Amount To Deposit: ");
                        double deposit = scanner.nextDouble();
                        operation.deposit(deposit);
                    break ;
                    case 3:
                        System.out.print("Enter The Amount To Withdraw: ");
                        double withdraw = scanner.nextDouble();
                        operation.withdraw(withdraw);
                    break ;
                    case 4:operation.statement();
                    break;
                    case 5:
                        System.out.println("Take Your Card");
                        System.out.println("Thank You For Using Our Services");
                        System.exit(0);
                    break;
                    default:
                        System.out.println("Select one of existing options");
                }
            }
        }
        else {
            System.out.println("The Account Number Or Pin Are Wrong!");
        }



        }

    }

