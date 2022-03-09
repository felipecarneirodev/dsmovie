package com.ProjetoReact.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoReact.dsmovie.entities.Score;
import com.ProjetoReact.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
