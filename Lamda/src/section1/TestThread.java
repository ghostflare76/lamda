package section1;

public class TestThread {
	
	public static void main(String[] args) throws Exception {		
			
		Trd r = new Trd();
	
		//Runnable interface를 구현한 Object를 넘겨처리하는 방법 
		Thread t1 = new Thread(r);	
		t1.start();
		
		Thread.sleep(1000);
				
		// 익명클래스를 사용  
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world two");				
			}			
		};
		
		r1.run();	
		
		Thread.sleep(1000);
		
		//Lamda 표현식을 사용
		Thread t2 = new Thread(() -> { System.out.println("Hello World three"); });
		t2.start();				
		
		
	}	
}

