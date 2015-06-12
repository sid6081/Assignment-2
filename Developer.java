import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**
 * @author impadmin
 * This class compares objects of Developer class
 */
class Comp implements Comparator<Developer>
{
	int temp=0;
	Comp(int x)
	{
		temp=x;
	}
	@Override
	public int compare(Developer a, Developer b) {
		// TODO Auto-generated method stub
		if(temp==0)
			return (a.name).compareToIgnoreCase(b.name);
		else
			return a.age.compareTo(b.age);
	}
}

/**
 * @author impadmin
 * This class adds the names and ages of the Developer to LinkedList and also
 * provides methods to sort the Developers info by name or age.
 */
class Developer implements EmployeeInterface
{
	Scanner sc=new Scanner(System.in);
	String name;
	Integer age;
	static int dev_count=0;
	static List<String> listName=new LinkedList<String>();
	static List<Integer> listAge=new LinkedList<Integer>();
	static List<Developer> listObject=new LinkedList<Developer>();
	
	@Override
	public void insert(String a, int b) {
		// TODO Auto-generated method stub
		name=a.toLowerCase();
		age=b;
		listName.add(name);
		listAge.add(age);
	}

	@Override
	public void sort_name() {
		// TODO Auto-generated method stub
		int temp=0;
	
		Collections.sort(listObject, new Comp(0));
		
		for(int i=0;i<listObject.size();i++)
		{
			temp=1;
			System.out.println(listObject.get(i).name+" : "+listObject.get(i).age);
		}
		if(temp==0)
		{
			System.out.println("Developer list empty");
		}
	}

	@Override
	public void sort_age() {
		// TODO Auto-generated method stub
		int temp=0;
		Collections.sort(listObject, new Comp(1));
		for(int i=0;i<listObject.size();i++)
		{
			temp=1;
			System.out.println(listObject.get(i).name+" : "+listObject.get(i).age);
		}
		if(temp==0)
		{
			System.out.println("Developer list empty");
		}
	}
	
}
