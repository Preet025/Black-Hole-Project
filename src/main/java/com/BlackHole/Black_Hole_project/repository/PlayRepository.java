package com.BlackHole.Black_Hole_project.repository;

import com.BlackHole.Black_Hole_project.model.Play;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayRepository extends JpaRepository<Play, Long> {
}
