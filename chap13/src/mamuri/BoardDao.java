package mamuri;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public List<Board> getBoardList() {
		// TODO Auto-generated method stub
		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board("����1","����1"));
		list.add(new Board("����2","����2"));
		list.add(new Board("����3","����3"));
		return list;
	}
	
}
