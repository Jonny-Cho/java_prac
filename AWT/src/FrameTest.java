import java.awt.*;

class FrameTest {
	public static void main(String args[]) {
		Frame f = new Frame("Login"); // Frame��ü�� �����Ѵ�.
		f.setSize(300, 200); // Frame�� ũ�⸦ �����Ѵ�.
		f.setVisible(true); // ������ Frame�� ȭ�鿡 ���̵��� �Ѵ�.
	}
}

/*
 
1. Frame��ü�� �ϳ� �����, - �����ڿ� ���� String�� Frame�� titlebar�� ��Ÿ����.
Frame f = new Frame("Login");
2. ������ Frame�� ũ�⸦ ������ ����, - ��(width) : 300 �ȼ�(pixel), ���� : 200 �ȼ�
f.setSize(300, 200);
3. Frame�� ȭ�鿡 ���̵��� �Ѵ�. - Frame��ü�� �����ߴٰ� �ؼ� ȭ�鿡 ���̴� ���� �ƴϰ�
�ݵ�� setVisible()�� ����ؾ� ȭ�鿡 ��Ÿ����.
f.setVisible(true);

*/