package equalshashcode;

public class EqualsHashCode {
	
	public static void main(String args[])	{
		User user1 = new User("Venkat", 37);
		User user2 = new User("Ravi", 32);
		User user3 = new User("Venkat", 37);
		String diff = new String("Sager");
		
		System.out.println("Is user1 equals to user1 " + user1.equals(user1));
		System.out.println("Is user1 equals to user2 " + user1.equals(user2));
		System.out.println("Is user1 equals to diff  " + user1.equals(diff));
		System.out.println("Is user2 equals to user1 " + user2.equals(user1));
		System.out.println("Is user1 equals to user3 " + user1.equals(user3));
		System.out.println("Is user3 equals to user1 " + user3.equals(user1));
	}

}

class User	{
	
	private String name;
	private int age;
	
	public User(String name, int age)	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o)	{
		
		if(o==this)	return true;
		
		if(!(o instanceof User))	{
			return false;
		}
		
		User user = (User)o;
		
		if(user.hashCode()!=this.hashCode())	{
			return false;
		}
		
		return (user.name.equals(this.name)
				&&user.age==this.age);
		
	}
	
	@Override
	public int hashCode()	{
		int hash = 17;
		hash = 31 * name.hashCode();
		hash = hash + age;
		
		return hash;
	}
	
	
}