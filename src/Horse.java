public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // check coordinate
        if (chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)) {
            if (!(line == toLine && column == toColumn) &&
                    // final cell null
                    chessBoard.board[toLine][toColumn] == null ||
                    // final cell not current color
                    !chessBoard.board[toLine][toColumn].color.equals(this.color) &&
                            // starting cell is not empty
                            chessBoard.board[line][column] != null) {
                // starting cell is not horse
                if (!chessBoard.board[line][column].equals(this)) {
                    return false;
                }
                int deltaLine = toLine - line;
                int deltaColumn = toColumn - column;

                return 5 == deltaLine * deltaLine + deltaColumn * deltaColumn;

//                int row = Math.abs(toLine - line);
//                int col = Math.abs(toColumn - column);
//                return ((row == 2 && col == 1) || (row == 1 && col == 2));
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
