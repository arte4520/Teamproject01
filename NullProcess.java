package teamproject01;

public class NullProcess {

	NullProcess() {

	}

	String[][] makenullstring(String[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = String.valueOf(board[i][j]);
			}
		}

		return board;
	}

}