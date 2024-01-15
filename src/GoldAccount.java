public class GoldAccount implements IAccountState{

    @Override
    public void WithdrawMoney() {
        System.out.println("Money is taken with Golden Account");
    }

    @Override
    public void PayInterest() {
        System.out.println("Interest paid with Golden Account");
    }
}
