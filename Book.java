import java.util.*;

	public class Book{
	String name;
	String author;
	double price;
	int pages;


	Book(String name,String author,double price,int pages){
		this.name = name;
		this.author = author;
		this.price = price;
		this.pages= pages;
	}


	public String getname(){
		return name;
	}

	public void setname(){
		this.name = name;
	}

	public String getauthor(){
		return author;
	}

	public void setauthor(){
		this.author = author;
	}

	public double getprice(){
		return price;
	}

	public void setprice(){
		this.price = price;
	}
	
	public int getpages(){
		return pages;
	}

	public void setpages(){
		this.pages = pages;
	}


	@Override
	public String toString(){
		return "Name: " + name  + " Author: " + author + " Price: " + price + " No of pages: "+ pages ;
	}

	public static void main(String [] args){
		System.out.println("Name: Bramha Anilkumar Bajannavar");
		System.out.println("USN: 1BM23CS071");
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter the number of books");
		int n = cin.nextInt();
		cin.nextLine();

		Book[] book = new Book[n];
		System.out.println("Enter the values of each book");
		System.out.println("\n");
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the book");
			String name=cin.nextLine();
			System.out.println("Enter the name of the author");
			String author=cin.nextLine();
			System.out.println("Enter the price");
			double price=cin.nextDouble();
			System.out.println("Enter the no of pages");
			int pages=cin.nextInt();
			book[i]=new Book(name,author,price,pages);
			cin.nextLine();
		}


		System.out.println("Details of each book are");
		for (int i=0; i<n;i++){
			System.out.println("Book "+(i+1)+book[i].toString());
		
		}
	}
}
