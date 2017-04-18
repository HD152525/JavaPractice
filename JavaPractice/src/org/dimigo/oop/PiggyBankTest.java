/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_&{type_name}
 *	
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 * 
 * @author : john
 * @version : 1.0
 */
public class PiggyBankTest extends PiggyBank{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FamilyMember[] fm = {
				new FamilyMember("엄마"),
				new FamilyMember("아빠"),
				new FamilyMember("나"),
				new FamilyMember("남동생")
		};
		 FamilyMember.printMemberCnt(); 
		  
		  
		          PiggyBank pg = new PiggyBank(); 
		          pg.putMoney(fm[0], 10000); 
		          pg.putMoney(fm[1], 5000); 
		          pg.putMoney(fm[2], 2000); 
		          pg.putMoney(fm[3], 1000); 
		 
		  
		          PiggyBank.printBalance(); 
		  
		  
		          pg.putMoney(fm[2], 1000); 
		          PiggyBank.printBalance(); 

		}
	}

