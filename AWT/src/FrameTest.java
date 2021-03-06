import java.awt.*;

class FrameTest {
	public static void main(String args[]) {
		Frame f = new Frame("Login"); // Frame객체를 생성한다.
		f.setSize(300, 200); // Frame의 크기를 설정한다.
		f.setVisible(true); // 생성한 Frame을 화면에 보이도록 한다.
	}
}

/*
 
1. Frame객체를 하나 만들고, - 생성자에 사용된 String은 Frame의 titlebar에 나타난다.
Frame f = new Frame("Login");
2. 생성된 Frame의 크기를 설정한 다음, - 폭(width) : 300 픽셀(pixel), 높이 : 200 픽셀
f.setSize(300, 200);
3. Frame을 화면에 보이도록 한다. - Frame객체를 생성했다고 해서 화면에 보이는 것은 아니고
반드시 setVisible()을 사용해야 화면에 나타난다.
f.setVisible(true);

*/