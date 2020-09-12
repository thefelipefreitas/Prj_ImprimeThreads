package view;

import controller.ImprimeThreads;

public class Main {

	public static void main(String[] args) {

		for (int idThread = 0; idThread < 5; idThread++) {
					ImprimeThreads threadId = new ImprimeThreads(idThread);
					Thread threadId1 = new ImprimeThreads(idThread); 
					threadId1.start();
				}
	}
}
