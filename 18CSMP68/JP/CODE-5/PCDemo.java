//wait(), notify()
class Q
{
	int n;
	boolean valueSet=false;
	
	synchronized int get()
	{
		try
		{
			while(!valueSet)
				wait();
		}
		catch (InterruptedException e)
		{
			System.out.println("Consumer Thread Interrupted");
		}
		System.out.println("Got: "+n);
		valueSet=false;
		notify();
		return n;
	}
	synchronized void put(int n)
	{
		try
		{
			while(valueSet)
				wait();
		}
		catch (InterruptedException e)
		{
			System.out.println("Producer Thread Interrupted");
		}
		this.n=n;
		System.out.println("Put: "+n);
		valueSet=true;
		notify();
		
	}
}
class Producer implements Runnable
{
	Q q;
	Thread t;
	Producer(Q q)
	{
		this.q=q;
		t=new Thread(this,"Producer");
		t.start();
	}
	public void run()
	{
		int n=0;
		//while(true)
		for(int i=1;i<=5;i++)
			q.put(n++);
	}
}
class Consumer implements Runnable
{
	Q q;
	Thread t;
	Consumer(Q q)
	{
		this.q=q;
		t=new Thread(this,"Consumer");
		t.start();
	}
	public void run()
	{
		//while(true)
		for(int i=1;i<=5;i++)
			q.get();
	}
}
class PCDemo 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
	}
}
