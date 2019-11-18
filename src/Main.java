public class Main {

    public static void main(String[] args) {

        BankAccount accountJohn = new BankAccount();
        accountJohn.deposit(10000);

        while (true) {
            try {
                accountJohn.withDraw(6000);
                System.out.println("Ваш баланс составляет" + accountJohn.getAmount());
            } catch (LimitException le){
                System.out.println("Ваш баланс составляет " + accountJohn.getAmount());
                double amount = accountJohn.getAmount();
                if (accountJohn.getAmount() >= accountJohn.getAmount())
                    System.out.println("Вы сняли остаток суммы " + amount);
                amount = le.getRemainingAmount() - le.getRemainingAmount();
                System.out.println("Ваш баланс составляет " + amount);
                break;
            }
        }
    }
}
