package com.oop.method.nonstatic;

public class NonStaticSample {
	
	public static void main(String[] args) {
		NonStaticSample n = new NonStaticSample();
//		n.printLottoNumbers();
//		n.outputChar(3, 'a');
//		n.alphabet();
		System.out.println(n.mySubstring("놀고싶다아", 0, 4));
		
		
	}

	public void printLottoNumbers() {
		int[] num = new int[6];
		int i = 0;		
		for(i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*45+1);
			//중복검사
			for(int j = 0; j < i; j++) {
				//중복된 수가 있다면, 해당번지수의 난수를 다시 뽑기위해 미리 1을 감산단다. 
				//이후 바깥반복문 i++을 통해 같은 번지를 가리키게 된다.
				if(num[j] == num[i]) {
					i--;
				}
			}
			System.out.println(num[i]);
		}		
	}
	
	public void outputChar(int num, char ch) {
		for(int i = 0; i < num; i++) {
			System.out.println(ch);
		}
	}
	
	public char alphabet() {
		char ch = (char)(Math.random()* 26+((int)(Math.random() * 2) * ('A' - 'a')) + 'a');
		System.out.println(ch);
		return ch;
	}
	
	public String mySubstring(String str, int start, int end) {
		if(str==null) {
			return null;
		}
		return str.substring(start, end+1); // start는 포함 end는 불포함   start부터 end전까지 뽑아낸다
	}
	
	
	
}
