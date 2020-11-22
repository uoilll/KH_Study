package member.model.vo;

public class Vip extends Member{
//	private String name;
//	private String grade;
//	private int point;
	
	public Vip() {}
	public Vip(String name, String grade, int point) {
//		this.name = name;
//		this.grade = grade;
//		this.point = point;
		
		super(name, grade, point);
	}
	
	@Override
	public double getEjapoint() {
		return super.getPoint() * 0.1;
	}
	//이자 포인트
//	public double getEjapoint() {
//		return point*0.1;
//	}
	/////////////////////////
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getGrade() {
//		return grade;
//	}
//	public void setGrade(String grade) {
//		this.grade = grade;
//	}
//	public int getPoint() {
//		return point;
//	}
//	public void setPoint(int point) {
//		this.point = point;
//	}
	
}