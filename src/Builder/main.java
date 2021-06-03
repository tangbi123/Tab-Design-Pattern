package Builder;

public class main {
    public static void main(String[] args) {
        if(args.length !=1 )
        {
            usage();
            System.exit(0);
        }
        if(args[0].equals("plain")){
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        }
        else if(args[0].equals("html")){
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.gerResult();
            System.out.println(filename + "文件编写完成");
        }
        else {
            usage();
            System.exit(0);
        }
    }

    private static void usage() {
        System.out.println("Usage: java main plain 编写纯文本");
        System.out.println("Usage: java main html 编写html文档");
    }
}
