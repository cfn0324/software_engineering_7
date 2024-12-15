//Source file: C:\\Users\\Kky6-Win11\\Desktop\\RegularUser.java


public class RegularUser extends User {
   @Override
   public double calculatePrice() {
      if (getStrategy() == null) {
         // 默认使用全价策略
         setStrategy(new FullPrice());
      }
      return getStrategy().calculatePrice();
   }
}
