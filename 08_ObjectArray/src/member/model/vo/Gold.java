package member.model.vo;

public class Gold extends Member {
//	private String name;
//	private String grade;
//	private int point;
	
	public Gold() {}
	public Gold(String name, String grade, int point) {
//		this.name = name;
//		this.grade = grade;
//		this.point = point;
		
		super(name, grade, point);
	}
	
	@Override
	public double getEjapoint() {
		return super.getPoint()*0.05;
	}
	
	//이자포인트 getter 추가
//	public double getEjapoint() {
//		return point*0.05;
//	}
	
	////////////////////////////
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
