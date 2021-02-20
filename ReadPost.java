package teamproject01;

import java.util.Scanner;

public class ReadPost {
	Scanner scanner = new Scanner(System.in);
	Prints pr = new Prints();

	ReadPost() {
		System.out.print("게시글을 불러옵니다.\n읽고싶은 게시글의 번호를 입력해주세요.\n>> ");
	}

	void reading(String[][] board) {
		int readnum = 0, view = 0;
		readnum = Integer.parseInt(scanner.nextLine())+1;

		if (readnum < board.length && readnum > 0) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][0] != null || board[i][0] != "null") {
					if (readnum == Integer.parseInt(board[i][0])+1) {
						view = Integer.parseInt(board[i][4]) + 1;
						board[i][4] = Integer.toString(view);
						readnum = readnum-1;
						pr.printpost(readnum, i, board);

						break;
					}
				} else {
					continue;
				}
			}
		} else {
			System.out.println("조회할 게시물이 없습니다. 메뉴로 돌아갑니다.");
		}
	}

}
