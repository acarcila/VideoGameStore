package com.video_game.store.model.dto;

public class TechnologyDTO {
    private Integer idTechnology;
    private String name;
    private Integer fkCompany;

    public TechnologyDTO(Integer idTechnology, String name, Integer fkCompany) {
        this.idTechnology = idTechnology;
        this.name = name;
        this.fkCompany = fkCompany;
    }

    public Integer getIdTechnology() {
        return idTechnology;
    }

    public void setIdTechnology(Integer idTechnology) {
        this.idTechnology = idTechnology;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFkCompany() {
        return fkCompany;
    }

    public void setFkCompany(Integer fkCompany) {
        this.fkCompany = fkCompany;
    }
}
