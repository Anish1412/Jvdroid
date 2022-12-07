/* import java.util.regex.Matcher;
import java.util.regex.Pattern; */
import java.util.regex.*;

public class Main {
  public static void main(String[] args) {
    //Checks single letter
    System.out.println("1. "+Pattern.matches("[abc]","a"));
    
    //Checks single letter
    System.out.println("2. "+Pattern.matches("[abc]?","a"));
    
    //Checks single or more letters by giving symbol + or *
    System.out.println("3. "+Pattern.matches("[abc]+","aabbcc"));
    
    //Checks single or more letters by giving symbol + or *
    System.out.println("4. "+Pattern.matches("[abc]*","aabbcc"));
    
     //Checks single or more letters by giving symbol + or *
    System.out.println("5. "+Pattern.matches("[A-Za-z0-9]*","Anish1412"));
    
    //Checks single letter
    System.out.println("6. "+Pattern.matches("[A-Za-z0-9]","A"));
    System.out.println("7. "+Pattern.matches("[A-Za-z0-9]","a"));
    System.out.println("8. "+Pattern.matches("[A-Za-z0-9]","4"));
    
    //Curly braces check the length is 9 or not
    System.out.println("9.1 "+Pattern.matches("[A-Za-z0-9]{9}","Anish1412"));
    //Curly braces check the length is atleast 7 or upto 9
    System.out.println("9.2 "+Pattern.matches("[A-Za-z0-9]{7,9}","Omkar192"));
    
    //Starts with "." and ends with given letter
    System.out.println("10. "+Pattern.matches(".n","An"));
    System.out.println("11. "+Pattern.matches("..i","Ani"));
    System.out.println("12. "+Pattern.matches("...s","Anis"));
    System.out.println("13. "+Pattern.matches("....h","Anish"));
    
    //Checks single digit
    System.out.println("14. "+Pattern.matches("\\d","1"));
    //Checks more than single digit by giving symbol + or *
    System.out.println("15. "+Pattern.matches("\\d+","13455"));
    
    //Checks single non-digit
    System.out.println("16. "+Pattern.matches("\\D","A"));
    //Checks more than single non-digit by giving symbol + or *
    System.out.println("17. "+Pattern.matches("\\D+","Anish"));
    
     //Checks single letter or digit
    System.out.println("18. "+Pattern.matches("\\w","A"));
    System.out.println("19. "+Pattern.matches("\\w","a"));
    System.out.println("20. "+Pattern.matches("\\w","2"));
    //Checks more than single letter or digits by giving symbol + or *    
    System.out.println("21. "+Pattern.matches("\\w+","Anish1412"));
    
    //Checks single space
    System.out.println("22. "+Pattern.matches("\\s"," "));
    //Checks more than single space by giving symbol + or *
    System.out.println("23. "+Pattern.matches("\\s+","       "));
    
    
    System.out.println("\nAnother methods to implement :-");
    //Another method 1
    Pattern p1 = Pattern.compile("\\d*");
    Matcher m1 = p1.matcher("4321");
    boolean b1 = m1.matches();
    System.out.println("24. "+b1);
    
    //Another method 2
    boolean b2 = Pattern.compile("....h").matcher("Anish").matches();
    System.out.println("25. "+b2);
    
    //Another method 3
    boolean b3 = Pattern.matches("\\w*","Anish2002");
    System.out.println("26. "+b3);
    
    System.out.println("\n27. "+Pattern.matches("[^abc]","5"));
     System.out.println("\n28. "+Pattern.matches("[^abc]*","rohini23"));
  }
}
