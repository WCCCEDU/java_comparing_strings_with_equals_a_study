/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsandobject;

/**
 *
 * @author Paul Scarrone
 */
public class StringsandObject {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

	String literalString1 = "HI";
	String literalString2 = "HI";

	System.out.println("Comparing String Literals");
	if(literalString1 == literalString2){
	  System.out.println("The Same by ==");
	} else {
	  System.out.println("Not The Same");
	}
	System.out.println("Hash Codes");
	System.out.println(System.identityHashCode(literalString1));
	System.out.println(System.identityHashCode(literalString2));

	String newHiString1 = new String("HI");
	String newHiString2 = new String("HI");

	System.out.println("\nComparing String Instance Literals");
	if(newHiString1 == newHiString2){
	  System.out.println("The Same by ==");
	} else if(newHiString1.equals(newHiString2)) {
	  System.out.println("The Same By .equals()");
	} else {
	  System.out.println("Not The Same");
	}
	System.out.println("Hash Codes");
	System.out.println(System.identityHashCode(newHiString1));
	System.out.println(System.identityHashCode(newHiString2));

	String h = "H";
	String i = "I";
	String concatedString1 = "H" + "I";
	String concatedString2 = h + i;

	System.out.println("\nComparing Constructed Strings");
	if(concatedString1 == concatedString2){
	  System.out.println("The Same by ==");
	} else if(concatedString1.equals(concatedString2)) {
	  System.out.println("The Same By .equals()");
	} else {
	  System.out.println("Not The Same");
	}
	System.out.println("Hash Codes");
	System.out.println(System.identityHashCode(concatedString1));
	System.out.println(System.identityHashCode(concatedString2));

	String upperStringLiteral = "HI";
	String lowerStringLiteral = "hi";

	System.out.println("\nComparing Unlike Strings");
	if(upperStringLiteral == lowerStringLiteral){
	  System.out.println("The Same by ==");
	} else if(upperStringLiteral.equals(lowerStringLiteral)) {
	  System.out.println("The Same By .equals()");
	} else {
	  System.out.println("Not The Same");
	}
	System.out.println("Hash Codes");
	System.out.println(System.identityHashCode(concatedString1));
	System.out.println(System.identityHashCode(concatedString2));
  }
}
