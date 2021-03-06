import java.awt.*;
import java.awt.event.*;

public class MouseEventTest extends Frame{
	Label location;
	
	MouseEventTest(String title){
		super(title);
		location = new Label("Mouse Pointer Location :");
		location.setSize(195,15);
		location.setLocation(5,30);
		location.setBackground(Color.yellow);
		add(location);
		
		addMouseMotionListener(new EventHandler());
		addWindowListener(new WindowHandler());
		
		setSize(300, 200);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MouseEventTest mainWin = new MouseEventTest("MouseEventTest");
	}
	
	class EventHandler implements MouseMotionListener {
		public void mouseDragged(MouseEvent e){}
		public void mouseMoved(MouseEvent e){
			location.setText("Mouse Pointer Location : (" + e.getX() + ", " + e.getY()+ ")");
		}
	}
	
	class WindowHandler extends WindowAdapter implements WindowListener {
		public void windowClosing(WindowEvent e){
			e.getWindow().setVisible(false); // 화면 false
			e.getWindow().dispose(); // 메모리에서 제거
			System.exit(0);
		}
	}
}
