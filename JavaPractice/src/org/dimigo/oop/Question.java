/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_&{type_name}
 *	
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author       : john
 * @version		 : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions = {"1. 가장 좋아하는 가수는?","2. 가장 좋아하는 배우는?","3. 가장 좋아하는 과목은?"};
		String[] answers = {"빅뱅","공유","미적분1"};
		StringBuilder sb = new StringBuilder("<<결과 출력>>\n");
		for(int i=0; i < 3; i++)
		{
			System.out.println(questions[i]);
			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			if(answers[i].equals(answer))
			{
			System.out.println("정답입니다!");	
			}
			else
			{
				System.out.println("틀렸습니다!");
			}
		}
		for(int i = 0; i < 3; i++)
		{
		sb.append(questions[i] + " " + answers[i]+ "입니다.\n");
		}
		System.out.println(sb);
	}
}
