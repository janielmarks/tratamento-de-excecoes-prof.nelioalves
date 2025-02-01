import model.exceptions.BusinessException;
import model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe o numero da conta: ");
        System.out.print("Numero: ");
        Integer number = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo inicial: ");
        Double balance = sc.nextDouble();
        System.out.print("Limite de saque: ");
        Double withdrawlimit = sc.nextDouble();

        Account acc = new Account(balance, withdrawlimit, number, holder);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = sc.nextDouble();

         try {
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        }
         catch (BusinessException e) {
             System.out.println(e.getMessage());

         }

            sc.close();
        }
    }