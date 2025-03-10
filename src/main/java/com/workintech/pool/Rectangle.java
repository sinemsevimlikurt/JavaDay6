package com.workintech.pool;

public class Rectangle {
    private float width;
    private float length;

    public Rectangle(float width, float length) {
        this.width = width > 0 ? width : 0;
        this.length = length > 0 ? length : 0;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public float getArea() {
        return width * length;
    }
}