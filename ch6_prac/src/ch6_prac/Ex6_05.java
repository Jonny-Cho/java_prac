package ch6_prac;

public class Ex6_05 {
	public static void main(String args[]){
		Student3 s = new Student3("ȫ�浿",1,1,100,60,76);
		
		System.out.println(s.info());
	}
}

class Student3{ //Ŭ����
	String name; //�л��̸�
	int ban; //��
	int no; //��ȣ
	int kor; //��������
	int eng; //��������
	int math; //��������
	
	Student3(String name, int ban, int no, int kor, int eng, int math){ //������
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal(){
		int result = kor + eng + math;
		return result;
	}
	
	float getAverage(){
		float result = (int)(getTotal() / 3f*10+0.5f)/10f;
		return result;
	}

	String info(){ 
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
}