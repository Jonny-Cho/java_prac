package Exercise;
import java.awt.*;
import java.awt.event.*;

class Exercise13_1 extends Frame {
	final int SIZE = 5; // ������ ũ��
	Button[][] btnArr = null;

	String[][] birds = { 
			{"����", "�η��", "Ȳ��", "��ѱ�", "�����"},
			{"����", "Ÿ��", "�ξ���", "�û���", "����"},
			{"��", "��", "������", "�ײ�", "��"},
			{"����", "������", "�ܵ�", "��Ȳ", "����"},
			{"��ġ", "���", "�޹���", "�Ҳ���", "����"}
		}; // 25��

	Exercise13_1() {
		this("Bingo Game");
	}

	Exercise13_1(String title) {
		super(title);
		setLayout(new GridLayout(SIZE, SIZE)); // 5�� 5���� ���̺��� �����.

		MyEventHandler handler = new MyEventHandler();
		addWindowListener(handler);

		btnArr = new Button[SIZE][SIZE]; // 5*5=25���� ��ư ��� �迭 ����

		// Frame�� ��ư �߰�
		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				btnArr[i][j] = new Button(birds[i][j]);
			}
		}
//		for (int i = 0; i < SIZE * SIZE; i++) {
//			btnArr[i] = new Button(birds[i]); // �迭 birds�� ���� ��ư�� Label�� �Ѵ�.
//			btnArr[i].addActionListener(handler); // ��ư�� �̺�Ʈ������ �߰�
//			add(btnArr[i]); // ��ư�� Frame�� �߰�
//		}
		setBounds(600, 250, 300, 300); // ������Ʈ ��ġ(x, y)�� ũ�� (width, height)
		setVisible(true); // ������ ȭ�鿡 ǥ���Ѵ�
	}
	
	public static void main(String args[]) {
		Exercise13_1 win = new Exercise13_1("Bingo Game");
		win.setVisible(true);
	}
	
	class MyEventHandler extends WindowAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			// actionPerformed() -> ��ư�� Ŭ������ ��, �޴��� Ŭ������ ��, TextFiled���� EnterŰ�� ������ ��, List�� item�ϳ��� �����Ͽ� ����Ŭ������ ��
			// ���⼭�� ��ư�� Ŭ������ ��
			Button btn = (Button)ae.getSource();
//			System.out.println(btn.getBackground());
			System.out.println(btn.getLabel()); // ������ ��ư�� Label�� �ֿܼ� ���
			btn.setBackground(Color.LIGHT_GRAY);
		}
		// Frame�� ���� ����� x��ư�� ������ ���α׷��� �����Ѵ�.
		public void windowClosing(WindowEvent e){
			e.getWindow().setVisible(false); // ������ ȭ�鿡�� ������ �ʰ��Ѵ�
			e.getWindow().dispose(); // �޸𸮿��� �����Ѵ�
			System.exit(0); // ���α׷��� �����Ѵ�
		}
	} // MyEventHandler
} // class