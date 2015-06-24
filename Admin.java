import java.util.*;

/**
 * @author impadmin
 * This class adds the name of admin. Only one admin is authorised. This admin can 
 * remove a Developer entry.
 */
public class Admin implements EmployeeInterface{
	int age=0;
	String name=null;
	Scanner sc=new Scanner(System.in);
	public void insert(String a,int b)
	{
		if(name==null)
		{
			name=a.toLowerCase();
			age=b;
		}
		else
		{
			System.out.println("Only 1 admin at a time");
			return;
		}
	}
	/**
	 * Deletes a Developer object from List 
	 */
	void deleteDeveloper()
	{
		int foundFlag=0;
		String delName="";
		System.out.println("Enter the name of the developer to fire : ");
		delName=sc.nextLine().toLowerCase();
		for(int i=0;i<Developer.listObject.size();i++)
		{
			if((Developer.listObject.get(i).name).equals(delName))
			{
				foundFlag=1;
				Developer.listObject.remove(i);
				//Developer.listAge.remove(i);
			}
		}
		if(foundFlag==0)
		{
			System.out.println("Developer "+delName+" not found");
		}
		else
		{
			System.out.println("Developer "+delName+" removed");
		}
	}
	@Override
	public void sortName() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sortAge() {
		// TODO Auto-generated method stub
		
	}
}
