package com.video_game.store.model.entities;

import javax.persistence.*;

@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idRental;
    private Integer timestamp;
    private Integer duration;
    private Double price;
    private Boolean isReturned;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_video_game")
    private VideoGame videoGame;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_client")
    private Client client;

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

    public VideoGame getVideoGame() {
        return videoGame;
    }

    public void setVideoGame(VideoGame videoGame) {
        this.videoGame = videoGame;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
