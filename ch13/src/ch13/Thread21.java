package ch13;

// p.768
// 잔고가 출금하려는 금액보다 큰경우에만 출금하도록 되어있지만 실행해보면
// 음수가 나오는 경우가 생긴다


public class Thread21 {
	public static void main(String[] args) {
		Runnable r = new RunnableEx21();
		new Thread(r).start();
		new Thread(r).start();
	}
}

class Account {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money){
		if(balance >= money){ // 잔고가 출금하려는 금액보다 큰 경우 
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			// 이때 쓰레드가 바뀌었다가 다시 돌아올 경우, 잔고체크 안하고 바로 빼서 음수가 나올 수 있다.
			// -> 해결. 동기화 (Synchronized)
			// (잔고체크, 출금)을 하나의 임계영역으로 묶는다
			balance -= money;
		}
	}
}


class RunnableEx21 implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0){
			
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance());
		}
	}
}