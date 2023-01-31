package ca.brennanleblanc.SWE4403Lab2.E01;

public class Text implements Component{
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Text clone() {
        return new Text(content);
    }

    @Override
    public String toString() {
        return "Text [content=" + content + "]";
    }
}
