package member.model.vo;

public class Member {

	private String name;
	private String grade;
	private int point;
	
	public Member() {}
	
	public Member(String name, String grade, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	//부모타입에서는 등급별 이자율을 구체화할 수 없기 때문에 
	//기본이자율(Silver)로 계산해두고, 자식객체쪽에서 구현하게 한다
	public double getEjapoint() {
		return point*0.02;
	}
	
///////////////////////////////////////////
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	
}
