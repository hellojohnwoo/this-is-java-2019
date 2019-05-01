package chap08interface.sec08summary.prob04;

public class MySqlDao implements DataAcessObject {
    @Override
    public void select() {
        System.out.println("selecting MySqlDB");
    }

    @Override
    public void insert() {
        System.out.println("inserting MySqlDB");
    }

    @Override
    public void update() {
        System.out.println("updating MySqlDB");
    }

    @Override
    public void delete() {
        System.out.println("deleting MySqlDB");
    }


}
