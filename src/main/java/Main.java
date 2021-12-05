import atm.*;
import builder.*;
import java.util.Scanner;


public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int amount = sc.nextInt();
        ATM atm = new ATM();


        atm.process(amount);
        User user = User.builder()
                .name("Viha")
                .age(19)
                .gender("devo4ka")
                .height(158)
                .race("american girl")
                .occupation("sleeping")
                .occupation("eating")
                .build();
        System.out.println(user);
    }
}
