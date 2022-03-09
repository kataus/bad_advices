package ru.itvitality.otus.ba.before;

import ru.itvitality.otus.ba.before.exeptions.NoUserException;
import ru.itvitality.otus.ba.model.Account;
import ru.itvitality.otus.ba.model.CreditAccount;
import ru.itvitality.otus.ba.model.DepositAccount;
import ru.itvitality.otus.ba.model.User;

import java.math.BigDecimal;
import java.util.List;

public class Scoring {

    public int score( BigDecimal amount, User user, List<Account> accounts ) {
        int score = 0;
        if ( user == null ) {
            throw new NoUserException();
        }
        if ( user.isAdult() ) {
            if ( accounts != null ) {
                var credits = accounts.stream()
                        .filter( a -> a instanceof CreditAccount )
                        .findFirst();
                if ( ! credits.isPresent() ) {
                    score = addWithNormalization( score, 20 );
                }
                var deposits = accounts.stream()
                        .filter( a -> a instanceof DepositAccount )
                        .findFirst();
                if ( deposits.isPresent() ) {
                    score = addWithNormalization( score, 10 );
                }
            }
        }
        return score;
    }

    private int addWithNormalization( int score, int add ) {
        var result = score + add;
        return result < 100 ? result : 100;
    }
}
