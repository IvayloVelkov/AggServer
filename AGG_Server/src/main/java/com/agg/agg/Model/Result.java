package com.agg.agg.Model;
import javax.persistence.*;

import java.util.LinkedList;

import java.util.List;
import java.util.Objects;


@Entity

@Table(name = "result")

public class Result {


    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")

    private int id;


    @Column(name = "teamname", nullable = false)

    private String teamname;


    @Column(name = "avReuslt", nullable = false)

    private Double avReuslt;


    @Column(name = "tvReuslt", nullable = false)

    private Double tvReuslt;


    @Column(name = "exeReuslt", nullable = false)

    private Double exeReuslt;


    @Column(name = "finalResult", nullable = false)

    private Double finalResult;

    @Column(name = "sensorResult", nullable = false)

    private Double sensorResult;

    public Result() {    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public Double getAvReuslt() {
        return avReuslt;
    }

    public void setAvReuslt(Double avReuslt) {
        this.avReuslt = avReuslt;
    }

    public Double getTvReuslt() {
        return tvReuslt;
    }

    public void setTvReuslt(Double tvReuslt) {
        this.tvReuslt = tvReuslt;
    }

    public Double getExeReuslt() {
        return exeReuslt;
    }

    public void setExeReuslt(Double exeReuslt) {
        this.exeReuslt = exeReuslt;
    }

    public Double getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(Double finalResult) {
        this.finalResult = finalResult;
    }

    public Double getSensorResult() {
        return sensorResult;
    }

    public void setSensorResult(Double sensorResult) {
        this.sensorResult = sensorResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return id == result.id &&
                Objects.equals(teamname, result.teamname) &&
                Objects.equals(avReuslt, result.avReuslt) &&
                Objects.equals(tvReuslt, result.tvReuslt) &&
                Objects.equals(exeReuslt, result.exeReuslt) &&
                Objects.equals(finalResult, result.finalResult) &&
                Objects.equals(sensorResult, result.sensorResult);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, teamname, avReuslt, tvReuslt, exeReuslt, finalResult, sensorResult);
    }
}
