package ch13;

// p.768
// �ܰ��� ����Ϸ��� �ݾ׺��� ū��쿡�� ����ϵ��� �Ǿ������� �����غ���
// ������ ������ ��찡 �����


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
		if(balance >= money){ // �ܰ��� ����Ϸ��� �ݾ׺��� ū ��� 
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			// �̶� �����尡 �ٲ���ٰ� �ٽ� ���ƿ� ���, �ܰ�üũ ���ϰ� �ٷ� ���� ������ ���� �� �ִ�.
			// -> �ذ�. ����ȭ (Synchronized)
			// (�ܰ�üũ, ���)�� �ϳ��� �Ӱ迵������ ���´�
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