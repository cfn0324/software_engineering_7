//Source file: C:\\Users\\Kky6-Win11\\Desktop\\User.java


public abstract class User {
   private PricingStrategy strategy;

   public void setStrategy(PricingStrategy strategy) {
      this.strategy = strategy;
   }

   protected PricingStrategy getStrategy() {
      return strategy;
   }

   public abstract double calculatePrice();
}
