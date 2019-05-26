package chap15.sec00summary.Prob07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<Board>();
        list.add(new Board("Title01", "Content01"));
        list.add(new Board("Title02", "Content02"));
        list.add(new Board("Title03", "Content03"));
        return list;
    }
}
