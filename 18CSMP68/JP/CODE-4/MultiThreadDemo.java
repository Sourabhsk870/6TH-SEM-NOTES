//Implementing Runnable Interface
class ThreadInterface implements Runnable
{
	Thread t;
	String name;
		//ThreadInterface()
		ThreadInterface(String name)
		{
			t=new Thread(this,name);
			this.name=name;
			//System.out.println("Interface Thread "+t);
			System.out.println("Interface Thread "+name+" :"+t);
			t.start();
		}
		public void run(){
		try
		{
			for(int i=5;i>0;i--){
			//System.out.println("Child Thread: "+i);
			System.out.println("Interface Thread "+name+" :"+i);
			Thread.sleep(500);
			}
		}
		catch (InterruptedException e)
		{
			//System.out.println("Child Thread Interrupted");
			System.out.println("Interface Thread "+name+" Interrupted");
		}
		//System.out.println("Child Thread Exiting");
		System.out.println("Interface Thread "+name+" Exiting");
		
		}
}
//Extending Thread Class
class ThreadClass extends Thread
{
String name;	
		//ThreadClass()
		ThreadClass(String name)
		{
			super(name);
			this.name=name;
			System.out.println("Child Thread: "+this);
			this.start();
		}
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--){
			//System.out.println("Child Thread: "+i);
			System.out.println("Child Thread "+name+" :"+i);
			Thread.sleep(500);
			}
		}
		catch (InterruptedException e)
		{
			//System.out.println("Child Thread Interrupted");
			System.out.println("Child Thread "+name+" Interrupted");
		}
		//System.out.println("Child Thread Exiting");
		System.out.println("Child Thread "+name+" Exiting");
	}
}
class MultiThreadDemo 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		new ThreadClass("One");
		new ThreadClass("Two");
		new ThreadClass("Three");
		new ThreadInterface("One");
		new ThreadInterface("Two");
		new ThreadInterface("Three");
		System.out.println("Main Thread: "+Thread.currentThread());

		try
		{
			for(int i=5;i>0;i--){
			System.out.println("Main Thread: "+i);
			Thread.sleep(1000);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
				System.out.println("Main Thread Exiting");

	}
}
