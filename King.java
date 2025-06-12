class King extends Piece {
    public King(String color) {
        super(color);
    }

	public boolean isValidPath(int xStart, int yStart, int xEnd, int yEnd) {
		return false;
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
