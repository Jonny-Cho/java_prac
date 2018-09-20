package Exercise;

import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;

import Exercise.Exercise13_1.MyEventHandler;

public class Exercise13_4 extends Frame{

	SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
		
	public static void main(String[] args) {
		Exercise13_4 win = new Exercise13_4();
		win.start();
	}
	
	Exercise13_4(){
		super("");
		
		MyEventHandler handler = new MyEventHandler();
		addWindowListener(handler);
		
		setBounds(500, 200, 200, 0);
		updateClock();
		setResizable(false);
		setVisible(true); 
	}
	
	void updateClock() { // ����ð��� Frame�� title�� ǥ���ϴ� �޼���
		Date currentTime = new Date(System.currentTimeMillis());
		setTitle(sdf.format(currentTime));
	}
	
	void start(){ // ������ �̿� 1�ʸ��� updateClock()ȣ��
		Thread t = new Thread(new Runnable() {
			public void run(){
				while(true) {
					try {
						Thread.sleep(1000); // 1�� ����.
					} catch(Exception e){}
					
					updateClock(); // updateClock() ȣ��
				}
			} // run()
		});
		t.start();
	}
	
	class MyEventHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e){
			e.getWindow().setVisible(false);
			e.getWindow().dispose();
			System.exit(0);
		}
	} // MyEventhandler
}