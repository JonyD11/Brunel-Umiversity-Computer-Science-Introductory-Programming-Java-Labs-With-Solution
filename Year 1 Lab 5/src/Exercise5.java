import java.io.*;

public class Exercise5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File s = new File("D:\\temp\\The art of flying.txt");
		String[] words = null;
		int word_count = 0;
		FileReader fr = new FileReader(s); 
		BufferedReader br = new BufferedReader (fr);
		String p;
		while((p=br.readLine())!=null)
		{
			words = p.split(" ");
			word_count = words.length;
		}
		fr.close();
		System.out.println(word_count);
	}

}
