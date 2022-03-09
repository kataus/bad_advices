package ru.itvitality.otus.ba.after.scoring;

import ru.itvitality.otus.ba.model.Account;
import ru.itvitality.otus.ba.model.User;

import java.math.BigDecimal;
import java.util.List;

public interface Scoring {
    ScoringResult score( BigDecimal amount, User user, List<Account> accounts );
}
