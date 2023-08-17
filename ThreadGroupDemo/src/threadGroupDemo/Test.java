package threadGroupDemo;


public class Test {

	public static void main(String[] args) {	
		String name=Thread.currentThread().getThreadGroup().getName();
		System.out.println("Current thread_group name: "+name);
		String parent_name=Thread.currentThread().getThreadGroup().getParent().getName();
		System.out.println("Parent Thread_group name: "+parent_name);

	}

}
