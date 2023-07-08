class Bank2 
{
	public static void main(String[] args) 
	{
		Account ob=new Account("Vishal", "Virar");
		System.out.println(ob.getName());
		System.out.println(ob.getAddress());
		ob.deposit(1000);
		System.out.println(ob.getBalance());
		ob.deposit(2000);
		System.out.println(ob.getBalance());
		ob.withdrawl(1000);
		System.out.println(ob.getBalance());
		}
}

class Account extends Person
{
	int Acno;
	float balance;
	Account(String n,String a)
	{
		super(n,a);
		Acno=0;
		balance=0.0f;
	}
	float getBalance()
	{
		return balance;
	}
	int getAcno()
		{
		return Acno;
	}
	void deposit(float k)
	{
		balance = balance+k;
	}
	void withdrawl(int k){
		balance= balance - k;
	}
}
class Person
{
	String name;
	String address;
	Person(String n,String a)
	{
		name=n;
		address=a;
		System.out.println("Person");
	}
	String getName()
	{
		return name;
	}
	void setName(String n)
	{
		name=n;
	}
	String getAddress()
	{
		return address;
	}
	void setAddress(String a)
	{
		address=a;
	}
}