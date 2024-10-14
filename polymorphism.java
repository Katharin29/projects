class Animal{
    public void move(){
        System.out.println("sit");
    }
}
class cheetah extends Animal{
    public void move(){
        System.out.println("Run");
        super.move();
    }
}

public  class Main{
    public static void main(String[]args){
        cheetah c=new cheetah();
        c.move();
    }
}
