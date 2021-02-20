package teamproject01;


import java.util.Scanner;

public class PushNew {
	
	PushNew() {
		System.out.println("게시글을 생성합니다.");
	}

	
	String[] posting(String n, String view) {
		String[] board_one = new String[5];
		Scanner scanner = new Scanner(System.in);

		board_one[0] = n;
		board_one[4] = "0";
		
		System.out.print("제목: ");
		board_one[1] = scanner.nextLine();
		System.out.print("내용: ");
		board_one[2] = scanner.nextLine();
		System.out.print("글쓴이: ");
		board_one[3] = scanner.nextLine();
		

		return board_one;
	}

	

	String[][] newlist(String[][] board) {

		// 게시글 번호에서 null값 찾기
		for(int i =0; i<board.length;i++) {
			if(board[i][0]=="null" || board[i][0]==null) {
				// null 자리에 새 게시글 넣기
				board[i] = this.posting(Integer.toString(i+1),board[i][4]);
				break; 
			} else {
				continue;
			}
		}
		
		return board;
	}

}
