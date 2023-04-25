public class King extends ChessPiece {
    public King(String color) {
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
                if ((Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 1) ||
                        ((Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 0)
                                || (Math.abs(toLine - line) == 0 && Math.abs(toColumn - column) == 1))) {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        boolean isUnderAttack = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chessBoard.board[i][j] != null) {
                    if (!chessBoard.board[i][j].getColor().equals(color)) {
                        if (chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                            isUnderAttack = true;
                        }
                    }
                }
            }
        }
        return isUnderAttack;
    }
}
