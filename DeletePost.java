package teamproject01;

import java.util.Scanner;

public class DeletePost {
	int readnum = 0, num = 0;
	Scanner scanner = new Scanner(System.in);

	DeletePost() {
		System.out.println("������ �Խñ� ��ȣ�� �Է����ּ���.\n>> ");
		readnum = Integer.parseInt(scanner.nextLine())+1;
	}

	boolean recheck() {

		String deletecheck = null;
		System.out.print("\n���� �����Ͻðڽ��ϱ�?\n�����Ͻ÷��� \"yes\"�� �ҹ��ڷ� �Է����ּ���. >>");
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
						// ���� ���� Ȯ���� ���� ��ȸ�� �ϹǷ� ��ȸ�� ����

						readnum = readnum-1;
						Prints pr = new Prints();
						pr.printpost(readnum, i, board);
						// ���� �� �ش� �Խñ� Ȯ��

						re = this.recheck();
						// ���� ������ ���� Ȯ��

						if (re == true) {
							System.out.println("-----�ش� �Խñ��� �����մϴ�.-----");
							for(int j=0; j<board[i].length;i++) {
								board[i][j] = null;
							}
							break;
						} else {
							System.out.println("������ ����ϰ� �޴��� ���ư��ϴ�. ���ڸ� ��Ȯ�� �Է����ּ���.");
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
			System.out.println("�ش� �Խñ� ��ȣ���� ������ �Խù��� �����ϴ�.\n�޴��� ���ư��ϴ�..");
		}
		return board;
	}
}
