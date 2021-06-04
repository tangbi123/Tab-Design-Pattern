package Composite;

public class CompositeMain {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries ... ");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory userDir = new Directory("user");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(userDir);
            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));
            rootDir.printList();

            System.out.println();
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            userDir.add(yuki);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            rootDir.printList();
        }catch (FileTreatmemtException e){
            e.printStackTrace();
        }

    }
}
