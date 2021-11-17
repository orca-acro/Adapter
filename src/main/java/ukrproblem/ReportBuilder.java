package ukrproblem;

import lombok.Getter;

@Getter
public class ReportBuilder {
    private dbAdapter db;
    public ReportBuilder(dbAdapter db) {
        this.db = db;
    }
}
