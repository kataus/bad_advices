package ru.itvitality.otus.ba.before;

public class Cube {
    private int length;
    private int width;
    private int height;

    public int getVolume() {
        return length * width * height;
    }

    public int getLength() {
        return length;
    }

    public void setLength( int length ) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth( int width ) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight( int height ) {
        this.height = height;
    }
}
