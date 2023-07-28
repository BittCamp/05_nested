package nested;//[ 김찬영  2023-07-26 오전 11:20:01 ]

public class AbstractMain {
	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() { //추상클래스는 new 할수 없다.//그래서 sub클래스로 생성할수있다.// 메소드로 생성할수있다.
												// 추상이 new가 안되니 . {}구현부를 만들어서. 오로지 메소드의구현부를 만들수있는건 클래스밖에 없다.
												// {    }; 익명 이너 클래스를 만든거다. 5번쨰줄 부터 13번째 줄까지.
			@Override
			public void setName(String name) {
				this.name = name;
				
				}
			}; 
			
			at.setName("홍길동");
			System.out.println(at.getName());
			
			InterA in = new InterA()  { //{ 익명클래스. 인터페이스를 뉴시킨게 아니라. 익명을 뉴시킨거다. 
										//목적은 인터페이스 가져오는 건데 InterA in = new InterA();이렇게는 안됨.
										// 대신에 뒤에 {}익명클래스를 선언해줌으로써 문법적으로 사용가능하게 하고, new InterA()로 InterA에 있는거라고 방향을 지정해줌. 문법이라 이렇다고 형태를 외우면됨.
				public void aa(){};
				public void bb(){};
				
			}; // } 익명클래스
			
			AbstractExam ae = new AbstractExam() {
				// 추상메소드가 없기 때문에 원하는 메소드를 선택해서 Override. 추상메소드가 없는 추상클래스.
			};
	}
}
//AbstractMain.java
//AbstractMain.class
//AbstractMain$1.class