public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((toLine < 8 && toLine >= 0) && (toColumn < 8 && toColumn >= 0)) {
            if (!(line == toLine && column == toColumn)) {
                if ((line == toLine) || (column == toColumn)) {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}