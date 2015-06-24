import java.util.*;

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
	static int devCount=0;
	static List<Developer> listObject=new LinkedList<Developer>();
	@Override
	public void insert(String a, int b) {
		// TODO Auto-generated method stub
		name=a.toLowerCase();
		age=b;
	}

	@Override
	public void sortName() {
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
	public void sortAge() {
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
