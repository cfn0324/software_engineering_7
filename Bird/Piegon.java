//Source file: C:\\Users\\Kky6-Win11\\Desktop\\Piegon.java


import javax.management.DescriptorKey;

public class Piegon extends Bird
{
   
   /**
   @roseuid 658FE11B0295
    */
   public Piegon() 
   {
      theFlyBehavior = new FreeFly();
      theSwimBehavior = new UnableSwim();
   }
   
   /**
   @roseuid 658FE12800DC
    */
   @Override
   public void display() 
   {
    super.display();
    System.out.println("我是一只鸽子");
   }
}
