package mapsql.sql.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import mapsql.sql.condition.AndCondition;
import mapsql.sql.condition.Equals;
import mapsql.sql.condition.GreaterThan;
import mapsql.sql.condition.GreaterThanOrEqual;
import mapsql.sql.condition.LessThan;
import mapsql.sql.condition.LessThanOrEqual;
import mapsql.sql.condition.Like;
import mapsql.sql.condition.NotEqual;
import mapsql.sql.condition.OrCondition;
import mapsql.sql.core.Condition;
import mapsql.sql.core.Field;
import mapsql.sql.core.SQLCommand;
import mapsql.sql.core.SQLException;
import mapsql.sql.core.SQLManager;
import mapsql.sql.core.SQLResult;
import mapsql.sql.core.SQLStatement;
import mapsql.sql.field.CHARACTER;
import mapsql.sql.field.INTEGER;
import mapsql.sql.statement.CreateTable;
import mapsql.sql.statement.Delete;
import mapsql.sql.statement.DropTable;
import mapsql.sql.statement.Insert;
import mapsql.sql.statement.Select;
import mapsql.sql.statement.Update;

public class Sources implements SQLCommand {
	private String filename;
	
	public Sources(String filename) {
		this.filename = filename;
	}
	
	ArrayList<String> list=new ArrayList<String>();
	Iterator<String> it=list.iterator();
	public boolean check(int i)
	{
		if(list.get(i).equals("true"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Condition condition(String cond)
	{
		switch(cond)
		{
		case "Equals":return new Equals(list.get(4),list.get(5));
		case "And": return new AndCondition(new Equals(list.get(5),list.get(6)),new Equals(list.get(8),list.get(9)));
		case "GreaterThan": return new GreaterThan(list.get(4),list.get(5));
		case "GreaterThanOrEqual": return new GreaterThanOrEqual(list.get(4),list.get(5));
		case "LessThan": return new LessThan(list.get(4),list.get(5));
		case "LessThanOrEqual": return new LessThanOrEqual(list.get(4),list.get(5));
		case "Like": return new Like(list.get(4), list.get(5));
		case "NotEqual": return new NotEqual(list.get(4),list.get(5));
		case "Or": return new OrCondition(new Equals(list.get(5),list.get(6)), new Equals(list.get(8),list.get(9)));
			
		}
		return null;
		
	}
	
	
	public Condition conditionUpdate(String cond)
	{
		switch(cond)
		{
		case "Equals":return new Equals(list.get(5),list.get(6));
		case "And": return new AndCondition(new Equals(list.get(6),list.get(7)),new Equals(list.get(9),list.get(10)));
		case "GreaterThan": return new GreaterThan(list.get(5),list.get(6));
		case "GreaterThanOrEqual": return new GreaterThanOrEqual(list.get(5),list.get(6));
		case "LessThan": return new LessThan(list.get(5),list.get(6));
		case "LessThanOrEqual": return new LessThanOrEqual(list.get(5),list.get(6));
		case "Like": return new Like(list.get(5), list.get(6));
		case "NotEqual": return new NotEqual(list.get(5),list.get(6));
		case "Or": return new OrCondition(new Equals(list.get(6),list.get(7)), new Equals(list.get(9),list.get(10)));
			
		}
		return null;
		
	}
	
	public Condition conditionDelete(String cond)
	{
		switch(cond)
		{
		case "Equals":return new Equals(list.get(3),list.get(4));
		case "And": return new AndCondition(new Equals(list.get(4),list.get(5)),new Equals(list.get(7),list.get(8)));
		case "GreaterThan": return new GreaterThan(list.get(5),list.get(4));
		case "GreaterThanOrEqual": return new GreaterThanOrEqual(list.get(3),list.get(4));
		case "LessThan": return new LessThan(list.get(3),list.get(4));
		case "LessThanOrEqual": return new LessThanOrEqual(list.get(3),list.get(4));
		case "Like": return new Like(list.get(3), list.get(4));
		case "NotEqual": return new NotEqual(list.get(3),list.get(4));
		case "Or": return new OrCondition(new Equals(list.get(4),list.get(5)), new Equals(list.get(7),list.get(8)));
			
		}
		return null;
		
	}
	
	@Override
	public String execute(SQLManager manager) throws SQLException 
	{
		Scanner file = null;
		String line = "";
		
		try {
			 file= new Scanner(new File(filename));
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		while(file.hasNextLine())
		{
			line=file.nextLine();
			Scanner lineScan = new Scanner(line);
			
		
		
			while(lineScan.hasNext())
			{
				list.add(lineScan.next());
			}
			lineScan.close();
			
		
			
			switch(list.get(0))
			{
				case "createTableStatement":
				manager.execute(new CreateTable(
												list.get(1), 
												new Field[] {
														new INTEGER(list.get(3), check(4), check(5), check(6)), 
														new CHARACTER(list.get(8), Integer.parseInt(list.get(9)), check(10), check(11)), 
														new CHARACTER(list.get(13), Integer.parseInt(list.get(14)), check(15), check(16))
												}
										)
						);
				break;
				
				case "showTables": 
				SQLResult result=manager.execute(new Select(list.get(1),new String[] {list.get(2) }));		
				System.out.println(result);
				break;
				
				
				case "insertData":
				manager.execute(new Insert(list.get(1),new String[]{list.get(2),list.get(3)},new String[]{list.get(4),list.get(5)}));
				break;
				
				
				case "selectTable":
					String get="";
					boolean test=true;
					try
					{
						 get=list.get(4);
					}catch(IndexOutOfBoundsException e)
					{
						test=false;
					}
					
				if(test)
				{
					SQLResult result1=manager.execute(new Select(list.get(1),new String[]{ list.get(2) },condition(list.get(3)) ));
					System.out.println(result1);
				}
				else
				{
					SQLResult result1=manager.execute(new Select(list.get(1),new String[]{ list.get(2) }));
					System.out.println(result1);
				}

				break;
				
				case "updateData":
					manager.execute(new Update(list.get(1),new String[] { list.get(2) }, new String[] { list.get(3) } ,conditionUpdate(list.get(4))));
				break;
				
				case "deleteData" :
					manager.execute(new Delete(list.get(1), conditionDelete(list.get(2))));
					break;
					
				case "dropTable":
					manager.execute(new DropTable(list.get(1)));
					break;
				
				case "insertPartialData":
					manager.execute(new Insert(list.get(1), new String[]{list.get(2)}, new String[]{list.get(3)}));
					break;
				
				case "updateOrData":
					manager.execute(new Update(list.get(1), new String[]{list.get(2)}, new String[]{list.get(3)}, conditionUpdate(list.get(4))));
			}
		list.clear();
	}//end while
	file.close();
	return null;
	
}
}
