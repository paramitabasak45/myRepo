/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		Employee emp=new Employee();
		ArrayList<Employee> employees=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		    String name=sc.nextLine();
		    String address=sc.nextLine();
		    String phoneNumber=sc.nextLine();
		    String email=sc.nextLine();
		    employees.add(new Employee(name,address,phoneNumber,email));
		}
		String searchName=sc.nextLine();
		for(Employee e:employees)
		{
		    if(e.getName().equalsIgnoreCase(searchName)){
		        System.out.println(e.getName()+": "+e.getAddress()+"; "+e.getPhoneNumber()+"; "+e.getEmail());
		    }
		}
		sc.close();
	}
}
class Employee{
    String name;
    String address;
    String phoneNumber;
    String email;
    Employee(){}
    Employee(String name,String address,String phoneNumber,String email)
    {
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
