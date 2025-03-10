package com.workintech.pool;

public class Cuboid extends Rectangle {
    private float height;

    public Cuboid(float width, float length, float height) {
        super(width, length);
        this.height = height > 0 ? height : 0;
    }

    public float getHeight() {
        return height;
    }

    public float getVolume() {
        return getArea() * height;
    }
}