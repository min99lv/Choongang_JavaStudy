package ch11_ex01;
// List계열

import java.util.ArrayList;

public class ArrayList01 {
	public static void main(String[] args) {	
//																					앞에 스트링 있으면 뒤에는 빼도됨
			ArrayList<String > al = new ArrayList<String>();
//			원소추가 / 눈여겨 볼 것 : 중복 --> ok , 순서 --> 유지 
			al.add("구렁2");
			al.add("구렁8");
			al.add("구렁2");
			al.add("구렁4");
			al.add("구렁3");
			al.add("구렁1");
			
//			일반 for문 & 향상형 for
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));
			}
			System.out.println("======================");
			for (String str : al) {
				System.out.println(str);
			}
			
	}
}
