package piece;

import game.FieldSquare;

public class PieceShapeJ extends PieceShape {
	private static final FieldSquare[][][] shapes = {
			{ 
				{ FieldSquare.EMPTY, FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.EMPTY }, 
				{ FieldSquare.EMPTY, FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.EMPTY }, 
				{ FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.EMPTY }, 
				{ FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY } 
			},
			{ 
				{ FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY }, 
				{ FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.PIECE, FieldSquare.EMPTY }, 
				{ FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY }, 
				{ FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY } 
			},
			{ 
				{ FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.EMPTY }, 
				{ FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY }, 
				{ FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY }, 
				{ FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY } 
			},
			{ 
				{ FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY }, 
				{ FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY }, 
				{ FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY }, 
				{ FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY } 
			} 
	};

	public PieceShapeJ() {
		super();
	}

	@Override
	protected FieldSquare[][][] getShapes() {
		return shapes;
	}
}
