package ru.itvitality.otus.ba.after.k;

public class KU {

    public int total(int i){
        var k = create(i);
        return k.v();
    }

    // ...

    private K create(int i){
        return new K( i,i,i );
    }
}
