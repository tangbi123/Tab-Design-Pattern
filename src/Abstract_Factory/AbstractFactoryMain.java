package Abstract_Factory;

import Abstract_Factory.factory.Factory;
import Abstract_Factory.factory.Link;
import Abstract_Factory.factory.Page;
import Abstract_Factory.factory.Tray;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main Abstract_Factory.listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);
        System.out.println(args[0]);
        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报","http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo", "http://www.yahoo.com");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Page page = factory.createPage("linkPage", "杨文轩");
        page.add(traynews);
        //page.add(traynews)
        page.output();
    }
}
