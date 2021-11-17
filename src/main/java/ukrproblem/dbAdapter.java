package ukrproblem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class dbAdapter extends БазаДаних {
    private БазаДаних db;
    public String getData() {
        return db.отриматиДаніКористувача();
    }
    public String getStaticData() {
        return db.отриматиСтатистичніДані();
    }

}
