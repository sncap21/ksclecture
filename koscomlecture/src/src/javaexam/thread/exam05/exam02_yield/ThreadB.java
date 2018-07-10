package javaexam.thread.exam05.exam02_yield;

public class ThreadB extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업중");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}
}

