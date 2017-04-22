package mapsql.sql.test;

import mapsql.sql.condition.Equals;
import mapsql.sql.condition.GreaterThan;
import mapsql.sql.condition.GreaterThanOrEqual;
import mapsql.sql.condition.NotEqual;
import mapsql.sql.core.Field;
import mapsql.sql.core.SQLException;
import mapsql.sql.core.SQLManager;
import mapsql.sql.core.SQLResult;
import mapsql.sql.core.SQLStatement;
import mapsql.sql.field.CHARACTER;
import mapsql.sql.field.INTEGER;
import mapsql.sql.statement.CreateTable;
import mapsql.sql.statement.Delete;
import mapsql.sql.statement.Insert;
import mapsql.sql.statement.Select;
import mapsql.sql.statement.Update;

public class ExampleTable {

	static SQLManager manager = new SQLManager();
	
	public static void main(String[] args) {
		
		createTableStatement();
		showTables();
		insertData();
		insertData2();
		insertData3();
		//updateData();
		//deleteData();
		selectTable();
		
	}
	
	public static void executeStatement(SQLStatement statement) {
		try {
			SQLResult result = manager.execute(statement);
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void createTableStatement() {
		executeStatement(
				new CreateTable(
						"contact", 
						new Field[] {
								new INTEGER("id", true, false, true), 
								new CHARACTER("name", 30, false, true), 
								new CHARACTER("email", 30, false, false)
						}
				)
		);
	}
	
	public static void showTables() {
		executeStatement(new Select("mapsql.tables", new String[] { "*" }));
	}
	
	public static void selectTable() {
		executeStatement(new Select("contact", new String[] { "*" }));
	}
	
	public static void insertData() {
		executeStatement(
				new Insert(
						"contact", 
						new String[] {"name", "email"}, 
						new String[] {"", "robert@monfrancais.net"}
				)
		);
	}
	
	public static void insertData2() {
		executeStatement(
				new Insert(
						"contact", 
						new String[] {"name", "email"}, 
						new String[] {"Hak", "hakeemGoloba"}
				)
		);
	}
	
	public static void insertData3() {
		executeStatement(
				new Insert(
						"contact", 
						new String[] {"name", "email"}, 
						new String[] {"Dullah", "DullahNaveed"}
				)
		);
	}
	
	public static void updateData() {
		executeStatement(
				new Update(
						"contact", 
						new String[] {"email"}, 
						new String[] {"HakAttack"}, 
						new Equals("id", "1")
				)
		);
	}

	public static void deleteData() {
		executeStatement(new Delete("contact", new Equals("id", "2")));
	}
	
}
