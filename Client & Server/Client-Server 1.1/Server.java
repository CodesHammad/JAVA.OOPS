import java.util.*;
import java.net.*;
import java.io.*;
public class Server{
	public static void main(String[] args){
try{
		ServerSocket server = new ServerSocket(9090);
	System.out.println("Waiting for client connection");
		Socket client = server.accept();
	System.out.println("client connected");
		Scanner in = new Scanner(client.getInputStream());
		PrintWriter out = new PrintWriter(client.getOutputStream(),true);
	
	while(true){
	String message = in.nextLine();
	System.out.println("Client says "+ message);
	if(message.equals("exit")){
		break;
}
}
server.close();
client.close();
}catch(IOException e){
e.printStackTrace();
}
}
}