class Rook extends Piece {
    public Rook(String color) {
        super(color);
    }
    
    public String getColor() {
        return color;
    }
    
    @Override
    public String toString() {
        if ("white".equals(this.color)) {
            return "\u2656"; // White rook
        } else if ("black".equals(this.color)) {
            return "\u265C"; // Black rook
        } else {
            return "R"; // Neutral/unknown color
        }
    }
}
