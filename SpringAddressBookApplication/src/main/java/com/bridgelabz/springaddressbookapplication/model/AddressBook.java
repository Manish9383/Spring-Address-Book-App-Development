package com.bridgelabz.springaddressbookapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import com.bridgelabz.springaddressbookapplication.dto.AddressBookDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public @Data class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
    private String city;

    public AddressBook() {
    }

    public AddressBook(int id, AddressBookDTO addressbookDto) {
        this.id = id;
        this.name = addressbookDto.name;
        this.phoneNumber = addressbookDto.phoneNumber;
        this.email=addressbookDto.email;
        this.city = addressbookDto.city;
    }

}