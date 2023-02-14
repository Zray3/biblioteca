package library;

public abstract class Publication {
    private String editor;
    private int numPag;
    private boolean color;

    public int getNumPag() {
        return numPag;
    }

    public String getEditor() {
        return editor;
    }

    public boolean isColor() {
        return color;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public Publication(String editor, int numPag, boolean color){
        this.editor = editor;
        this.numPag = numPag;
        this.color = color;
    }



}
