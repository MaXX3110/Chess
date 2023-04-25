public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int dir; // direction
        int startPos; // start position pawn

        if (getColor().equals("White")) {
            dir = 1;
            startPos = 1;
        } else if (getColor().equals("Black")) {
            dir = -1;
            startPos = 6;
        } else return false;

        if ((toLine < 8 && toLine >=0) && (toColumn < 8 && toColumn >= 0)) {
            if (!(line == toLine && column == toColumn)) {
                if (column == toColumn) {
                    if (line + 2 * dir == toLine && line == startPos) {
                        return true;
                    } else {
                        return line + dir == toLine;
                    }
                } else return false;
            } else return false;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}