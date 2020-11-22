package com.kh.test.shape.controller;

import com.kh.test.shape.model.vo.Circle;

public class ShapMaker {

	public static void main(String[] args) {
		Circle cl = new Circle();
		cl.draw();
		
		Circle[] c = new Circle[3];
		
		for(int i = 0; i<c.length; i++) {
			System.out.println();
		}
	}
}
