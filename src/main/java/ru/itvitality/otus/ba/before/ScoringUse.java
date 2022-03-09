package ru.itvitality.otus.ba.before;

import ru.itvitality.otus.ba.after.scoring.ScoringOnlineImpl;
import ru.itvitality.otus.ba.after.scoring.ScoringShopImpl;
import ru.itvitality.otus.ba.before.exeptions.ScoringException;
import ru.itvitality.otus.ba.model.Account;
import ru.itvitality.otus.ba.model.User;

import java.math.BigDecimal;
import java.util.ArrayList;

import ru.itvitality.otus.ba.after.scoring.Scoring;

public class ScoringUse {
    private Scoring scoring ;

    public boolean creditDecition( BigDecimal amount, User user){
        var accounts = new ArrayList<Account>();

        if (inShop(user)){
            scoring = new ScoringShopImpl();
        } else if (onlineUser(user)){
            scoring = new ScoringOnlineImpl();
        }
        try {
            var result = scoring.score( amount, user, accounts );
        } catch ( ScoringException ex ){
            // сообщить, обработать по нашему
        } catch ( Exception e ){
            // сообщить, обработать по общему
        }
        return false;
    }

    private boolean onlineUser( User user ) {
        return false;
    }

    private boolean inShop( User user ) {
        return false;
    }
}
