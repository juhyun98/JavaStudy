package 보충수업;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// 박병관 짜장면집
		// PBKJajangmyeon pbk = new PBKJajangmyeon();
		
		// 박충현 짜장면집
		PCHJajangmyeon pch = new PCHJajangmyeon();
		
		// 박보경 짜장면집
		PBGJajangmyeon pbg = new PBGJajangmyeon();
		
		// 박종권 짜장면집
		PJGJajangmyeon pjg = new PJGJajangmyeon();
		
		// 박다영 짜장면집
		PDYJajangmyeon pdy = new PDYJajangmyeon();
		
		// 업캐스팅 자식이 부모클래스로
		PBKJajangmyeon p1 = pch;
		PBKJajangmyeon p2 = pbg;
		PBKJajangmyeon p3 = pjg;
		PBKJajangmyeon p4 = pdy;
		
		ArrayList<PBKJajangmyeon> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).makeJajang();
		}
		
		// 다운캐스팅
		PCHJajangmyeon pch2 = (PCHJajangmyeon)p1;
		pch2.makeGoonManDo();
		
		
		
	}

}
