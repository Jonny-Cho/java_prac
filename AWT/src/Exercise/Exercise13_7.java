package Exercise;
// 오목
import java.awt.*;
import java.awt.event.*;

public class Exercise13_7 extends Frame implements MouseListener {

	final int LINE_NUM = 9; // 오목판 줄 수
	final int LINE_WIDTH = 30; // 오목판 줄 간격
	final int BOARD_SIZE = LINE_WIDTH * (LINE_NUM-1); // 오목판 크기
	final int STONE_SIZE = (int)(LINE_WIDTH * 0.8); // 돌의 크기
	
	final int X0; // 오목판 시작위치 x
	final int Y0; // 오목판 시작위치 y
	
	final int FRAME_WIDTH; // Frame의 폭
	final int FRAME_HEIGHT; // Frame의 높이
	
	Image img = null;
	Graphics gImg = null;
	
	public Exercise13_7(String title){
		super(title);
		
		// Event Handler 등록
		addMouseListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		setVisible(true);
		Insets insets = getInsets();
		
		// 오목판 그려질 위치 좌표지정
		X0 = insets.left + LINE_WIDTH;
		Y0 = insets.top + LINE_WIDTH;
		
		// Frame 크기 계산
		FRAME_WIDTH = BOARD_SIZE+LINE_WIDTH*2+insets.left+insets.right;
		FRAME_HEIGHT = BOARD_SIZE+LINE_WIDTH*2+insets.top+insets.bottom;
		
		// Frame을 화면의 (100, 100)의 위치에 계산된 크기로 보이게 한다.
		setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);
		
		img = createImage(FRAME_WIDTH, FRAME_HEIGHT);
		gImg = img.getGraphics();
		
		setResizable(false);
		drawBoard(gImg);
		
		
		
	} // Exercise13_7(String title)
	
	public void drawBoard(Graphics g){
		for(int i=0; i<LINE_NUM;i++){
			g.drawLine(X0, Y0+i*LINE_WIDTH, X0+BOARD_SIZE, Y0+i*LINE_WIDTH);
			g.drawLine(X0+i*LINE_WIDTH, Y0, X0+i*LINE_WIDTH, Y0+BOARD_SIZE);
		}
	}
	
	public void paint(Graphics g){
		if(img==null) return;
		
		g.drawImage(img, 0, 0, this); // 가상화면에 그려진 그림을 Frame에 복사
	}
	
	public void mousePressed(MouseEvent e){
		int x = e.getX();
		int y = e.getY();
		
		//1. x또는 y의 값이 오목판 밖을 벗어난 곳이면 메서드 종료
		if(x < X0-LINE_WIDTH/2 || x > X0+(LINE_NUM-1)*LINE_WIDTH+LINE_WIDTH/2)
			return;
		if(y < Y0-LINE_WIDTH/2 || y > Y0+(LINE_NUM-1)*LINE_WIDTH+LINE_WIDTH/2)
			return;
		
		//2. x와 y의 값을 클릭한 곳에서 가장 가까운 교차점으로 변경한다.(반올림) x와 y의 값을 클릭한 곳에서 가장 가까운 교차점으로 변경한다.(반올림)
		x = (x-X0 + LINE_WIDTH/2)/LINE_WIDTH * LINE_WIDTH + X0;
		y = (y-Y0 + LINE_WIDTH/2)/LINE_WIDTH * LINE_WIDTH + Y0;
		
		// 3. x와 y의 값에서 돌의 크기(STONE_SIZE)의 절반을 빼야 클릭한 곳에 돌이 그려진다.
		x -= STONE_SIZE / 2;
		y -= STONE_SIZE / 2;
		
		// 4. 눌러진 버튼이 마우스 왼쪽 버튼이면, (x,y)의 위치에 검은 돌을 그리고
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
			gImg.setColor(Color.black);
			gImg.fillOval(x, y, STONE_SIZE, STONE_SIZE);
			
		} 
		// 눌러진 버튼이 마우스 오른쪽 버튼이면, (x,y)의 위치에 흰 돌을 그린다.
		else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			gImg.setColor(Color.white);
			gImg.fillOval(x, y, STONE_SIZE, STONE_SIZE);
			
			// 흰색 돌을 위해 검은색 테두리를 그린다
			gImg.setColor(Color.black);
			gImg.drawOval(x, y, STONE_SIZE, STONE_SIZE);
		}
		
		// 5. repaint()를 호출한다
		repaint();
		
	}
	
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	
	
	public static void main(String[] args) {
		new Exercise13_7("OmokTest");
	}

}
