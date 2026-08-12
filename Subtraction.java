public class Subtraction {
    public int subOfTwoNumbers(int a,int b){
        return a-b;
    }
    public int sumOfThreeNumbers(int a,int b,int c){return a-b-c;}
}
class hello{
    public static void main(String[] args){
        Subtraction s=new Subtraction();
        int r=s.subOfTwoNumbers(5,3);
        System.out.println(r);
    }
}
