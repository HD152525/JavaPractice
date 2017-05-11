/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_&{type_name}
 *	
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 * 
 * @author       : john
 * @version		 : 1.0
 */
public class PersonTest2 {
public static void main(String[] args) {
	Person[] p = {new Person("Tom"),
			new Korean("홍길동"),
			new Japanese("다나카"),
			new Chinese("왕밍")};
	for(int i = 0; i < p.length; i++){
		greeting(p[i]);
	}
//	Korean k = new Korean("홍길동");
//	Japanese j = new Japanese("다나카");
//	Chinese c = new Chinese("왕밍");
//	System.out.println();
//	p.sayHello();
//	k.sayHello();
//	j.sayHello();
//	c.sayHello();
//	System.out.println();
//	p.sayBye();
//	k.sayBye();
//	j.sayBye();
//	c.sayBye();
}
private static void greeting(Person p){
	System.out.println(p.toString());
	p.sayHello();
	p.sayBye();
	System.out.println("");
}
}
