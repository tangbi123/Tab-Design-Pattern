package Memento;

public class MementoMain {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for(int i = 0; i < 20; i++){
            System.out.println("====" + i);
            System.out.println("当前状态： " + gamer);
            gamer.bet();

            System.out.println("所持有金钱" + gamer.getMoney() + "元");

            if(gamer.getMoney() > memento.getMoney()){
                System.out.println("金钱增加，保存当前状态");
                memento = gamer.createMemento();
            }else if(gamer.getMoney() < memento.getMoney() / 2){
                System.out.println("金钱减少许多，恢复到以前状态");
                gamer.restoreMememto(memento);
            }

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
            System.out.println();
        }
    }
}
