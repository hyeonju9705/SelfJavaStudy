package mamuri;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// BoardDao ��� Ŭ����
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}
	}

}
