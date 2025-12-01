 class Calculator{
     int add(int n1, int n2){
        return n1+n2;
    }
}


public class Method{
    public static void main(String args[]){
Calculator calc = new Calculator();
int result=calc.add(4,5);
System.out.println("sum: " + result);
    }
}