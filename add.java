class add{
      public int additionOfTwoNumbers(int a, int b){
               return a+b;
      }
      public int additionOfThreeNumbers(int a, int b, int c){
        return a+b+c;
    }
      public int additionOfFourNumbers(int a,int b,int c,int d){ return a+b+c+d;}
}
class Main{
   public static void main(String[] args){
      add a=new add();
      int r=a.additionOfTwoNumbers(3,5);
      System.out.println(r);
      int res=a.additionOfThreeNumbers(3,45,6);
      System.out.println(res);
  }
}
