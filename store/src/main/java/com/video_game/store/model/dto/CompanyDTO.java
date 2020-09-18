package com.video_game.store.model.dto;

public class CompanyDTO {
    private Integer idCompany;
    private String name;

    public CompanyDTO(Integer idCompany, String name) {
        this.idCompany = idCompany;
        this.name = name;
    }

    public Integer getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Integer idCompany) {
        this.idCompany = idCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
