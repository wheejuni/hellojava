package hellojava;

public class BankAccount {
	
	
	private int balance;
	Person owner;
	
	

    // 파라미터 : 입금할 액수(정수)
    // 리턴 : 성공여부(불린)
	
	void setBalance(int amount){
		if (amount >= 0){
			balance = amount;
		}
		else 
			System.out.println("대출은 지원하지 않습니다.");
		
	}
	
	int getBalance(){
		return balance;
	}
	
    boolean deposit(int amount) {
        if (amount > owner.getCash()){
        System.out.println("입금 실패: 현금 부족. 입금 시도액: " + amount + "현금: " + owner.getCash());
    	return false;}
        else{
        	balance += amount;
        	owner.setCash(owner.getCash() - amount);
        	System.out.println(amount + "원 입금 하였습니다. 잔고 : " + balance + "원, 현금 : " + owner.getCash() +"원");
        	
        	return true;
    }
    }

    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean withdraw(int amount) {
    	if (amount > balance){
    		System.out.println("출금에 실패했습니다. 잔액: " + balance + " 현금: " + owner.getCash());
    		return false;
    }
    	else{
    		balance = balance - amount;
    		owner.setCash(owner.getCash() + amount);
    		System.out.println(amount+"원 출금 하였습니다. 잔고 :" + balance + "원, 현금 : " + owner.getCash() + "원");
    		return true;}
    }

    // 첫 번째 파라미터 : 받는 사람(Person)
    // 두 번째 파라미터 : 이체할 금액(정수)
    // 리턴 : 성공여부(불린)
    boolean transfer(Person to, int amount) {
    	
    	if (amount > balance){
    		System.out.println("이체에 실패했습니다. 잔액 부족.");
    		return false;
    	}
    	else{
    		balance -= amount;
    		to.account.balance += amount;
    		System.out.println(amount + "원을 " + to.getName() + "님의 계좌에 입금했습니다.");
    		return true;
    
    }

    }

}



