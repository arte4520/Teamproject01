package teamproject01;

import java.util.Scanner;

public class Project01 {

	public static void main(String[] args) {
		String[][] board = new String[100][5];
		int chosen = 0;

		Scanner scanner = new Scanner(System.in);

		Prints pr = new Prints();
		NullProcess np = new NullProcess();
		
		while (true) {
			pr.choose();
			chosen = Integer.parseInt(scanner.nextLine());
			board = np.makenullstring(board);
			
			switch (chosen) {
			case 1: //목록
				pr.postlist(board); // 게시판 프린트
				continue;

			case 2: //생성
				PushNew pn = new PushNew();
				board = pn.newlist(board); // 게시글 추가
				pr.postlist(board); // 게시판 프린트
				continue;

			case 3: //읽기
				ReadPost rp = new ReadPost();
				rp.reading(board); // 게시글 읽기
				pr.postlist(board); // 게시판 프린트
				continue;

			case 4: //수정
				Modify md = new Modify();
				board = md.ModifyPost(board); // 게시글 수정
				pr.postlist(board); // 게시판 프린트
				continue;
				
			case 5: //삭제
				DeletePost dp = new DeletePost();
				board = dp.del(board);
				pr.postlist(board); // 게시판 프린트
				continue;

			case 6: //종료
				System.out.println("게시판을 닫습니다.");
				break;

			}
		}

	}

}
