package teamproject01;

import java.util.Scanner;

public class Modify {
	int readnum = 0;
	String newwords = null;
	Scanner scanner = new Scanner(System.in);

	Modify() {
		System.out.print("게시글을 불러옵니다.\n읽고싶은 게시글의 번호를 입력해주세요.\n>> ");
		readnum = Integer.parseInt(scanner.nextLine());
	}

	void ModifyOrNot(String whattomodi, String before) {

		System.out.println("기존" + whattomodi + " : " + before);
		System.out.print("수정" + whattomodi + " : ");
		newwords = scanner.nextLine();

		if (newwords == null || newwords == "" || newwords == " ") {
			System.out.println("-----" + whattomodi + "을 수정하지 않았습니다.-----");
		} else {
			System.out.println("-----" + whattomodi + "을 수정했습니다.-----");
		}
	}

	String[][] ModifyPost(String[][] board) {
		int view = 0;
		if (readnum < board.length && readnum > 0) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][0] != null || board[i][0] != "null") {

					if (readnum == Integer.parseInt(board[i][0])) {
						view = Integer.parseInt(board[i][4]) + 1;
						board[i][4] = Integer.toString(view);
						// 수정하기 위해 읽었기 때문에 조회수도 증가

						System.out.println("번호: " + readnum);

						String headbefore = board[i][1];
						String contentbefore = board[i][2];

						this.ModifyOrNot("제목", headbefore);
						board[i][1] = newwords;
						newwords = null;

						this.ModifyOrNot("내용", contentbefore);
						board[i][2] = newwords;
						newwords = null;
						break;
					}
				} else {
					continue;
				}
			}

		} else {
			System.out.println("수정할 게시물이 없습니다.\n메뉴로 돌아갑니다.");
		}

		return board;
	}

}
