package teamproject01;


import java.util.Scanner;

public class PushNew {
	
	PushNew() {
		System.out.println("�Խñ��� �����մϴ�.");
	}

	
	String[] posting(String n, String view) {
		String[] board_one = new String[5];
		Scanner scanner = new Scanner(System.in);

		board_one[0] = n;
		board_one[4] = "0";
		
		System.out.print("����: ");
		board_one[1] = scanner.nextLine();
		System.out.print("����: ");
		board_one[2] = scanner.nextLine();
		System.out.print("�۾���: ");
		board_one[3] = scanner.nextLine();
		

		return board_one;
	}

	

	String[][] newlist(String[][] board) {

		// �Խñ� ��ȣ���� null�� ã��
		for(int i =0; i<board.length;i++) {
			if(board[i][0]=="null" || board[i][0]==null) {
				// null �ڸ��� �� �Խñ� �ֱ�
				board[i] = this.posting(Integer.toString(i+1),board[i][4]);
				break; 
			} else {
				continue;
			}
		}
		
		return board;
	}

}
