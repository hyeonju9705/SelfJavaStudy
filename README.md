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
