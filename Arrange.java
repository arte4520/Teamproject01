package teamproject01;

public class Arrange {

	Arrange(){
		
	}
	
	
	String[][] Arrange(String[][] board){
		int[] temp = new int[board.length];
		for(int i=0; i<board.length;i++) {
			temp[i] = Integer.parseInt(board[i][0]);		
		}
		
		for(int i=0; i<temp.length;i++) {
			for(int j=i+1; j<temp.length;j++) {
				if(temp[i]<temp[j]) {
					int n = temp[i];
					temp[i] = temp[j];
					temp[j] = n;
				} else {
					continue;
				}
			}	
		}
		
		for(int i=0; i<board.length; i++) {
			board[i][0] = Integer.toString(temp[i]);
		}

		
		return board;
	}
	
}
