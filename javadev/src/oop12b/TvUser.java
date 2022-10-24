package oop12b;

import java.io.FileInputStream;
import java.util.Properties;

public class TvUser {
   public static void main(String[] args) {
      Properties pr = new Properties();
      try {
         pr.load(new FileInputStream("src/oop12b/product.properties"));
         
         String tvClass = pr.getProperty("tv");
         Class tvClassName = Class.forName(tvClass);
         TV tv = (TV) tvClassName.getConstructor(null).newInstance(); //TV tv = new SamsungTV();  object 로일단 업캐스팅 ㄷ다음 다운 캐스팅
         //동적으로 인스턴스이름을 바꿀수있음
         
         
         tv.powerOn();
         tv.channelUp();
         tv.channelDown();
         tv.soundUp();
         tv.soundDown();
         tv.powerOff();
         tv.channelTable();// 삼성티비면 인터페이스에 디폴트 메소드 실행, 엘지면 클래스에 구현한 메소드 실행
      } catch (Exception e1) {
         e1.printStackTrace();
      }

      
   }
}