
public abstract class Figure {
    private String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Figure(String kind) {
        this.kind = kind;
    }
    
    abstract void calculate_area();
    
    
}
