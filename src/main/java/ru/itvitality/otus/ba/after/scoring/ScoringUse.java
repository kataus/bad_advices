package ru.itvitality.otus.ba.after.scoring;

import ru.itvitality.otus.ba.model.Account;
import ru.itvitality.otus.ba.model.User;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ScoringUse {
    private final Scoring scoring = new ScoringImpl();

    public boolean creditDecition( BigDecimal amount, User user){
        var accounts = new ArrayList<Account>();

        var result = scoring.score( amount, user, accounts );
        if (result.getResult().equals( ResultEnum.OK )){
            return true;
        } else if (result.getResult().equals( ResultEnum.WARNING )){
            //...
        } else if (result.getResult().equals( ResultEnum.ERROR )) {
            // ...
        }
        return false;
    }
}
