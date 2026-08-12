public class Division {
    public float divisionOfTwoIntegers(int a,int b){
        return a%b;
    }
}
class Solve{
    public static void main(String[] args){
        Division d=new Division();
        float r=d.divisionOfTwoIntegers(6,2);
        System.out.println(r);
    }
}
