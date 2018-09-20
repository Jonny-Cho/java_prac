package Exercise;
// ����
import java.awt.*;
import java.awt.event.*;

public class Exercise13_7 extends Frame implements MouseListener {

	final int LINE_NUM = 9; // ������ �� ��
	final int LINE_WIDTH = 30; // ������ �� ����
	final int BOARD_SIZE = LINE_WIDTH * (LINE_NUM-1); // ������ ũ��
	final int STONE_SIZE = (int)(LINE_WIDTH * 0.8); // ���� ũ��
	
	final int X0; // ������ ������ġ x
	final int Y0; // ������ ������ġ y
	
	final int FRAME_WIDTH; // Frame�� ��
	final int FRAME_HEIGHT; // Frame�� ����
	
	Image img = null;
	Graphics gImg = null;
	
	public Exercise13_7(String title){
		super(title);
		
		// Event Handler ���
		addMouseListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		setVisible(true);
		Insets insets = getInsets();
		
		// ������ �׷��� ��ġ ��ǥ����
		X0 = insets.left + LINE_WIDTH;
		Y0 = insets.top + LINE_WIDTH;
		
		// Frame ũ�� ���
		FRAME_WIDTH = BOARD_SIZE+LINE_WIDTH*2+insets.left+insets.right;
		FRAME_HEIGHT = BOARD_SIZE+LINE_WIDTH*2+insets.top+insets.bottom;
		
		// Frame�� ȭ���� (100, 100)�� ��ġ�� ���� ũ��� ���̰� �Ѵ�.
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
		
		g.drawImage(img, 0, 0, this); // ����ȭ�鿡 �׷��� �׸��� Frame�� ����
	}
	
	public void mousePressed(MouseEvent e){
		int x = e.getX();
		int y = e.getY();
		
		//1. x�Ǵ� y�� ���� ������ ���� ��� ���̸� �޼��� ����
		if(x < X0-LINE_WIDTH/2 || x > X0+(LINE_NUM-1)*LINE_WIDTH+LINE_WIDTH/2)
			return;
		if(y < Y0-LINE_WIDTH/2 || y > Y0+(LINE_NUM-1)*LINE_WIDTH+LINE_WIDTH/2)
			return;
		
		//2. x�� y�� ���� Ŭ���� ������ ���� ����� ���������� �����Ѵ�.(�ݿø�) x�� y�� ���� Ŭ���� ������ ���� ����� ���������� �����Ѵ�.(�ݿø�)
		x = (x-X0 + LINE_WIDTH/2)/LINE_WIDTH * LINE_WIDTH + X0;
		y = (y-Y0 + LINE_WIDTH/2)/LINE_WIDTH * LINE_WIDTH + Y0;
		
		// 3. x�� y�� ������ ���� ũ��(STONE_SIZE)�� ������ ���� Ŭ���� ���� ���� �׷�����.
		x -= STONE_SIZE / 2;
		y -= STONE_SIZE / 2;
		
		// 4. ������ ��ư�� ���콺 ���� ��ư�̸�, (x,y)�� ��ġ�� ���� ���� �׸���
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
			gImg.setColor(Color.black);
			gImg.fillOval(x, y, STONE_SIZE, STONE_SIZE);
			
		} 
		// ������ ��ư�� ���콺 ������ ��ư�̸�, (x,y)�� ��ġ�� �� ���� �׸���.
		else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			gImg.setColor(Color.white);
			gImg.fillOval(x, y, STONE_SIZE, STONE_SIZE);
			
			// ��� ���� ���� ������ �׵θ��� �׸���
			gImg.setColor(Color.black);
			gImg.drawOval(x, y, STONE_SIZE, STONE_SIZE);
		}
		
		// 5. repaint()�� ȣ���Ѵ�
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