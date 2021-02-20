package teamproject01;

import java.util.Scanner;

public class DeletePost {
	int readnum = 0, num = 0;
	Scanner scanner = new Scanner(System.in);

	DeletePost() {
		System.out.println("삭제할 게시글 번호를 입력해주세요.\n>> ");
		readnum = Integer.parseInt(scanner.nextLine())+1;
	}

	boolean recheck() {

		String deletecheck = null;
		System.out.print("\n정말 삭제하시겠습니까?\n삭제하시려면 \"yes\"를 소문자로 입력해주세요. >>");
		deletecheck = scanner.nextLine();

		if (deletecheck.equals("yes")) {
			return true;
		} else {
			return false;
		}
	}

	String[][] del(String[][] board) {
		boolean re;
		int view = 0;
		if (readnum < board.length && readnum > 0) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][0] != null || board[i][0] != "null") {

					if (readnum == Integer.parseInt(board[i][0])) {
						view = Integer.parseInt(board[i][4]) + 1;
						board[i][4] = Integer.toString(view);
						// 삭제 전에 확인을 통해 조회를 하므로 조회수 증가

						readnum = readnum-1;
						Prints pr = new Prints();
						pr.printpost(readnum, i, board);
						// 삭제 전 해당 게시글 확인

						re = this.recheck();
						// 정말 삭제할 건지 확인

						if (re == true) {
							System.out.println("-----해당 게시글을 삭제합니다.-----");
							for(int j=0; j<board[i].length;i++) {
								board[i][j] = null;
							}
							break;
						} else {
							System.out.println("삭제를 취소하고 메뉴로 돌아갑니다. 문자를 정확히 입력해주세요.");
							break;
						}
					} else {
						continue;
					}

				} else {
					continue;
				}
			}
		} else {
			System.out.println("해당 게시글 번호에는 삭제할 게시물이 없습니다.\n메뉴로 돌아갑니다..");
		}
		return board;
	}
}
