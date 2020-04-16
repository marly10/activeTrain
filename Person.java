public class Person
{
  // instance variables
    
    private int age;
    private String name;
    private int ID;
    static int countId = 0;
    
 public Person()
{
    name = ""; //return an empty name
}
  
// allows client to set beginning values
    public Person( int age, String name, int ID )
    {
     
     this.age = age ;   
     this.name = name;      
     this.ID = ID;
     countId++; 

    }
//toString method
    public String toString()
    {
       String toReturn = "Age: "+age+"\n";
       toReturn += "Name: "+name+"\n";
       toReturn += "ID: "+ID+"\n";
       
       return toReturn;  //we create a string a then build it up before returning it.
    }
    
    //getters method start
    public int getNewAge()
{

    return age;
}

    public String getNewName()
{

    return name;
}

    public int getNewID()
{
    return ID;
}

    public int getNewcountId()
{
    return countId;
}

//auto increasing file
public static int getCountId()
   {
      return countId;
   } 
   
   //equal method
    public boolean equals(Object o) 
   {
      if(! (o instanceof Person))
      {
      	 return false;
      }
      else
      {
         Person p4 = (Person) o;
         
         if(p4.age == age && p4.name == name && p4.ID == ID)
         {
            return true;
         }
      }
      return false;
   }

 }