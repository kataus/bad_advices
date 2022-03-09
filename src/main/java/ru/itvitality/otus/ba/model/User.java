package ru.itvitality.otus.ba.model;

import java.time.LocalDate;

public class User {
    private final String name;
    private final String surName;
    private final String familyName;
    private final LocalDate birthDate;

    public User( String name, String surName, String familyName, LocalDate birthDate ) {
        this.name = name;
        this.surName = surName;
        this.familyName = familyName;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public boolean isAdult() {
        return birthDate.isBefore( LocalDate.now().minusYears( 18 ) );
    }
}
