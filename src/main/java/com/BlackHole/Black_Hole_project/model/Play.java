package com.BlackHole.Black_Hole_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Play {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double x;
    private double y;
    private double velocityOfX;
    private double velocityOfY;
    private String state;


    public Play() {
    }


    public Play(Long id, String name, double x, double y, double velocityOfX, double velocityOfY, String state) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.velocityOfX = velocityOfX;
        this.velocityOfY = velocityOfY;
        this.state = state;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getVelocityOfX() {
        return velocityOfX;
    }

    public void setVelocityOfX(double velocityOfX) {
        this.velocityOfX = velocityOfX;
    }

    public double getVelocityOfY() {
        return velocityOfY;
    }

    public void setVelocityOfY(double velocityOfY) {
        this.velocityOfY = velocityOfY;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "Play{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", velocityOfX=" + velocityOfX +
                ", velocityOfY=" + velocityOfY +
                ", state='" + state + '\'' +
                '}';
    }
}
