class Bishop extends Piece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String toString() {
        if ("white".equals(this.color)) {
            return "\u2657"; // White bishop
        } else if ("black".equals(this.color)) {
            return "\u265D"; // Black bishop
        } else {
            return "B"; // Neutral/unknown color
        }
    }
}