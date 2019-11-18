public class BankAccount {

    private double amount;

    public double getAmount(){
        return amount;
    }

    double deposit(double sum) {
        amount = amount + sum;
        System.out.println("Вы пополнили свой баланс на " + sum);
        System.out.println("Ваш баланс составляет " + amount);
        return amount;
    }

    public double withDraw(double sum2) throws LimitException {
        System.out.println("Вы сняли на сумму " + sum2);
        amount = amount - sum2;
        if (sum2 > amount) {
            throw new LimitException("Не хватает денежных средств ", getAmount());
        }
        return sum2;
    }
}
