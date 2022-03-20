public class Constructor1
{
   private static int HEADS = 1;
   private int value = 0;
   public void flip()
   {
      if (Math.random() < 0.5)
      {
          value = 0;
      }
      else
      {
         value = 1;
      }
   }
   public boolean isHeads()
   {
      return value == HEADS;
   }
   public boolean isTails()
   {
      return value == 0;
   }
   public String toString()
   {
      if (value == HEADS) return "Heads";
      else return "Tails";
   }
   public static void main(String[] args)
   {
      Constructor1 myCoin = new Constructor1();
      for (int i = 0; i < 10; i++)
      {
         System.out.println("In "+(i+1)+" iteration");
         myCoin.flip();
         System.out.println(myCoin);
         System.out.println(myCoin.isHeads());
         System.out.println(myCoin.isTails());
         System.out.println();
      }
   }
}
