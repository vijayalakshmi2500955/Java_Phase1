package com.thread.extend;

public class Sender {
	public void send(String msg) {

		System.out.println("Sending  "+msg);


		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Message Sent "+msg);


	}

}
public class SenderThread extends Thread {


	private	String msg;
     private Sender sender;
	public SenderThread(String msg, Sender sender) {
		super();
		this.msg = msg;
		this.sender = sender;
	}

	@Override
	public void run() {


		synchronized (sender) {

			sender.send(msg);

		}


	}

	public static void main(String[] args) {

			Sender  sender = new Sender();

				SenderThread  t1 = new SenderThread("HI",sender);

				SenderThread  t2 = new SenderThread("BYE BYE",sender);

				t1.start();
				t2.start();


				try {
					t1.join();
					t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}


