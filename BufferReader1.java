import java.util.*;
import java.io.*;	
class test
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
                String s=br.readLine();
		System.out.println("Integer is "+x+" String after Integer is "+s);
	}
}