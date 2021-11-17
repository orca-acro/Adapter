package ukrproblem;

public class Main {
    public static void main(String[] args) {
        БазаДаних db_1 = new БазаДаних();
        dbAdapter db = new dbAdapter(db_1);
        Авторизація авторизація = new Авторизація();
        AuthorizationAdapt auto = new AuthorizationAdapt(авторизація);
        if (auto.authorization(db)) {
            ReportBuilder rb = new ReportBuilder(db);
            System.out.println(rb.getDb());
        }

    }
}
