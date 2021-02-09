package com.mphasis.training.threaddemos;

class Table{
	public static synchronized void printTable(int n) {
		 System.out.println("Code working"+Thread.currentThread().getName());
		 for(int i=1;i<=10;i++) {
			System.out.println(""+n+"*"+i+"="+(n*i));
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
class Thread1 extends Thread{
	Table t;
	public Thread1(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.printTable(12);
	}
}
class Thread2 extends Thread{
	Table t;
	public Thread2(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		Table.printTable(5);
	}
}
class Thread3 extends Thread{
	Table t;
	public Thread3(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.printTable(8);
	}
}
class Thread4 extends Thread{
	Table t;
	public Thread4(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.printTable(7);
	}
}
public class ThreadDemo3 {
	public static void main(String[] args) {
		Table obj=new Table();
		Thread1 t1=new Thread1(obj);//12
		Thread2 t2=new Thread2(obj);//5
		Table obj1=new Table();
		Thread3 t3=new Thread3(obj1);//8
		Thread4 t4=new Thread4(obj1);//7	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
