import java.util.Scanner;
public class Management {

	public static void main(String[] args) 
	{
		char r;
		do
		{
		System.out.println("Library Management System");
		System.out.println("Press 1 to add Book");
		System.out.println("Press 2 to issue a book");
		System.out.println("Press 3 to return a book");
		System.out.println("Press 4 to print complete issue details");
		System.out.println("Press 5 to exit");
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter any number");
		int a=obj1.nextInt();
		switch(a)
		{
		case 1:
			Library aa=new Library();
			aa.add();
			break;
		case 2:
			Library bb=new Library();
			bb.iss();
			break;
		case 3:
			Library cc=new Library();
			cc.ret();
			break;
		case 4:
			Library is=new Library();
			is.detail();
			break;
		case 5:
			Library add=new Library();
			add.exit();
			break;
			default:
				System.out.println("Invalid Number");
		}
		System.out.println("you want to select next option Y/N");
		r=obj1.next().charAt(0);
		}
		while(r=='y'||r=='Y');
		if(r=='n'||r=='N')
		{
			Library z=new Library();
			z.exit();
		}
	}
}
class Library
{
	static String str,b,date;
	static int a,c;
	void add()
	{
		System.out.println("Enter book Name,Prize and Book_no");
		Scanner obj2=new Scanner(System.in);
		String str=obj2.nextLine();
		float price=obj2.nextInt();
		int bookno=obj2.nextInt();
		System.out.println("Details:"+str+price+bookno);
	}
	void iss()
	{
		Scanner obj3=new Scanner(System.in);
		System.out.println("Book Name");
		str=obj3.nextLine();
		System.out.println("Book_id");
		a=obj3.nextInt();
		obj3.nextLine();
		System.out.println("Issue date");
		b=obj3.nextLine();
		System.out.println("total no of book issued");
		c=obj3.nextInt();
		obj3.nextLine();
		System.out.println("Return book date");
		date=obj3.nextLine();
	}
	int getid()
	{
		return a;
	}
	void ret()
	{
		System.out.println("enter student_name and book_id");
		Scanner c=new Scanner(System.in);
		String name=c.nextLine();
		int bookid=c.nextInt();
		if(a==bookid)
		{
			System.out.println("total details");
			System.out.println("book name:"+Library.str);
			System.out.println("book id:"+Library.a);
			System.out.println("issue date"+Library.b);
			System.out.println("total no of book issued:"+Library.c);
			System.out.println("book return date:"+Library.date);
		}
		else
		{
			System.out.println("wring id, enter correct id");
			
		}
	}
	void detail()
	{
		System.out.println("book name:"+Library.str);
		System.out.println("book id:"+Library.a);
		System.out.println("issue date"+Library.b);
		System.out.println("total no of book issued:"+Library.c);
		System.out.println("book return date:"+Library.date);
	}
	void exit()
	{
		System.exit(0);
	}
}

