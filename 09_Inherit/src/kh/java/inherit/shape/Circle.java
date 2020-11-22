package kh.java.inherit.shape;

/**
 * Circle - Point 는 studentManager - student 관계와 비슷
 * Circle - Point (연관관계) has a 포함관계: Circle has a Point 원은 점을 가지고 있다.
 * Circle - Shape (상속, 일반화관계) is a 상속관계 : Circle is a Shape 원은 도형이다.
 */
public class Circle extends Shape {

	Point center; //중심점
	int r; //반지름
	
	
}
