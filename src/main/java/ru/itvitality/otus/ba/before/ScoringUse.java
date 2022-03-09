package ru.itvitality.otus.ba.before;

import ru.itvitality.otus.ba.before.exeptions.ScoringException;
import ru.itvitality.otus.ba.model.Account;
import ru.itvitality.otus.ba.model.User;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ScoringUse {
    private final Scoring scoring = new Scoring();

    public boolean creditDecition( BigDecimal amount, User user){
        var accounts = new ArrayList<Account>();

        try {
            var result = scoring.score( amount, user, accounts );
        } catch ( ScoringException ex ){
            // сообщить, обработать по нашему
        } catch ( Exception e ){
            // сообщить, обработать по общему
        }
        return false;
    }
}
