package ch12;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
}

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}

class Person{
	public Object info;
	Person(Object info){
		this.info = info;
	}
}

public class GenericDemo3 {
	public static void main(String[] args) {
		Person p1 = new Person("부장"); // 잘못된 인스턴스 입력
		 EmployeeInfo ei = (EmployeeInfo)p1.info;
		 System.out.println(ei.rank);
	}
}

