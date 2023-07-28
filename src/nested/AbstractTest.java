package nested;//[ 김찬영  2023-07-26 오전 10:38:59 ]

public abstract class AbstractTest {	//POJO형식 (오리지널 형식) 어느 누구한테도 상속받지않고 세터 개터 쓰는것을 포조 형식이라 한다.
	String name;

	public String getName() { // 구현
		return name;
	}

	public abstract void setName(String name);// 추상메소드
}
