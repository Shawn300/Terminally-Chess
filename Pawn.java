class Pawn extends Piece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String toString() {
        if ("white".equals(this.color)) {
            return "\u2659"; // White pawn
        } else if ("black".equals(this.color)) {
            return "\u265F"; // Black pawn
        } else {
            return "P"; // Neutral/unknown color
        }
    }
}