package mapsql.sql.condition;

import java.util.Map;

import mapsql.sql.core.Field;
import mapsql.sql.core.SQLException;
import mapsql.sql.core.TableDescription;

public class Like extends AbstractCondition {
	private String column;
	private String value;

	public Like(String column, String value) {
		this.column = column;
		this.value = value;
	}

	@Override
	public boolean evaluate(TableDescription description, Map<String, String> data) throws SQLException {
		Field field = description.findField(column);
		String col=field.toValue(data.get(column)).toString();
		String element=field.toValue(value).toString();
		char a='%';
		if(element.charAt(0)==a)
		{
			if(col.startsWith(element.substring(1)))
			{
				return true;
			}
		}
		if(element.charAt(element.length()-1)==a)
		{
			if(col.endsWith(element.substring(0, element.length()-1)))
			{
				return true;
			}
		}
		
		if(element.charAt(element.length()-1)==a&&element.charAt(0)==a)
		{
			if(col.contains(element.substring(1, element.length()-1)))
			{
				return true;
			}
		}
		
		return false;
	}
}