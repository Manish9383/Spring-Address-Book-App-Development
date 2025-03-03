package com.bridgelabz.springaddressbookapplication.dto;




import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.ToString;


import jakarta.validation.constraints.Email;

import lombok.ToString;

public @ToString class AddressBookDTO {

    @NotEmpty(message = "Name is a required field.")
    @Pattern(regexp = "^[A-Za-z\\s]{2,}$", message = "Name must contain only letters and spaces, with at least 2 characters.")
    public String name;

    @NotEmpty(message = "Phone Number is a required field.")
    @Pattern(regexp = "^\\d{10}$", message = "Phone Number must be exactly 10 digits.")
    public String phoneNumber;

    @NotEmpty(message = "Email is a required field.")
    @Email(message = "Email should be valid.")
    public String email;

    @NotEmpty(message = "City is a required field.")
    public String city;
}