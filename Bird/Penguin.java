//Source file: C:\\Users\\Kky6-Win11\\Desktop\\Penguin.java


public class Penguin extends Bird 
{
   
   /**
   @roseuid 658FE42E0142
    */
   public Penguin() 
   {
      theFlyBehavior = new UnableFly();
      theSwimBehavior = new FreeSwim();
   }
   
   /**
   @roseuid 658FE44403B6
    */
   @Override
   public void display() 
   {
      super.display();
      System.out.println("我是一只企鹅");
   }
}
