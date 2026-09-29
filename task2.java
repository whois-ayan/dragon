class Account {
    double balance;
    Account() {
        balance = 0;
    }
    Account(double balance, double x) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {
        Account a = new Account(5000, 0);

        a.deposit(1000);
        a.withdraw(2000);
        a.display();
    }
}
