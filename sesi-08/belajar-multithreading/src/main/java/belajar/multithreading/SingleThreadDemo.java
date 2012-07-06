package belajar.multithreading;

public class SingleThreadDemo{
	public static void main(String[] xx) throws Exception {
		new SingleThread().start();
		new SingleThread().start();
	}
}

class SingleThread {
	public void start() throws Exception {
		for(int i=0; i < 10; i++) {
			System.out.println("Counter:"+i);
			Thread.sleep(1000);
		}
	}
}