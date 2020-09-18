package com.video_game.store.model.dto;

public class CharacterDTO {
    private Integer idCharacter;
    private String name;

    public Integer getIdCharacter() {
        return idCharacter;
    }

    public void setIdCharacter(Integer idCharacter) {
        this.idCharacter = idCharacter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {
        private CharacterDTO data;

        public Builder() {
            data = new CharacterDTO();
        }

        public CharacterDTO build() {
            return data;
        }

        public Builder withIdCharacter(Integer idCharacter) {
            data.setIdCharacter(idCharacter);
            return this;
        }

        public Builder withName(String name) {
            data.setName(name);
            return this;
        }
    }
}
