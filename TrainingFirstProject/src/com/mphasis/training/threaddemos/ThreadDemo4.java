package com.mphasis.training.threaddemos;

class Market{
	boolean v=true;
	public synchronized void produce(int i)throws InterruptedException {
		if(!v)
			wait();
		System.out.println("Produced "+i);
		v=false;
		notify();
	}
	public synchronized void consume(int i) throws InterruptedException {
		if(v)
			wait();
		System.out.println("Consumed "+i);
		v=true;
		notify();
	}
}

class Producer extends Thread{
	Market m;
	Producer(Market m){
		this.m=m;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				m.produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread{
	Market m;
	Consumer(Market m){
		this.m=m;
	}
	public void run() {
		for(int i=0;i<10;i++) {
		try {
			m.consume(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

public class ThreadDemo4 {
	public static void main(String[] args) {
		Market m1=new Market();
		Producer p1=new Producer(m1);
		Consumer c1=new Consumer(m1);
		p1.start();
		c1.start();
	}
}
