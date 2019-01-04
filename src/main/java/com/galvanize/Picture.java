package com.galvanize;

public class Picture {
    private boolean framed;
    private int height;
    private int width;

    Picture(boolean framed, int height, int width) {
        this.framed = framed;
        this.height = height;
        this.width = width;
    }

    Picture(int height, int width) {
        this(false, height, width);
    }

    public static void main(String[] args) {
        Picture p1 = new Picture(40 , 40);
        System.out.println(p1.toString());
    }
}
