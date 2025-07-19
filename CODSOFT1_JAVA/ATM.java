import java.util.*;
class ATM {
    BankAccount account;
    Scanner sc = new Scanner(System.in);

    ATM(BankAccount account){
        this.account = account;
    }

    public void start(){
        while(true){
            System.out.println("\n======= ATM MENU =======");
            System.out.println("1. CHECK BALANCE ");
            System.out.println("2. DEPOSIT ");
            System.out.println("3. WITHDRAW ");
            System.out.println("4. EXIT ");
            System.out.print("CHOOSE AN OPTION: ");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("CURRENT BALANCE: " + account.checkBalance());
                    break;

                case 2:
                    System.out.print("ENTER AMOUNT TO BE DEPOSITED: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("ENTER AMOUNT TO BE WITHDRAWN: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("THANK YOU!!!");
                    return;

                default:
                    System.out.println("INVALID INPUT");
                    break;
            }
        }
    }
}
