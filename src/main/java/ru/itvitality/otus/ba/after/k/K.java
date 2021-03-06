package ru.itvitality.otus.ba.after.k;

/**
 * Класс описывает куб
 */
public class K {
    private int i;
    private int j;
    private int h;

    /**
     * получение объема куба
     * @return
     */
    public int v() {
        return i * j * i;
    }

    /**
     * Метод позволяет прочитать ширину
     * @return
     */
    public int getJ() {
        return j;
    }

    public void setJ( int j ) {
        this.j = j;
    }

    public int getH() {
        return h;
    }

    public void setH( int h ) {
        this.h = h;
    }


    public int getI() {
        return i;
    }

    /**
     * Метод позволяет установить высоту
     * @param i
     */
    public void setI( int i ) {
        this.i = i;
    }

    public K( int i, int j, int h ) {
        this.i = i;
        this.j = j;
        this.h = h;
    }
}
