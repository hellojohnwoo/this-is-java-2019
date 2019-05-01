package chap08interface.sec08summary.prob04;

public class DaoExam {

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());

    }


    public static void dbWork(DataAcessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

}
