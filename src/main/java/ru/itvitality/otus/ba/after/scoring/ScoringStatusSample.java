package ru.itvitality.otus.ba.after.scoring;

import ru.itvitality.otus.ba.model.Account;
import ru.itvitality.otus.ba.model.CreditAccount;
import ru.itvitality.otus.ba.model.User;

import java.math.BigDecimal;
import java.util.List;

public class ScoringStatusSample {

    public int score( BigDecimal amount, User user, List<Account> accounts ) {
        int score = 0;
        if ( user != null && user.isAdult() ) {
            if ( accounts != null ) {
                var credits = accounts.stream()
                        .filter( a -> a instanceof CreditAccount )
                        .findFirst();
                if ( ! credits.isPresent() ) {
                    score += 20;
                }
            }
        }
        return score;
    }
}
