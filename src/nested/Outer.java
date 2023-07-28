package nested;//[ 김찬영  2023-07-26 오전 10:03:40 ]

public class Outer {
	private String name;
	public void output() {
		System.out.println("이름 = " + this.name + "  " +"나이 = " + new Inner().age);	//this.name이 생략되있음. name써도됨.여기 this.는 아우터꺼
	}
	
	class Inner{ //상속은 아니지만 바깥 필드를 가져와 쓸수있다.
		private int age;
		
		public void setName(String name) {
			Outer.this.name = name;
		}
		
		public void disp() {
			System.out.println("이름 = " + Outer.this.name + "  " +"나이 = " + this.age); //<== 여기 this.는 Inner꺼 this.name은 아우터꺼라여기서 쓸수없다. Outer.this.name이라써야됨.
		}; // 상속관계는 아니라서 this는 못쓴다.
		
	}//class Inner
	
	public static void main(String[] args) {
		Outer ou = new Outer(); // 내 클래스안에 있는애들은 getter가 필요없어.
		ou.name = "홍길동";
		ou.output();
		
		Outer.Inner in = ou.new Inner();//Inner in = new Inner(); 이렇게 독립되게 몬쓴다. ou.new Inner(); ou안에 이너를 생성하라는 규칙
		in.age = 25;
		in.disp();
		
		Outer.Inner in2 = ou.new Inner(); // 메모리 새로 생성해서 이너생성
		in2.setName("김");
		in2.age =30; 
		in2.disp();
		
		Outer.Inner in3 = new Outer().new Inner(); // 한번쓰고 버리는 역할.?? 새로운 아우터영역을 만들어서 이 새로운 아우터에 접근가능한 객체가 없음.
		//in3.name = "코난"; - error 접근불가. 스테틱이라 바깥에 있는거에 접근불가. ????? 스테틱처럼 디스가 없는곳에선 허용안된다. 외부에서 접근하려면 setter를 통해서 접근가능.
		in3.setName("코난"); //안에있는 애가 바깥에 있는애한테 접근가능한건 중첩 클래스라가능. 셋으로 접근가능.
		in3.age = 35;
		in3.disp();
	}
}
