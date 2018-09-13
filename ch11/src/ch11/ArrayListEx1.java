package ch11;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add("111");
		list1.add("222");
		list1.add("333");
		list1.add("444");
		list1.add(333); //오토박싱 -> list.add(new Integer(333));

		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		list1.add(0, "000");
		
		System.out.println(list1); // toString\
		System.out.println("index="+list1.indexOf("333"));
		
		list1.remove("333"); // boolean
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++){
			list1.set(i,  i+"");
		}
		
		System.out.println(list1);
		
//		for(int i=0;i<list1.size();i++){
//			list1.remove(i);
//		} 
		// 결과 -> [1,3]
		
		for(int i=list1.size()-1;i>=0;i--){
			list1.remove(i);
		}
		// 뒤에서부터 삭제해야 함
		System.out.println(list1);
	}

}
