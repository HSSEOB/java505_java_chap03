public class Account {
    private long balance;

    public Account() {}

    public  long getBalance(){
        return balance;
    }
    public void  deposit(int money){
        balance += money;
    }

    public void withdraw(int money) throws BalacelnsufficientException{
        if(balance<money){
//            예외처리가 없을 경우
//            System.out.println("출금 금액이 총 예금 보다 크다");

//            사용자 정의 예외를 사용함
            throw new BalacelnsufficientException("잔고 부족 : " + (money - balance) + "모자람");
        }
        balance -= money;
    }
}
