public class Horse2 extends ChessPiece {
    public Horse2(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)) {
            if (!(line == toLine && column == toColumn)) {
                if (!(line == toLine ^ column == toColumn) &&
                        (Math.abs(toLine - line) <= 2 && Math.abs(toColumn - column) <= 2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
