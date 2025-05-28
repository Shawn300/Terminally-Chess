class Knight extends Piece {
    public Knight(String color) {
        super(color);
    }

    @Override
    public String toString() {
        if ("white".equals(this.color)) {
            return "\u2658"; // White knight
        } else if ("black".equals(this.color)) {
            return "\u265E"; // Black knight
        } else {
            return "N"; // Neutral/unknown color
        }
    }
}