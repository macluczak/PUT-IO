/*
Java Class example.
This Java class example describes how class is defined and being used
in Java language.
 
Syntax of defining java class is,
<modifier> class <class-name>{
  // members and methods
}
*/
 
public class JavaClassExample{
  /*
  Syntax of defining memebers of the java class is,
    <modifier> type <name>;
  */
  private String name;
  /*
  Syntax of defining methods of the java class is,
  <modifier> <return-type> methodName(<optional-parameter-list>) <exception-list>{
                    ...
  }
  */
  public void setName(String n){
    //set passed parameter as name
    name = n;
  }
  public String getName(){
    //return the set name
    return name;
  }
  //main method will be called first when program is executed
  public static void main(String args[]){
    /*
    Syntax of java object creation is,
    <class-name> object-name = new <class-constructor>;
    */
    JavaClassExample javaClassExample = new JavaClassExample();
    //set name member of this object
    javaClassExample.setName("Visitor");
    // print the name
    System.out.println("Hello new-feature 1" + javaClassExample.getName());
    System.out.println("changes 1" + javaClassExample.getName());
    System.out.println("changes 2" + javaClassExample.getName()); 
    System.out.println("changes 3" + javaClassExample.getName());               
  }
}
 
/*
OUTPUT of the above given Java Class Example would be :
Hello Visitor
dodany komentarz, zadanie 6 
*/