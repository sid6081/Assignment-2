import java.util.*;

/**
 * @author impadmin
 * This class adds the names and ages of the Developer to LinkedList and also
 * provides methods to sort the Developer info by name or age.
 */
class Developer implements EmployeeInterface
{
	Scanner sc=new Scanner(System.in);
	String name;
	int age;
	static int dev_count=0;
	static List<String> listName=new LinkedList<String>();
	static List<Integer> listAge=new LinkedList<Integer>();
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
		for(int i=0;i<listName.size()-1;i++)
		   {
		   		for(int j=i+1;j<listName.size();j++)
		   		{
		   			if((listName.get(i)).compareToIgnoreCase(listName.get(j))>0)
		   			{
		   				listName.add(listName.get(i));
		   				listName.set(i, listName.get(j));
		   				listName.set(j, listName.get(listName.size()-1));
		   				listName.remove(listName.size()-1);
		   				
		   				listAge.add(listAge.get(i));
		   				listAge.set(i, listAge.get(j));
		   				listAge.set(j, listAge.get(listAge.size()-1));
		   				listAge.remove(listAge.size()-1);
		   			}
		   		}
		   }
		for(int i=0;i<listName.size();i++)
		{
			temp=1;
			System.out.println(listName.get(i)+" : "+listAge.get(i));
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
		for(int i=0;i<listAge.size()-1;i++)
		   {
		   		for(int j=i+1;j<listAge.size();j++)
		   		{
		   			if((listAge.get(i))>(listAge.get(j)))
		   			{
		   				listName.add(listName.get(i));
		   				listName.set(i, listName.get(j));
		   				listName.set(j, listName.get(listName.size()-1));
		   				listName.remove(listName.size()-1);
		   				
		   				listAge.add(listAge.get(i));
		   				listAge.set(i, listAge.get(j));
		   				listAge.set(j, listAge.get(listAge.size()-1));
		   				listAge.remove(listAge.size()-1);
		   			}
		   		}
		   }
		for(int i=0;i<listAge.size();i++)
		{
			temp=1;
			System.out.println(listName.get(i)+" : "+listAge.get(i));
		}
		if(temp==0)
		{
			System.out.println("Developer list empty");
		}
	}
	
}
