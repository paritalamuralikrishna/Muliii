class add{
      public int additionOfTwoNumbers(int a, int b){
               return a+b;
      }
      public int additionOfThreeNumbers(int a, int b, int c){
        return a+b+c;
    }
}
class Main{
   public static void main(String[] args){
      add a=new add();
      int r=a.additionOfTwoNumbers(3,5);
      System.out.println(r);
  }
}
