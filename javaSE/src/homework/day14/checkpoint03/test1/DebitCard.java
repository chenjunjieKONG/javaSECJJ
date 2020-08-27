package homework.day14.checkpoint03.test1;

public class DebitCard {
    private String accountNumber;
    private double money;

    public DebitCard() {
    }

    public DebitCard(String accountNumber, double money) {
        setAccountNumber(accountNumber);
        setMoney(money);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money < 0) {
            try {
                throw new Exception("余额永远不能为负数");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.money = money;
    }

    public void money() {
        System.out.println(getAccountNumber() + ",余额：" + getMoney());
    }
}
