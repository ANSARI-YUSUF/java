import java.util.*;
import java.lang.*;

class stack{
    public static void main(String[]args){

        Stack <String> s=new Stack<String>();


        s.push("yusuf");
        s.push("jannat");
        s.push("dati");
        s.push("sanjay");
        s.push("ashish");
        s.push("sneh");
        s.pop();
        System.out.println("Stack="+s);
        System.out.println("Stack="+s.peek());
    }
    
    }


