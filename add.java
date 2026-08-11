class add{
      public int additionOfTwoNumbers(int a, int b){
               return a+b;
      }
}
class Main{
   public static void main(String[] args){
      add a=new add();
      int r=a.additionOfTwoNumbers(3,5);
      System.out.println(r);
  }
}
