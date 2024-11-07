import java.util.ArrayList;
import java.util.regex.*;
import java.util.*;
public class RegExMail{
    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
  
    public static void main(String[] args) 
    { 
        ArrayList<String> address = new ArrayList<>(); 
            
        address.add("sonu.ok433gmail.com"); 
        address.add("sonu.ok433@gmail.com"); 
            
        for(String i : address){ 
            if (isValid(i)) 
                System.out.println(i + " - Yes"); 
            else
                System.out.println(i + " - No"); 
        } 
    } 
}