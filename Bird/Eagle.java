//Source file: C:\\Users\\Kky6-Win11\\Desktop\\Eagle.java


public class Eagle extends Bird 
{
   
   /**
   @roseuid 658FE45D0315
    */
   public Eagle() 
   {
      theFlyBehavior = new FreeFly();
      theSwimBehavior = new UnableSwim();
   }
   
   /**
   @roseuid 658FE4650342
    */
   @Override
   public void display() 
   {
      super.display();
      System.out.println("我是一只鸽子");
   }
}
