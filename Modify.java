package teamproject01;

import java.util.Scanner;

public class Modify {
	int readnum = 0;
	String newwords = null;
	Scanner scanner = new Scanner(System.in);

	Modify() {
		System.out.print("�Խñ��� �ҷ��ɴϴ�.\n�а���� �Խñ��� ��ȣ�� �Է����ּ���.\n>> ");
		readnum = Integer.parseInt(scanner.nextLine());
	}

	void ModifyOrNot(String whattomodi, String before) {

		System.out.println("����" + whattomodi + " : " + before);
		System.out.print("����" + whattomodi + " : ");
		newwords = scanner.nextLine();

		if (newwords == null || newwords == "" || newwords == " ") {
			System.out.println("-----" + whattomodi + "�� �������� �ʾҽ��ϴ�.-----");
		} else {
			System.out.println("-----" + whattomodi + "�� �����߽��ϴ�.-----");
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
						// �����ϱ� ���� �о��� ������ ��ȸ���� ����

						System.out.println("��ȣ: " + readnum);

						String headbefore = board[i][1];
						String contentbefore = board[i][2];

						this.ModifyOrNot("����", headbefore);
						board[i][1] = newwords;
						newwords = null;

						this.ModifyOrNot("����", contentbefore);
						board[i][2] = newwords;
						newwords = null;
						break;
					}
				} else {
					continue;
				}
			}

		} else {
			System.out.println("������ �Խù��� �����ϴ�.\n�޴��� ���ư��ϴ�.");
		}

		return board;
	}

}
