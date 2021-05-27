package Singleton;

public class main {
    public static void main(String[] args) {
        System.out.println("start .");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("obj1 和 obj2 是相同的实例");
        }
        else{
            System.out.println("obj1 和 obj2 不 是相同的实例");
        }
        System.out.println("end .");
    }
}
