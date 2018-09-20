package Exercise;

import java.awt.*;
import java.awt.event.*;

class GraphicsEx3 extends Frame implements MouseMotionListener {
	int x = 0;
	int y = 0;

	Image img = null;
	Graphics gImg = null; // ����ȭ��

	public static void main(String[] args) {
		new GraphicsEx3("GraphicsEx3");
	}

	public GraphicsEx3(String title) {
		super(title);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		// Frame�� (100, 100)�� ��ġ�� width 500, height 500 ũ��� ���̰� �Ѵ�.
		setBounds(100, 100, 500, 500);
		setVisible(true);

		img = createImage(500, 500); // ����ȭ�� ����
		gImg = img.getGraphics();
		gImg.drawString("���ʹ�ư�� ���� ä�� ���콺�� ������������.", 10, 50);
		repaint();
	}

	public void paint(Graphics g) {
		if (img != null)
			g.drawImage(img, 0, 0, this); // ����ȭ�鿡 �׷��� �׸��� Frame�� ����
	}

	public void update(Graphics g) {
		paint(g);
	}

	public void mouseMoved(MouseEvent me) {
	}

	public void mouseDragged(MouseEvent me) {
		if (me.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			x = me.getX();
			y = me.getY();
			gImg.drawString("*", x, y);
			repaint();
		}
	}

} // class