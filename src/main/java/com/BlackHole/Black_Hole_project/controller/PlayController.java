package com.BlackHole.Black_Hole_project.controller;

import com.BlackHole.Black_Hole_project.model.Play;
import com.BlackHole.Black_Hole_project.repository.PlayRepository;
import com.BlackHole.Black_Hole_project.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/plays")
public class PlayController {

    @Autowired
    private final PlayService playService;
    @Autowired
    private final PlayRepository playRepository;

    public PlayController (PlayService playService, PlayRepository playRepository){
        this.playRepository = playRepository;
        this.playService = playService;
    }

    @GetMapping("/get-all-play")
    public List<Play> getallPlays(){
        return playRepository.findAll();
    }

    @PostMapping("/create-play")
    public Play createPlay(@RequestBody Play play){
        return playRepository.save(play);
    }

    @PutMapping("/update-play/{id}")
    public Play updatePlay(@PathVariable Long id, @RequestBody Play updatePlay){
        Play play = playRepository.findById(id).orElseThrow();
        play.setName(updatePlay.getName());
        play.setX(updatePlay.getX());
        play.setY(updatePlay.getY());
        play.setVelocityOfX(updatePlay.getVelocityOfX());
        play.setVelocityOfY(updatePlay.getVelocityOfY());

        return playRepository.save(play);

    }

}
