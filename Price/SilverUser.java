//Source file: C:\\Users\\Kky6-Win11\\Desktop\\SilverUser.java


public class SilverUser extends User {
   @Override
   public double calculatePrice() {
      // SilverUser可以有自己的计价策略（9折）
      if (getStrategy() == null) {
         // 默认使用折扣价策略（9折）
         setStrategy(new DiscountedSilverPrice());
      }
      return getStrategy().calculatePrice();
   }
}
