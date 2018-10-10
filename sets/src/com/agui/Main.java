package com.agui;

public class Main {

        public static void main(String[] args) {
                setImplementation set = new setImplementation();

                set.add(1);
                set.add(1);
                set.add(2);
                set.add(5);
                set.add(3);
                set.add(4);
                set.add(5);
                set.printvals();

                // bank account challenge
                BankAccount gracie = new BankAccount();
                gracie.settName("Graciela Aguilar");
                gracie.setAccountNumber(1000717478);
                gracie.setBalance(15);
                System.out.println(gracie.getEmail());
                System.out.println(gracie.getBalance());

                gracie.withdrawalBalance(20);
                System.out.println(gracie.getBalance());


    }
}
