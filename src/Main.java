public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.WithdrawMoney();
        account.PayInterest();

        account.ChangeStatus(new GoldAccount());

        account.WithdrawMoney();
        account.PayInterest();
    }
}