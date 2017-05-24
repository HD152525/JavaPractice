/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 	|_&{type_name}
 *	
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author       : john
 * @version		 : 1.0
 */
public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	void insert();
	void search();
	void update();
	void delete();
	public static IDBManager getDBObject(String db)
	{
		if(db.equals(ORACLE_DATABASE)){
			return new OracleDB();
		}
		else if(db.equals(SYBASE_DATABASE)){
			return new SybaseDB();
		}
		else return null;
	}

}
