package Builder;

public class TextBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("==============\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("s " +str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for(String item : items){
            buffer.append("   ~" + item + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("==============\n");
    }

    public String getResult(){
        return buffer.toString();
    }
}
