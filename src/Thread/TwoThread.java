package Thread;

public class TwoThread {
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter();
		Thread t1=new WorkerThread(p,'|');
		Thread t2 = new WorkerThread(p,'-');
		t1.start();t2.start();
				
	}
}

class WorkerThread extends Thread{
	SharedPrinter p; char c;
	WorkerThread(SharedPrinter p char c){
		this.p=p;this.c=c;
	}
	public void run() {p.printer(c);
}
class SharedPrinter extends Thread{
	
}