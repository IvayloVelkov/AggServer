package com.agg.agg.Repository;

import com.agg.agg.Model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultsRepository extends JpaRepository<Result, Integer> {
    Result getByTeamname(String teamName);
}