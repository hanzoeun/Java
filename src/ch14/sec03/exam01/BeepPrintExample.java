package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	
	//메인 스레드 1개만 실행 
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // 객체생성
				
				//조건문  
				for (int i=0; i<5; i++) {
					toolkit.beep(); // 비프음 발생 
					
					try {
						Thread.sleep(500); // 0.5초동안 코드의 실행을 정지 
					} catch (Exception e) {
						
					}
				}
			}
			
		});
		thread.start();
		
		
		
		for (int i=0; i<5; i++) {
			System.out.println("띵띵띵");
			try {
				Thread.sleep(500); // 0.5초동안 코드의 실행을 정지 
			} catch (Exception e) {
				
			}
		}
	}

}
