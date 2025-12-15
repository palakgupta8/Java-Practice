 class Calculator{
     int add(int n1, int n2){//method
        return n1+n2;
    }
}


public class Method{
    public static void main(String args[]){
Calculator calc = new Calculator();// creating object
int result=calc.add(4,5);//calling method
System.out.println("sum: " + result);
    }
}