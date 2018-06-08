package com.agg.agg.Service;

import com.agg.agg.Model.Result;
import com.agg.agg.Repository.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService{

    private final ResultsRepository resultsRepository;

    @Autowired
    public ResultService(ResultsRepository resultsRepository) {
        this.resultsRepository = resultsRepository;
    }

    public Result getResultByTeamName(String teamName){
        return this.resultsRepository.getByTeamname(teamName);
    }

    public Result createResult(Result result) {
        return this.resultsRepository.save(result);
    }
}
