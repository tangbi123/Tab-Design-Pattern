package Visitor;

public class VisitorMain {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory userDir = new Directory("user");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(userDir);
        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));
        rootDir.accept(new ListVisitor());
    }
}
