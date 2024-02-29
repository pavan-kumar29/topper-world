import java.util.*;

class ATM {
    ATM() {
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Amount");
        System.out.println("3.Deposit Amount");
        System.out.println("4.Get MiniStatement");
        System.out.println("5.Exit");
    }
}

public class AutomaticTellerMachine {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = 25046;
            int b = 1894;
            double balance = 10000, withdraw, deposit;
            HashMap<Double, String> mini = new HashMap<>();
            System.out.print("Enter your Id : ");
            int Id = sc.nextInt();
            System.out.print("Enter your Pin : ");
            int Pin = sc.nextInt();
            while (a == Id && b == Pin) {
                System.out.print("Enter a Number : ");
                int Num = sc.nextInt();
                switch (Num) {
                    case 1:
                        System.out.println(balance + " Available Balance");
                        break;
                    case 2:
                        System.out.println("Enter Amount : ");
                        withdraw = sc.nextDouble();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            mini.put(withdraw, "Withdraw Amount");
                            System.out.println(withdraw + " Withdraw Amount");
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        break;
                    case 3:
                        System.out.println("Enter Amount : ");
                        deposit = sc.nextDouble();
                        balance += deposit;
                        mini.put(deposit, "Deposited Amount");
                        System.out.println("Amount deposited Sucessfully");
                        break;
                    case 4:
                        System.out.println("Mini Statement ");
                        @SuppressWarnings("rawtypes") Set e = mini.keySet();
                        @SuppressWarnings("rawtypes") Collection c = mini.values();
                        @SuppressWarnings("rawtypes") Iterator itr1 = e.iterator();
                        @SuppressWarnings("rawtypes") Iterator itr2 = c.iterator();
                        while (itr1.hasNext() == true) {
                            System.out.println(itr1.next() + " " + itr2.next());
                        }
                        System.out.println(balance + " Available Balance");
                        break;
                    case 5:
                    System.exit(0);
                    default:
                    System.out.println("Enter Worng key");
                    System.out.println("Enter Wrong Id or Pin");
                }
            }
        }
    }
}
        
    
