package ru.itvitality.otus.ba.after.scoring;

import ru.itvitality.otus.ba.model.Account;
import ru.itvitality.otus.ba.model.CreditAccount;
import ru.itvitality.otus.ba.model.User;

import java.math.BigDecimal;
import java.util.List;

public class ScoringShopImpl implements Scoring {

    public ScoringResult score( BigDecimal amount, User user, List<Account> accounts ) {
        var result = new ScoringResult();
        result.setResult( ResultEnum.WARNING );
        if ( user != null && user.isAdult() ) {
            if ( accounts != null ) {
                var credits = accounts.stream()
                        .filter( a -> a instanceof CreditAccount )
                        .findFirst();
                if ( ! credits.isPresent() ) {
                    result.setScore( result.getScore() + 20 );
                }
            }
            result.setResult( ResultEnum.OK );
        } else {
            result.setResult( ResultEnum.ERROR );
            result.setMessage( "No user" );
        }
        return result;
    }
}
