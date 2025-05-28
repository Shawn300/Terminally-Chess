class Queen extends Piece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public String toString() {
        if ("white".equals(this.color)) {
            return "\u2655"; // White queen
        } else if ("black".equals(this.color)) {
            return "\u265B"; // Black queen
        } else {
            return "Q"; // Neutral/unknown color
        }
    }
}