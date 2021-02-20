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
			case 1: //���
				pr.postlist(board); // �Խ��� ����Ʈ
				continue;

			case 2: //����
				PushNew pn = new PushNew();
				board = pn.newlist(board); // �Խñ� �߰�
				pr.postlist(board); // �Խ��� ����Ʈ
				continue;

			case 3: //�б�
				ReadPost rp = new ReadPost();
				rp.reading(board); // �Խñ� �б�
				pr.postlist(board); // �Խ��� ����Ʈ
				continue;

			case 4: //����
				Modify md = new Modify();
				board = md.ModifyPost(board); // �Խñ� ����
				pr.postlist(board); // �Խ��� ����Ʈ
				continue;
				
			case 5: //����
				DeletePost dp = new DeletePost();
				board = dp.del(board);
				pr.postlist(board); // �Խ��� ����Ʈ
				continue;

			case 6: //����
				System.out.println("�Խ����� �ݽ��ϴ�.");
				break;

			}
		}

	}

}
