package Exercise;
import java.awt.*;
import java.awt.event.*;

class Exercise13_1 extends Frame {
	final int SIZE = 5; // 빙고판 크기
	Button[][] btnArr = null;

	String[][] birds = { 
			{"참새", "두루미", "황새", "비둘기", "까오기"},
			{"오리", "타조", "부엉이", "올빼미", "뱁새"},
			{"꿩", "닭", "구관조", "잉꼬", "매"},
			{"거위", "독수리", "콘돌", "봉황", "공작"},
			{"까치", "까마귀", "앵무새", "꾀꼬리", "고니"}
		}; // 25개

	Exercise13_1() {
		this("Bingo Game");
	}

	Exercise13_1(String title) {
		super(title);
		setLayout(new GridLayout(SIZE, SIZE)); // 5열 5행의 테이블을 만든다.

		MyEventHandler handler = new MyEventHandler();
		addWindowListener(handler);

		btnArr = new Button[SIZE][SIZE]; // 5*5=25개의 버튼 담는 배열 생성

		// Frame에 버튼 추가
		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				btnArr[i][j] = new Button(birds[i][j]);
			}
		}
//		for (int i = 0; i < SIZE * SIZE; i++) {
//			btnArr[i] = new Button(birds[i]); // 배열 birds의 값을 버튼의 Label로 한다.
//			btnArr[i].addActionListener(handler); // 버튼에 이벤트리스너 추가
//			add(btnArr[i]); // 버튼을 Frame에 추가
//		}
		setBounds(600, 250, 300, 300); // 컴포넌트 위치(x, y)와 크기 (width, height)
		setVisible(true); // 내용을 화면에 표시한다
	}
	
	public static void main(String args[]) {
		Exercise13_1 win = new Exercise13_1("Bingo Game");
		win.setVisible(true);
	}
	
	class MyEventHandler extends WindowAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			// actionPerformed() -> 버튼을 클릭했을 때, 메뉴를 클릭했을 때, TextFiled에서 Enter키를 눌렀을 때, List의 item하나를 선택하여 더블클릭했을 때
			// 여기서는 버튼을 클릭했을 때
			Button btn = (Button)ae.getSource();
//			System.out.println(btn.getBackground());
			System.out.println(btn.getLabel()); // 눌러진 버튼의 Label을 콘솔에 출력
			btn.setBackground(Color.LIGHT_GRAY);
		}
		// Frame의 우측 상단의 x버튼을 누르면 프로그램을 종료한다.
		public void windowClosing(WindowEvent e){
			e.getWindow().setVisible(false); // 내용을 화면에서 보이지 않게한다
			e.getWindow().dispose(); // 메모리에서 제거한다
			System.exit(0); // 프로그램을 종료한다
		}
	} // MyEventHandler
} // class
