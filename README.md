# SelfJavaStudy
혼자 공부하는 자바 스터디<br>
byte < short< int < long < float < double <br>
<br>
string type을 ==검사 하고싶을때는<br>
변수명.equals("문자열") 
<br><br>
중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면 바깥쪽 반복문에<br>
          이름(라벨)을 붙이고 break 이름; 을 사용하면 된다. <br>
          <br>
ex) 이름: for( ; ; ) {<br>
          break 이름;<br>
          } <br><br>
          
          동일한 번지 값을 갖고있다는 것 = 동일한 객체를 참조한다는 의미
배열 복사하는법
          <br><br>
          System.arraycopy(원본배열, 시작인덱스, 새 배열, 붙여넣을 시작 인덱스, 복사할 갯수);
          <br><br>
참조 타입 배열이 복사되면 복사되는 값이 객체의 번지이므로 <br>
새 배열의 항목은 이전 배열의 항목이 참조하는 객체와 동일
<br><br>
오버로딩의 사전적의미 = 많이 싣는것 <br>
하나의 메소드 이름으로 여러 기능을 담는다 하여 붙여진 이름
<br><br>
<OL>
          <LI>public 접근제한
          <br>모든패키지에서 생성자 호출가능</LI>
          <LI>protected 접근제한
          <br>같은패키지에 속하는 클래스 , 다른패키지에 속한 클래스가 해당 클래스의 자식 클래스라면 생성자호출 가능</LI>
          <LI>default 접근제한
          <br>같은패키지 가능 / 다른패키지 생성자 호출 불가</LI>
          <LI>private 접근제한
          <br>오로지 클래스 내부에서만 생성자 호출 가능</LI>
</OL>
<br><br>
자동타입 변환이 필요한 이유 : 다형성 구현하기 위해
<br>필드의 타입을 부모타입으로 선언하면 다양한 자식 객체들이 저장될 수 있기 때문에<br>
필드 사용 결과가 달라질 수 있다. 이것이 필드의 다형성<br><br>
추상클래스란 abstract 키워드를 붙여야하며 new 연산자를 이용해서 객체만들지 못하고 상속을 통해 자식 클래스만 만들수 있다<br>
<br>인터페이스는 개발코드와 객체가 서로 통신하는 접점역할<br>
<br>구현객체가 인터페이스 타입으로 자동타입 변환 하면, 인터페이스에 선언된 메소드만 사용가능하다는 제약사항이 따름
<br><br>
<OL>
          <LI>NullPointerException
          <br>객체가 없는 상태에서 객체를 사용하려 할 때 예외발생</LI>
          <LI>ArrayIndexOutOfBoundsException
          <br>인덱스 범위를 초과할 경우 실행예외 발생</LI>
          <LI>NumberFormatException
          <br>숫자로 변환될 수 없는 문자를 숫자로 변환시키려 할 때 예외발생</LI>
          <LI>ClassCastException
          <br>타입변환은 상위클래스와 하위클래스 간에 발생+ 구현 클래스와 인터페이스 간에도 발생
          <br>이러한 관계가 아니라면 클래스는 다른 타입으로 변환할 수 없기 때문에 예외발생</LI>
</OL>
<br><br>
객체의 동등 비교를 위해서는 Object의 equals() 메소드만 재정의하지 말고<br>
hashCode() 메소드도 재정의해서 논리적으로 동등한 객체일 경우 동일한 해시코드가 리턴되도록 해야함
<br><br>
데몬스레드는 주 스레드가 종료되면 강제적으로 자동 종료 되는것
<br> 스레드를 데몬으로 만들기 위해서는 주 스레드가 데몬이 될 스레드의 setDaemon(true)를 호출
<br> start() 메소드가 호출되고 나서 setDaemon(true)를 호출하면 IllegalThreadStateException 발생
<br> 따라서 start() 메소드 호출 전에 setDaemon(true) 
