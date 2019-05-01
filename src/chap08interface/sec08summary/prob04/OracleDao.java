package chap08interface.sec08summary.prob04;

public class OracleDao implements DataAcessObject {
    @Override
    public void select() {
        System.out.println("selecting OracleDB");
    }

    @Override
    public void insert() {
        System.out.println("inserting OracleDB");
    }

    @Override
    public void update() {
        System.out.println("updating OracleDB");
    }

    @Override
    public void delete() {
        System.out.println("deleting OracleDB");
    }
}
