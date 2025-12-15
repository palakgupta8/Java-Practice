public class Exercise {
    public static void main(String[] args) {
      int[]number={16,22,89,16,90,90};
      int min=number[0];
      int max=number[0];
      
      for(int num:number){
          if(num<min){
              min=num;
          }
          if(num>max){
              max=num;
          }
      }
          System.out.println("Smallest: "+min);
          System.out.println("Largest: "+max);
    }
}