package 뮤직플레이어;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

   public static void main(String[] args) {
      
		String text = "\r\n"
				+ "            .,,.    \r\n"
				+ "            .,,.    \r\n"
				+ "            .,,.    \r\n"
				+ "       .,,,.        \r\n"
				+ "      ,,,,,,,       \r\n"
				+ "      ,,, .,,.      \r\n"
				+ "     ,,,   ,,,      \r\n"
				+ "     ,,.    ,,      \r\n"
				+ "     ,,.   ,,,      \r\n"
				+ "      ,,, ,,,,      \r\n"
				+ "      ,,,,,,,       \r\n"
				+ "       ..,,.        \r\n"
				+ ""; 
	   
	  System.out.println(text);
      Scanner sc = new Scanner(System.in);
      
      // 노래를 실행, 정지해주는 객체
      MP3Player mp3 = new MP3Player();
      // mp3노래를 실행하기 위해서는 노래가 위치하고 있는 경로가 필요
      //mp3.play("C:\\Users\\gjaischool\\Desktop\\윤하-사건의지평선.mp3");
      
      
      // 1.가수명(String) 2.노래제목(String) 3.출시년도(int) 4.시간(int)

	  Music m1 = new Music("뉴진스", "HypeBoy", 2022, 90, "C:\\Users\\gjaischool\\Desktop\\뉴진스-HypeBoy.mp3");
	  Music m2 = new Music("르세라핌", "Antifragile", 2022, 85, "C:\\Users\\gjaischool\\Desktop\\르세라핌-Antifragile.mp3");
	  Music m3 = new Music("아이브", "LoveDive", 2022, 82, "C:\\Users\\gjaischool\\Desktop\\아이브-LoveDive.mp3");
	  Music m4 = new Music("윤하", "사건의지평선", 2022, 80, "C:\\Users\\gjaischool\\Desktop\\윤하-사건의지평선.mp3");
	  Music m5 = new Music("카라", "When I move", 2022, 70, "C:\\Users\\gjaischool\\Desktop\\카라-WhenIMove.mp3");
	  //Music m6 = new Music("스트레이", "너, 너", 2016, 75);
      
      ArrayList<Music> list = new ArrayList<>();
      list.add(m1);
      list.add(m2);
      list.add(m3);
      list.add(m4);
      list.add(m5);
      //list.add(m6);
      
      int point = 0;
      
      while (true) {
    	  System.out.println();
          System.out.println("1.재생 2.정지 3.이전곡 4.다음곡 5.목록 6.종료 >> ");
          int menu = sc.nextInt();

         if (menu == 1) {
        	 System.out.println("======재생======");
        	 
        	 if (mp3.isPlaying()) {
        		 mp3.stop();
        	 }
        	 
        	 mp3.play(list.get(point).getPath());
        	 
        	 System.out.print(point + 1 + ".");
        	 System.out.print(list.get(point).getSinger() + " - ");
        	 System.out.print(list.get(point).getTitle() + "(");
        	 System.out.println(list.get(point).getTime() + "초)");

         } else if (menu == 2) {
        	 System.out.println("======정지======");
        	 mp3.stop();
        	 System.out.print(point + 1 + ".");
        	 System.out.print(list.get(point).getSinger() + " - ");
        	 System.out.print(list.get(point).getTitle() + "(");
        	 System.out.println(list.get(point).getTime() + "초)");

         } else if (menu == 3) {
        	 System.out.println("======이전곡======");
        	 point--;
        	 if (point < 0) {
        		 point = list.size() - 1;
        	 }
        	 if (mp3.isPlaying()) {
        		 mp3.stop();
        	 }
        	 mp3.play(list.get(point).getPath());
        	 System.out.print(point + 1 + ".");
        	 System.out.print(list.get(point).getSinger() + " - ");
        	 System.out.print(list.get(point).getTitle() + "(");
        	 System.out.println(list.get(point).getTime() + "초)");

         } else if (menu == 4) {
        	 System.out.println("======다음곡======");
        	 // 현재 "1.아이들-퀸카(90초)" 노래가 나온다면 다음곡을 선택할 시
        	 // "2.윤하-사건의지평성(85초)" 가 출력되게 해주세요
        	 // 몇번째 노래가 실행되고 있는지 위치를 알고있는 변수가 필요
           	 point++;
           	 if (point > list.size() - 1) {
           		 point = 0;
           	 }
           	 if (mp3.isPlaying()) {
           		 mp3.stop();
           	 }
           	 mp3.play(list.get(point).getPath());
           	 System.out.print(point + 1 + ".");
        	 System.out.print(list.get(point).getSinger() + " - ");
        	 System.out.print(list.get(point).getTitle() + "(");
        	 System.out.println(list.get(point).getTime() + "초)");
        	 
        	 
         } else if (menu == 5) {
            
            System.out.println("======목록======");
            // 1.아이들-퀸카(90초)
            // 2.윤하-사건의지평선(85초)
            for (int i = 0; i < list.size(); i++) {
            	System.out.print(i + 1 + ".");
            	System.out.print(list.get(i).getSinger() + "-");
            	System.out.print(list.get(i).getTitle() + "(");
            	System.out.println(list.get(i).getTime() + "초)");
            	
            }            
            

         } else if (menu == 6) {
            System.out.println("프로그램을 종료합니다.");
            mp3.stop();
            break;
         }
      }sc.close();

   }

}