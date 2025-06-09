class Piece {
    protected String color;

    public Piece(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "?"; 
    }
}
