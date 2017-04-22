package practical5;

public class Person
{
		Person(String name2, int age2)
		{
			this.name=name2;
			this.age=age2;
		}
		
		String getDetails()
		{	
			String Details = name + " " + "("+age+")";
			return Details;
		}
		
		
		private
			int age;
			String name;
}
