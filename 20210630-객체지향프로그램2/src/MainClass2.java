/*
 * 객체지향답게 프로그램 제작 (필수x, 권장사항)
 * 1) 데이터 보호 (다른 클래스에서 직접 변수 사용할 수 없다, 단 사용이 가능 하게 만든다(메소드를 이용해서))
 *    ========= 은닉화 / 캡슐화
 *      === 접근지정어
 *      	private
 *      	protected
 *      	public
 *      	default
 * 2) 기존에 만든 클래스를 재사용 (상속=변경해서 사용, 포함=있는 그대로)
 * 							 ==============  =============
 * 							   사용자 정의        라이브러리
 * 							 ============================= extends (확장) => 형변환
 * 3) 변경, 추가 (다형성)
 * 	  변경 => 오버라이딩
 * 	  추가 => 오버로딩
 * *** 캡슐화, 상속, 다형성 (권장사항)
 * *** 클래스의 접근 제어어
 * 	   멤버변수
 *	   접근지정어 데이터형 변수명;  ==> default (int a; => 같은 폴더끼리)
 *	   메소드
 *	   생성자
 * 	   =========================================================================================
 * 			        자신의 클래스		  같은 폴더안에서	 다른 패키지 상위클래스에 접근		모든 클래스
 * 								        (패키지)
 * 	   =========================================================================================
 * 	   private         o
 * 	   =========================================================================================
 * 	   default		   o				   o
 * 	   =========================================================================================
 * 	   protected	   o				   o				   o				   
 * 	   =========================================================================================
 * 	   pubilc          o				   o				   o				   o
 * 	   =========================================================================================
 * 
 * 	   ***** 변수는 private (은닉화) => 데이터 보호가 목적 => 접근시에는 메소드를 이용한다 (캡슐호)
 * 			 ===
 * 			 기능 : 읽기 / 쓰기 (메모리에 저장) => 메소드 읽기:getter, 쓰기:setter => 라이브러리(lombok)
 * 				   ===
 * 				   메모리에 값을 가지고 온다
 * 	   ***** 메소드는 다른 클래스 통신 public
 * 	   ***** 생성자 => 어떤 클래스든 상관없이 사용이 가능 public
 */

/*
 * java파일안에 여러개 class를 제작
 * ========
 * 여러개 만들 때 주의점
 *  = public class => 1번만 사용이 가능
 *  = 저장명은 public class인 면으로 저장
 * 		class A
 * 		public class B
 * 		==> B.java
 */

class Sawon{
	// default => 같은 폴더안에서 사용이 가능
	// protected => default보다 크다 (다른 폴더에 있는 클래스에서 접근이 가능 (상속이 되어있어야 한다))
	/*
	protected int sabun;
	protected String name;
	protected String dept; // 부서명
	protected String loc; // 근무지
	protected long pay;
	*/
	// 폴더와 상관없이 모든 클래스에서 접근이 가능 (공개)
	/*
	public int sabun;
	public String name;
	public String dept; // 부서명
	public String loc; // 근무지
	public long pay;
	*/
	private int sabun;
	private String name;
	private String dept; // 부서명
	private String loc; // 근무지
	private long pay;
	// 다른 클래스에서 사용이 불가능 (은닉화)
	// 변수 => 읽기, 쓰기
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s=new Sawon();
		/*
		s.sabun=1;
		s.name="홍길동";
		s.dept="개발부";
		s.loc="서울";
		s.pay=3000; ==> 쓰기 (메모리에 저장)
		System.out.println("사원:"+s.sabun); ==> 읽기 (메모리에서 값을 가지고 오기)
		System.out.println("이름:"+s.name);
		System.out.println("부서:"+s.dept);
		System.out.println("근무지:"+s.loc);
		System.out.println("연봉:"+s.pay);
		*/
	}

}
