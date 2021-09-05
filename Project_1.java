package phase1.project.com;


	import java.io.File;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.Scanner;
	public class Project_1 {

	static void addFile(String newname) throws FileNotFoundException, IOException
	{
	File file = new File("C:\\Users\\tgeddam\\eclipse\\projectlml\\src\\projectlml"+newname);
	if (file.createNewFile())
	System.out.println("New File is created successfully!!!");
	else
	throw new FileNotFoundException("File Already exist");
	}

	static void deleteFile(String deletename) throws FileNotFoundException, IOException
	{
	File file = new File("C:\\Users\\tgeddam\\eclipse\\projectlml\\src\\projectlml"+deletename);
	boolean b = file.delete();
	if (b == true)
	System.out.println("File deleted successfully");
	else
	throw new FileNotFoundException("File Not Found");
	}

	static void searchFile(String searchname) throws FileNotFoundException, IOException
	{
		Scanner scan=new Scanner(System.in);
		File file = new File("C:\\Users\\tgeddam\\eclipse\\projectlml\\src\\projectlml");
		String ss[] = file.list();
		//System.out.println("Enter the file name you want to search: ");
		String st = scan.next();

		String c[] = file.list();
		boolean flag = false;

		for (int i = 0; i < c.length; i++) {

		Object check1 = c[i];
		if (st.equals(check1)) {
		flag = true;
		break;
		}
		}

		if (flag == true)
		System.out.println("File found sucessfully");
		else
		System.out.println("File doesnt exist");
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to the Project");
	System.out.println("Project Name:- Virtual Key for Your Repositories ");
	System.out.println("Developer Name:- Sneha Hegade");
	System.out.println("Designation:- SDE Trainee");
	System.out.println(" ");
	char ch;
	File d = new File("C:\\Users\\tgeddam\\eclipse\\projectlml\\src");
	if(d.isDirectory())
	{
	File[] f = d.listFiles();
	System.out.println("Files of directoy in Ascending order");
	for(File file:f)
	{
	System.out.println(file.getName());
	}
	Arrays.sort(f);
	}
	do{
	System.out.println("\nFile Operations: ");
	System.out.println("1. File Add");
	System.out.println("2. File Delete");
	System.out.println("3. File Search");
	System.out.println("4. Application Close");
	System.out.println("Enter your choice: ");
	int choice = scan.nextInt();

		
	switch (choice)
	{
	case 1 :
	System.out.println("Enter new file name you want to add: ");
	String newname = scan.next();
	try {
	addFile(newname);
	} catch (Exception e) {
	System.out.println("Exception occured: "+ e.getMessage());
	}
	break;

	case 2 :
	System.out.println("Enter the file name you want to delete: ");
	String deletename = scan.next();
	try {
	deleteFile(deletename);
	} catch (Exception e) {
	System.out.println("Exception occured: "+ e.getMessage());
	}
	break;

	case 3 :
	//System.out.println("Enter the file name you want to search: ");
	String searchname=" ";
	try {
	searchFile(searchname);
	} catch (Exception e) {
	System.out.println("Exception occured: "+ e.getMessage());
	}
	break;

	case 4 :
	scan.close();
	System.exit(choice);
	break;

	default :
	System.out.println("Please enter valid choice ");
	break;

	}
	System.out.println("Do you want to continue (Type y or n)");
	ch = scan.next().charAt(0);

	}while (ch == 'Y'|| ch == 'y');

	}
	}

	class FileNotFoundException extends Exception {
	FileNotFoundException(String s) {
	super(s);
	}
	
}
