class King extends Piece {
    public King(String color) {
        super(color);
    }

    @Override
    public String toString() {
        if ("white".equals(this.color)) {
            return "\u2654"; // White king
        } else if ("black".equals(this.color)) {
            return "\u265A"; // Black king
        } else {
            return "K"; // Neutral/unknown color
        }
    }
}