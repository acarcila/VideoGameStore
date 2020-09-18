package com.video_game.store.model.dto;

public class ClientDTO {
    private Integer idClient;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private Integer birthdayTimestamp;
    private String identificationNumber;

    public ClientDTO(Integer idClient, String name, String email, String phoneNumber, String address, Integer birthdayTimestamp, String identificationNumber) {
        this.idClient = idClient;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.birthdayTimestamp = birthdayTimestamp;
        this.identificationNumber = identificationNumber;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getBirthdayTimestamp() {
        return birthdayTimestamp;
    }

    public void setBirthdayTimestamp(Integer birthdayTimestamp) {
        this.birthdayTimestamp = birthdayTimestamp;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
}
