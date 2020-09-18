package com.video_game.store.model.dto;

import com.video_game.store.model.entities.Company;
import com.video_game.store.model.entities.Person;
import com.video_game.store.model.entities.Technology;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class VideoGameDTO {
    private Integer idVideoGame;
    private String name;
    private Integer year;
    private Double rentalPrice;
    private Integer fkTechnology;
    private Integer fkCompany;
    private Integer fkDirector;
    private Integer fkProducer;

    public Integer getIdVideoGame() {
        return idVideoGame;
    }

    public void setIdVideoGame(Integer idVideoGame) {
        this.idVideoGame = idVideoGame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(Double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public Integer getFkTechnology() {
        return fkTechnology;
    }

    public void setFkTechnology(Integer fkTechnology) {
        this.fkTechnology = fkTechnology;
    }

    public Integer getFkCompany() {
        return fkCompany;
    }

    public void setFkCompany(Integer fkCompany) {
        this.fkCompany = fkCompany;
    }

    public Integer getFkDirector() {
        return fkDirector;
    }

    public void setFkDirector(Integer fkDirector) {
        this.fkDirector = fkDirector;
    }

    public Integer getFkProducer() {
        return fkProducer;
    }

    public void setFkProducer(Integer fkProducer) {
        this.fkProducer = fkProducer;
    }

    public static class Builder {
        private VideoGameDTO data;

        public Builder() {
            data = new VideoGameDTO();
        }

        public VideoGameDTO build() {
            return data;
        }

        public Builder withIdVideoGame(Integer idVideoGame) {
            data.setIdVideoGame(idVideoGame);
            return this;
        }

        public Builder withName(String name) {
            data.setName(name);
            return this;
        }

        public Builder withYear(Integer year) {
            data.setYear(year);
            return this;
        }

        public Builder withRentalPrice(Double rentalPrice) {
            data.setRentalPrice(rentalPrice);
            return this;
        }

        public Builder withFkTechnology(Integer fkTechnology) {
            data.setFkTechnology(fkTechnology);
            return this;
        }

        public Builder withFkCompany(Integer fkCompany) {
            data.setFkCompany(fkCompany);
            return this;
        }

        public Builder withFkDirector(Integer fkDirector) {
            data.setFkDirector(fkDirector);
            return this;
        }

        public Builder withFkProducer(Integer fkDirector) {
            data.setFkProducer(fkDirector);
            return this;
        }
    }
}
