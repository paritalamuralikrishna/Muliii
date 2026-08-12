public class Division {
    public float divisonOfTwoNumbers(int a,int b){
        return a%b;
    }
}
class Solve{
    public static void main(String[] args){
        Division d=new Division();
        float r=d.divisonOfTwoNumbers(3,6);
        System.out.println(r);
    }
}
