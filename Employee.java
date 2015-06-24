import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author impadmin
 * The Employee program creates Admin class and Developer class objects and perform
 * specific functions on them depending on the input from the user. 
 */
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice1,choice2;
		String name;
		int age;
		Developer devObject=new Developer();
		Admin adminObject=new Admin();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Admin\n2.Developer\n3.Exit : ");
			choice1=sc.nextInt();
			switch(choice1)
			{
				case 1:
						System.out.println("1.Insert\n2.Fire a Developer : ");
						choice2=sc.nextInt();
						switch(choice2)
						{
							case 1:
								if(adminObject.name==null){
								System.out.println("Enter Name and Age :");
								name=sc1.nextLine();
								age=sc.nextInt();
								adminObject.insert(name, age);
								
								}
								else
								{
									System.out.println("Only one admin at a time..");
								}
								break;
							case 2:
									if(adminObject.name==null){
									System.out.println("No admin exists.");
									break;
									}
									if(Developer.listObject.size()<=0)
									{
										System.out.println("No Developers currently employed.");
									}
									else
									{
									adminObject.deleteDeveloper();
									}break;
							}
						break;
				case 2: System.out.println("1.Insert\n2.Sort by Names\n3.Sort by Age : ");
						choice2=sc.nextInt();
						switch(choice2)
						{
							case 1:System.out.println("Enter Name and Age :");
								name=sc1.nextLine();
								age=sc.nextInt();
								devObject=new Developer();
								devObject.insert(name, age);
								Developer.listObject.add(devObject);
								break;
							case 2:
									devObject.sortName();
									break;
							case 3:devObject.sortAge();
									break;
						}
						break;
				case 3:System.out.println("Exiting.. Bye"); 
					return;
			}
			
		}
	}
}

