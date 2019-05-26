package chap15.sec00summary.Prob07;

import java.util.List;

public class BoardEx {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for(Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}
