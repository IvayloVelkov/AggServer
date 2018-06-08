package com.agg.agg.Controller;

import com.agg.agg.Model.Result;
import com.agg.agg.Service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/results")
public class ResultController{

    private final ResultService resultService;

    @Autowired
    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @PostMapping
    public ResponseEntity<Result> createTeamResult(@RequestBody Result result) {
        Result resultNew = this.resultService.createResult(result);

        return new ResponseEntity<Result>(resultNew, HttpStatus.OK);
    }

    @GetMapping ResponseEntity<Result> getResult(@RequestParam("teamName") String teamName) {
        Result result = this.resultService.getResultByTeamName(teamName);

        return new ResponseEntity<Result>(result, HttpStatus.OK);
    }
}
