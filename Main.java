  class Main{
    public static void main (String args[]){
        int i=1;
        //while loop
        while(i<=4){
            System.out.println("Hi "+i);
            //nested while loop
            int j=1;
            while(j<=3){
                System.out.println("hello "+j);
                j++;
            }
            i++;
        }
        System.out.println("bye "+ i);
    }
}
