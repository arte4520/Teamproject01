package teamproject01;

public class Prints {
	NullProcess np = new NullProcess();
	Prints(){
		
	}
	
	void choose() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("1.���|2.����(Create)|3.�б�(Read)|4.����(Update)|5.����(Delete)|6.����");
		System.out.println("----------------------------------------------------------------");
		System.out.print("�޴����� : ");
	}
	
	void postlist(String[][] board){
		System.out.println("--------------------------------------");
		System.out.println("��ȣ\t����\t����\t�۾���\t��ȸ��");
		System.out.println("--------------------------------------");

		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	void printpost(int readnum, int num, String[][] board) {
		System.out.println("�ش� �Խñ��� ������ ������ �����ϴ�.");
		System.out.println("-------------------------------------------------");
		
		System.out.println("��ȣ: " + readnum);
		System.out.println("����: " + board[num][1]);
		System.out.println("����: " + board[num][2]);
		System.out.println("�۾���: " + board[num][3]);
		System.out.println("��ȸ��: " + board[num][4] );
		
		System.out.println("-------------------------------------------------");
		
	}

}
