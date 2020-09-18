package com.video_game.store.model.dto;

public class RentalDTO {
    private Integer idRental;
    private Integer timestamp;
    private Integer duration;
    private Double price;
    private Boolean isReturned;
    private Integer fkClient;
    private Integer fkVideoGame;

    private RentalDTO() {
    }

    public Integer getIdRental() {
        return idRental;
    }

    public void setIdRental(Integer idRental) {
        this.idRental = idRental;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getIsReturned() {
        return isReturned;
    }

    public void setIsReturned(Boolean returned) {
        isReturned = returned;
    }

    public Integer getFkClient() {
        return fkClient;
    }

    public void setFkClient(Integer fkClient) {
        this.fkClient = fkClient;
    }

    public Integer getFkVideoGame() {
        return fkVideoGame;
    }

    public void setFkVideoGame(Integer fkVideoGame) {
        this.fkVideoGame = fkVideoGame;
    }

    public static class Builder {
        private RentalDTO data;

        public Builder() {
            data = new RentalDTO();
        }

        public Builder withIDRental(Integer idRental) {
            data.setIdRental(idRental);
            return this;
        }

        public Builder withTimestamp(Integer timestamp) {
            data.setTimestamp(timestamp);
            return this;
        }

        public Builder withDuration(Integer duration) {
            data.setDuration(duration);
            return this;
        }

        public Builder withPrice(Double price) {
            data.setPrice(price);
            return this;
        }

        public Builder withReturned(Boolean isReturned) {
            data.setIsReturned(isReturned);
            return this;
        }

        public Builder withFkClient(Integer fkClient) {
            data.setFkClient(fkClient);
            return this;
        }

        public Builder withFkVideoGame(Integer fkVideoGame) {
            data.setFkVideoGame(fkVideoGame);
            return this;
        }

        public RentalDTO build() {
            return data;
        }
    }
}
