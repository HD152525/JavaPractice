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
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember()
	{
	}
	
	public FamilyMember(String memberName)
	{
		this.memberName = memberName; 
		memberCnt++;

	}
	/**
	 * @return the memberName
	 */
	public String getMemberName() {
				return memberName;
	}


	/**
	 * @param memberName the memberName to set
	 */


	public static void printMemberCnt()
	{
		System.out.println("가족 총 인원 수" + " : " + memberCnt+ "명");
	}

}
