package com.video_game.store.model.dto;

import com.video_game.store.model.entities.Person;

public class PersonDTO {
    private Integer idPerson;
    private String name;

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {
        private PersonDTO data;

        public Builder() {
            data = new PersonDTO();
        }

        public PersonDTO build() {
            return data;
        }

        public Builder withIdPerson(Integer idPerson) {
            data.setIdPerson(idPerson);
            return this;
        }

        public Builder withName(String name) {
            data.setName(name);
            return this;
        }
    }
}
