package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount; //Piece move count

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	////Piece move count
	public int getMoveCount() {
		return moveCount;
	}
	
	//Piece move count
	public void increaseMoveCount() {
		moveCount++;
	}
	
	//Piece move count
	public void decreaseMoveCount() {
		moveCount--;
	}
	
	//Check logic
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean IsThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}
