package teamproject01;

import java.util.Scanner;

public class ReadPost {
	Scanner scanner = new Scanner(System.in);
	Prints pr = new Prints();

	ReadPost() {
		System.out.print("�Խñ��� �ҷ��ɴϴ�.\n�а���� �Խñ��� ��ȣ�� �Է����ּ���.\n>> ");
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
			System.out.println("��ȸ�� �Խù��� �����ϴ�. �޴��� ���ư��ϴ�.");
		}
	}

}
