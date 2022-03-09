package com.cachoeira.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cachoeira.dsmovie.entities.Score;
import com.cachoeira.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
