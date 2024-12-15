//Source file: C:\\Users\\Kky6-Win11\\Desktop\\Bird.java


public abstract class Bird 
{
   protected FlyBehavior theFlyBehavior;
   protected SwimBehavior theSwimBehavior;
   
   /**
   @roseuid 658FE0BF0164
    */
   public Bird() 
   {
    
   }
   
   /**
   @roseuid 658FE0560321
    */
   public void fly() 
   {
     theFlyBehavior.fly();
   }

   public void swim()
   {
      theSwimBehavior.swim();
   }

   /**
   @roseuid 658FE0970074
    */
   public void display() 
   {
    
   }
}
