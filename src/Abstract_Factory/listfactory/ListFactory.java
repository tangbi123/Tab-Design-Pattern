package Abstract_Factory.listfactory;

import Abstract_Factory.factory.Factory;
import Abstract_Factory.factory.Link;
import Abstract_Factory.factory.Page;
import Abstract_Factory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
        //return null;
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
        //return null;
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
        //return null;
    }
}
