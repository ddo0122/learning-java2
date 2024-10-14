package oop1.ex;

public class Account {
    int balance; //잔액

    //입금
    void deposit(int amount) {
        balance = balance + amount;
    }

    //출금
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance = balance - amount;
        }
    }

}
