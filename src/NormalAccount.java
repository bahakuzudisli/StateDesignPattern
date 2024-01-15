public class NormalAccount implements IAccountState{
    @Override
    public void WithdrawMoney() {
        System.out.println("Money is taken with Normal Account");
    }

    @Override
    public void PayInterest() {
        System.out.println("Interest paid with Normal Account");
    }
}
