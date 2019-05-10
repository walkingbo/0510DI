package di;

public class Good {
	private int code;
	private String name;
	
	//source-constructors(매개변수가 없는 생성자)
	public Good() {
		super();
		
	}
	//매개변수가 있는 생성자 
	public Good(int code, String name) {
		super();
		//인스턴스 메소드(멤버 메소드)에서 this를 붙이면 메소드 외부에서 찾기 시작
		//this가 없으면 메소드 내부에서부터 찾음 
		//super 가 있으면 상위 클래스에서부터 찾음 
		this.code = code;
		this.name = name;
	}
	
	//source - getter & setter
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//source - toString 
	@Override
	public String toString() {
		return "Good [code=" + code + ", name=" + name + "]";
	}
	
}
