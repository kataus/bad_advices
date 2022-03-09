package ru.itvitality.otus.ba.model;

import java.math.BigDecimal;

public class DepositAccount implements Account{
    private BigDecimal value;

    public DepositAccount( BigDecimal value ) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }
}
