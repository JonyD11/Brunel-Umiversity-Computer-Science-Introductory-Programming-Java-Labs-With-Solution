import java.io.File;
import java.io.FileFilter;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating file object
		File dir = new File("D:\\temp");
		
		System.out.println("List of all files: ");
		if(dir.isDirectory())
		{	
			//Storing all the files in the array
			File[] files1 = dir.listFiles();
			
			//List all the files of specific directory 
			for(int i = 0; i < files1.length; ++i)
			{
				System.out.println(files1[i].getName());
			}
		}
		
		//Again Creating file object
		File dir2 = new File("D://temp");
		
		//Create Filter to filter the text files
		FileFilter S = new FileFilter()
		{
			public boolean accept(File g)
			{
				if (g.getName().endsWith(".txt") && g.isFile())
				{
					return false;
				}
				else
				{
					return true;
				}
			}
		};
		//Listing all the files name except test files
		File[] files = dir2.listFiles(S);
		
		System.out.println("\nList of all files except txt files: ");
		
		for(File m : files)
			System.out.println(m.getName());
	}

}
