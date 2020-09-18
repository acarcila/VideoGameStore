package com.video_game.store.model.dto;

import com.video_game.store.model.entities.Character;
import com.video_game.store.model.entities.VideoGame;

public class AppearanceDTO {
    private Integer idAppearance;
    private Integer fkCharacter;
    private Integer fkVideoGame;

    public Integer getIdAppearance() {
        return idAppearance;
    }

    public void setIdAppearance(Integer idAppearance) {
        this.idAppearance = idAppearance;
    }

    public Integer getFkCharacter() {
        return fkCharacter;
    }

    public void setFkCharacter(Integer fkCharacter) {
        this.fkCharacter = fkCharacter;
    }

    public Integer getFkVideoGame() {
        return fkVideoGame;
    }

    public void setFkVideoGame(Integer fkVideoGame) {
        this.fkVideoGame = fkVideoGame;
    }

    public static class Builder {
        private AppearanceDTO data;

        public Builder() {
            data = new AppearanceDTO();
        }

        public AppearanceDTO build() {
            return data;
        }

        public Builder withIdAppearance(Integer idAppearance) {
            data.setIdAppearance(idAppearance);
            return this;
        }

        public Builder withFkCharacter(Integer fkCharacter) {
            data.setFkCharacter(fkCharacter);
            return this;
        }

        public Builder withFkVideoGame(Integer fkVideoGame) {
            data.setFkVideoGame(fkVideoGame);
            return this;
        }
    }
}
