package teamproject01;

public class Prints {
	NullProcess np = new NullProcess();
	Prints(){
		
	}
	
	void choose() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("1.목록|2.생성(Create)|3.읽기(Read)|4.수정(Update)|5.삭제(Delete)|6.종료");
		System.out.println("----------------------------------------------------------------");
		System.out.print("메뉴선택 : ");
	}
	
	void postlist(String[][] board){
		System.out.println("--------------------------------------");
		System.out.println("번호\t제목\t내용\t글쓴이\t조회수");
		System.out.println("--------------------------------------");

		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	void printpost(int readnum, int num, String[][] board) {
		System.out.println("해당 게시글의 내용은 다음과 같습니다.");
		System.out.println("-------------------------------------------------");
		
		System.out.println("번호: " + readnum);
		System.out.println("제목: " + board[num][1]);
		System.out.println("내용: " + board[num][2]);
		System.out.println("글쓴이: " + board[num][3]);
		System.out.println("조회수: " + board[num][4] );
		
		System.out.println("-------------------------------------------------");
		
	}

}
