package ukrproblem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthorizationAdapt {
    private Авторизація auto;

    public boolean authorization(dbAdapter db) {
        return auto.авторизуватися(db);
    }
}
