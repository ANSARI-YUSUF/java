 class Garbage1{  
 public void finalize(){System.out.println("object is garbage collected");}  
 public static void main(String args[]){  
  Garbage1 s1=new Garbage1();  
  Garbage1 s2=new Garbage1();  

  s1=null;  
  s2=null;  
  System.gc();  
 }  
}  