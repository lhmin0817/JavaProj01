package chapter14.ex07;

public class Account {
	class BanlanceException extends Exception{
		public BanlanceException () {
			super();
		}
		public BanlanceException(String message) {
			super(message);
		}
	}
	
	private long balance=1000;				// 예금의 잔고
	public Account() {}					// 기본생성자
		
	public long getBalance() {			// getter : 호출 시 balance 필드의 값을 리턴으로 돌려줌
		return balance;
	}
	//출금 : 
	public void deposit(int money) {	// 기존 잔고에서 money를 인풋받아서 더해서 다시 필드에 적용
		balance += money;
	}
	// 예외 처리
	public void withdrow(int money) throws BanlanceException {
		//잔고가 money작은 경우 잔액 부족 이라고 강제로 예외를 발생시켜서 처리
			// 예외 메시지 : 잔액 부족
			// BanlanceException <=== 사용자 정의 예외를 생성해서 
		if(balance <money) {
			throw new BanlanceException("예외 발생 : 잔액이 부족합니다.");
		}else {
			System.out.println("정상 값");
		}
	}

	public static void main(String[] args) {
		
		Account ac= new Account();
		try {
			ac.withdrow(2100);
		} catch (BanlanceException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}