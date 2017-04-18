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
 * @author       : john
 * @version		 : 1.0
 */
public class PiggyBank extends FamilyMember{
	
	
	private static int balance;
	public void putMoney(FamilyMember member,int amount)
	{
		balance += amount;
		System.out.println(member.getMemberName() + ":" +amount+"원 넣음");
	}
	public static void printBalance()
	{
		System.out.println("돼지저금통 총 금액 :"+balance);
	}
	
}
