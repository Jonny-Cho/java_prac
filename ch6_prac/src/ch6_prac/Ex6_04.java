package ch6_prac;

public class Ex6_04 {
	public static void main(String args[]){
	Student2 s = new Student2();
	s.name = "ȫ�浿"; 
	s.ban = 1;
	s.no = 1;
	s.kor = 100;
	s.eng = 60;
	s.math = 76;
	System.out.println("�̸�:"+s.name); 
	System.out.println("����:"+s.getTotal()); 
	System.out.println("���:"+s.getAverage()); 
	}
}

class Student2{
	String name; //�л��̸�
	int ban; //��
	int no; //��ȣ
	int kor; //��������
	int eng; //��������
	int math; //��������
	
	int getTotal(){
		int result = kor + eng + math;
		return result;
	}
	
	float getAverage(){
		float result = (int)(getTotal() / 3f*10+0.5f) /10f;
		return result;
	}
}