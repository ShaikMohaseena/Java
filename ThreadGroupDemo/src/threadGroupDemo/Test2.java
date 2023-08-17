package threadGroupDemo;

public class Test2 {

	public static void main(String[] args) {

		ThreadGroup tg=new ThreadGroup("main_sub_thread_group");
		Thread t1=new Thread(tg,"pandu thread");
		Thread t2=new Thread(tg,"gundu thread");
		System.out.println("current thread_group name: "+tg.getName());
		System.out.println("parent thread_group name :"+tg.getParent().getName());
		System.out.println("old priority of thread_group: "+tg.getMaxPriority());
		tg.setMaxPriority(7);
		System.out.println("new priority of thread_group: "+tg.getMaxPriority());
		tg.list();
		
	}

}
