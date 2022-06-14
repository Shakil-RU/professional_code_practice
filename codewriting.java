
//File Name StudentList.java
import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
public static void main(String[] args) {
//		Check arguments
		if(args[0].equals("a")) {
			System.out.println("Loading data ...");		
			try {
			BufferedReader  bufferedReader = new BufferedReader(
			new InputStreamReader(
			new FileInputStream("students.txt"))); 
			String line =  bufferedReader.readLine();
            String StudentNames[] = line.split(",");			
			for(String StudentName : StudentNames)
             {
                 System.out.println(StudentName); 
             }
			} catch (Exception e){

            } 
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("r")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader buffered_reader = new BufferedReader(
					new InputStreamReader(
					new FileInputStream("students.txt"))); 
			String TextName = buffered_reader.readLine();
             System.out.println(Textname);
			String TextNames[] = TextName.split(",");	
			Random random = new Random();
				int Number = random.nextInt();
					System.out.println(i[y]);
			} catch (Exception e){

            } 
			System.out.println("Data Loaded.");			
		}
		else if(args[0].contains("+")){
			System.out.println("Loading data ...");			
			try {
			BufferedWriter bufferedWriter = new BufferedWriter(
					new FileWriter("students.txt", true));
			String SubString = args[0].substring(1);
	        Date date = new Date();
	        String dateFormat = "dd/mm/yyyy-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(dateFormat);
	        String dateFormat= dateFormat.format(date);
			bufferedWriter.write(", "+t+"\nList last updated on "+dateFormat);
			bufferedWriter.close();
			} catch (Exception e){

            }							
			System.out.println("Data Loaded.");	
		}
		else if(args[0].contains("?")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader Buffered_Reader = new BufferedReader(
					new InputStreamReader(
					new FileInputStream("students.txt"))); 
			String Name = Buffered_Reader.readLine();
			String Names[] = Buffered_Reader.split(",");	
			boolean done = false;
			String t = args[0].substring(1);
			for(int index = 0; index<i.length && !done; index++) {
				if(i[index].equals(t)) {
					System.out.println("We found it!");
					done=true;
				}
			}
			} catch (Exception e){

            } 
			System.out.println("Data Loaded.");				
		}
		else if(args[0].contains("c")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader Buffered_Reader = new BufferedReader(
					new InputStreamReader(
					new FileInputStream("students.txt"))); 
			String Name = Buffered_Reader.readLine();
			char Names[] = Name.toCharArray();			
			boolean in_word = false;
			int count=0;
			for(char Names:Name) {
				if(Names ==' ') 
				{
					if (!in_word) {	
                        count++; in_word =true;	
                        }
					else {
                         in_word=false;
                         }			
				}
			}
			System.out.println(count +" word(s) found " + Names.length);
			} catch (Exception e){

            } 
			System.out.println("Data Loaded.");				
		}
	}
}
