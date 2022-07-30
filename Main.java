import java.io.*;

public class Main{
	public static void main(String args[])throws IOException{
		
		int length, width, height, volumeOfCube;
		
		//Objects to inputsstreamreader and bufferreader
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		

		System.out.print("Length is : ");
		length = Integer.parseInt(in.readLine());
		
		System.out.print("Width is : ");
		width = Integer.parseInt(in.readLine());
		
		System.out.print("Height is : ");
		height = Integer.parseInt(in.readLine());
		
		volumeOfCube = length * width * height;
		
		System.out.println("Volume of Cube is : " +volumeOfCube);
	}
}