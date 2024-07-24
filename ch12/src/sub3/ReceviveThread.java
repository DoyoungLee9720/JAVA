package sub3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceviveThread extends Thread{
	private Socket socket;

	public ReceviveThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					break;
				}
				System.out.println(msg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
