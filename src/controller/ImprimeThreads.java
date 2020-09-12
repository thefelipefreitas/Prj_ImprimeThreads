package controller;

public class ImprimeThreads extends Thread {

	private int idThread;
	
	public ImprimeThreads(int idThread1) {
		this.idThread = idThread1;
	}
	
	public void run() {
		//Só se executa o que está aqui dentro
		System.out.println(idThread);
	}
	
}
