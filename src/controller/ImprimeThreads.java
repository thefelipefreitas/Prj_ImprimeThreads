package controller;

public class ImprimeThreads extends Thread {

	private int idThread;
	
	public ImprimeThreads(int idThread1) {
		this.idThread = idThread1;
	}
	
	public void run() {
		//S� se executa o que est� aqui dentro
		System.out.println(idThread);
	}
	
}
