package daysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author David Liotta
 *
 *This program is used to utilize maps to create a phone book that can check if a name is in the book
 */
public class day08 {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int cont = scan.nextInt();
		Map phoneBook = new HashMap<String, Integer>();
		
		for(int i = 0; i < cont; i++){
            String name = scan.next();
            int phone = scan.nextInt();
            phoneBook.put(name, phone);
        }
        while(scan.hasNext()){
            String s = scan.next();
            if(phoneBook.containsKey(s))
            	System.out.println(s + "=" + phoneBook.get(s));
            else
            	System.out.println("Not found");
        }
        scan.close();
	}
}
