package kh.java.test.array;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test();
	}

	public void test() {
		int[] numArr = new int[100];
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i+1;
		}
		for(int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
	}
}
