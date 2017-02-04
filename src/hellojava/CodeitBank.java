package hellojava;

class Person{
	private String name;
	BankAccount account;
	private int cash;
	private int age;
	
	void setAge(int pAge){
		
		if (pAge > 0) 
			age = pAge;
		else 
			System.out.println("전생은 지원하지 않습니다.");
	}
	
	int getAge(){
		return age;
	}
	
	void setCash(int pCash){
		if (pCash > 0)
			cash = pCash;
		
	}
	int getCash(){
		return cash;
	}
	
	void setName(String pName){
		name = pName;
	}
	String getName(){
		return name;
	}
}

public class CodeitBank {
	public static void main (String args[]){	
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("배주현");
		p1.setAge(27);
		p1.setCash(30000);
		
		p2.setName("강슬기");
		p2.setAge(24);
		p2.setCash(100000);
		
		
		BankAccount account1 = new BankAccount();
		account1.setBalance(100000); 
		
		p1.account = account1;
		account1.owner = p1;
		
		BankAccount account2 = new BankAccount();
		account2.setBalance(500000);
		p2.account = account2;
		account2.owner = p2;
		
		/*System.out.println("예금주의 성명은 "+ p2.getName());
		System.out.println("현금 시재액은: " + p2.getCash());
		System.out.println("현재 예금 잔고는: " + p2.account.getBalance());*/

		p1.account.deposit(30000);
		p1.account.withdraw(170000);
		p1.account.deposit(620000);
		p1.account.transfer(p2, 100000);
			}

}
