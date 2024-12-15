//Source file: C:\\Users\\Kky6-Win11\\Desktop\\Client.java


public class Client {
   public static void main(String[] args) {
      // 创建用户
      User regularUser = new RegularUser();
      User goldUser = new GoldUser();
      User silverUser = new SilverUser();

      // 计算房价
      double regularUserPrice = regularUser.calculatePrice();
      double goldUserPrice = goldUser.calculatePrice();
      double silverUserPrice = silverUser.calculatePrice();

      // 打印结果
      System.out.println("Regular User Price: " + regularUserPrice);
      System.out.println("Gold User Price: " + goldUserPrice);
      System.out.println("Silver User Price: " + silverUserPrice);
   }
}
