//Source file: C:\\Users\\Kky6-Win11\\Desktop\\GoldUser.java


public class GoldUser extends User {
   @Override
   public double calculatePrice() {
      if (getStrategy() == null) {
         // 默认使用折扣价策略（8折）
         setStrategy(new DiscountedGoldPrice());
      }
      return getStrategy().calculatePrice();
   }
}
