package com.BlackHole.Black_Hole_project.service;

import com.BlackHole.Black_Hole_project.model.Play;
import org.springframework.stereotype.Service;

@Service
public class PlayService {

    private final double GRAVITY_CONSTANT = 6.67430e-11;

    public void calculateNextPosition (Play play, double blackHoleMass, double centerX, double centerY){

        double dx = play.getX() - centerX;
        double dy = play.getY() - centerY;
        double distanceSquared = dx * dx + dy * dy;
        double force = GRAVITY_CONSTANT * (blackHoleMass / distanceSquared);

        double accelerationX = force * (dx / Math.sqrt(distanceSquared));
        double accelerationY = force * (dy / Math.sqrt(distanceSquared));

        play.setVelocityOfX(play.getVelocityOfX() - accelerationX);
        play.setVelocityOfY(play.getVelocityOfY() - accelerationY);

        play.setX(play.getX() + play.getVelocityOfX());
        play.setY(play.getY() + play.getVelocityOfY());


    }


}
