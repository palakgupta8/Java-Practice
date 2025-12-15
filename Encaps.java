//Encapsulations

class Human{
    private String name;
    private int age;

    public void setName(String n){// setter methos
        name=n;
    }

    public void setAge(int a){// setter method
        age=a;
    }

    public String getName(){//getter method
        return name;
    }

    public int getAge(){//getter method
        return age;
    }
}

public class Encaps{
    public static void main(String []args){
        Human obj=new Human();
        obj.setName("Palak Gupta");
        obj.setAge(23);
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}