package Exercise;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

// 1. ���̾ƿ� ����
// 2. 5x5 �迭 ����� & ���� ���� ����
// 3. ���̾ƿ��� ��ư���� �����
// + ��ü���������� �ٵ��
// 4. �̺�Ʈ���� / Ŭ���ϸ� ������� / �� �� �ҷ���
// 5. ����üũ / ���������� �ʷϻ���

public class BingoPrac extends Frame{
	final int SIZE = 5;
	int bingoCnt = 0; // ����ī��Ʈ
	
	Button[] btnArr = null;
	int[][] bArr = new int[SIZE][SIZE]; // ���� üũ���� �迭
	String[] numStr = new String[25];
			
	BingoPrac(){
		this("Bingo game");
	}
	
	BingoPrac(String title){
		super(title);
		//1. ���̾ƿ� ����------------------------------------------
		setLayout(new GridLayout(SIZE, SIZE));
		
		EventHandler handler = new EventHandler();
		addWindowListener(handler);
		
		for(int i=0;i<numStr.length;i++){
			numStr[i] = Integer.toString(i+1);
		}
		// �迭 ����
		for(int i=0;i<numStr.length;i++){
			//0~24�߿� �ϳ� �̾� ������ �ֱ�
			int random = (int)(Math.random()*numStr.length);
			//�ڸ��ٲ�
			String tmp = numStr[i];
			numStr[i] = numStr[random];
			numStr[random] = tmp;
		}
		
		btnArr = new Button[SIZE * SIZE];
		for (int i=0;i<SIZE*SIZE;i++){
			btnArr[i] = new Button(numStr[i]);
			add(btnArr[i]);
			btnArr[i].addActionListener(handler);
		}
		
		setBounds(600, 250, 400, 400); // ������Ʈ ��ġ(x, y)�� ũ�� (width, height)
		setVisible(true); // ������ ȭ�鿡 ǥ���Ѵ�
		
	}
	
	public static void main(String[] args) {
		BingoPrac win = new BingoPrac("Bingo Game");
		win.setVisible(true);
	} // main method
	
	public void print() { // �����迭 bArr ���
		for(int i=0;i<bArr.length;i++){
			for(int j=0;j<bArr[i].length;j++){
				System.out.print(bArr[i][j] ? "O" : "X");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		System.out.println(this.bingoCnt);
	}
	
	boolean checkBingo() {
		this.bingoCnt = 0;
		int garoCnt = 0;
		int seroCnt = 0;
		int crossgaroCnt = 0;
		int crossseroCnt = 0;
		for(int i=0;i<bArr.length;i++){
			garoCnt = 0; seroCnt = 0;
			for(int j=0;j<bArr[i].length;j++){
				if(bArr[i][j]==1){garoCnt++;};
				if(bArr[j][i]==1){seroCnt++;};
				if(i==j && bArr[i][j]==1){crossgaroCnt++;};
				if(i+j==4 && bArr[i][j]==1){crossseroCnt++;};
			}
			if(garoCnt==5){bingoCnt++;};
			if(seroCnt==5){bingoCnt++;};
		}
		if(crossgaroCnt==5){bingoCnt++;};
		if(crossseroCnt==5){bingoCnt++;};
		
		return bingoCnt;
	}
	
	
	
} // class BingoPrac

class EventHandler extends WindowAdapter implements ActionListener{
	public void windowClosing(WindowEvent e) { // Frame�� �ݱ� ��ư�� ������ �� ȣ��ȴ�.
		e.getWindow().setVisible(false); // Frame�� ȭ�鿡�� ������ �ʵ��� �ϰ�
		e.getWindow().dispose(); // �޸𸮿��� �����Ѵ�.
		System.exit(0); // ���α׷��� �����Ѵ�.
	}
	
	public void actionPerformed(ActionEvent ae){
		Button btn = (Button)ae.getSource();
		System.out.println(btn.getLabel());
		btn.setBackground(Color.YELLOW);
	}
}