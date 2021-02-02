import java.text.DecimalFormat;
import java.io.*;

public class Exercise6 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		writefile(5,"d:\\temp\\Exercise6.txt" );
	}
	public static void writefile(int n, String filename)throws IOException
	{

		FileWriter writehandle = new FileWriter(filename);
		DecimalFormat sf = new DecimalFormat("#,#.0");
		writehandle.write("Before 1 :" +sf.format(Math.sqrt(1)));
		DecimalFormat df = new DecimalFormat("#,#.0");
		writehandle.write("\nAfter 1 : " + df.format(Math.sqrt(1)));
		
		DecimalFormat sf1 = new DecimalFormat("#.################");
		writehandle.write("\n\nBefore 2 :"+ sf1.format(Math.sqrt(2)));
		DecimalFormat df1 = new DecimalFormat("#.##");
		writehandle.write("\nAfter 2 : " + df1.format(Math.sqrt(2)));
		
		DecimalFormat sf2 = new DecimalFormat("#.################");
		writehandle.write("\n\nBefore 3 :"+ sf2.format(Math.sqrt(3)));
		DecimalFormat df2 = new DecimalFormat("#.###");
		writehandle.write("\nAfter 3 : " + df2.format(Math.sqrt(3)));
		
		DecimalFormat sf3 = new DecimalFormat("#,#.0");
		writehandle.write("\n\nBefore 4 :"+ sf3.format(Math.sqrt(2) * Math.sqrt(2)));
		DecimalFormat df3 = new DecimalFormat("#,####.0000");
		writehandle.write("\nAfter 4 : " + df3.format(Math.sqrt(4)));
		 
		 
		  writehandle.close();
		  System.out.println("Sucessfully wrote the file: ");
	}
}
