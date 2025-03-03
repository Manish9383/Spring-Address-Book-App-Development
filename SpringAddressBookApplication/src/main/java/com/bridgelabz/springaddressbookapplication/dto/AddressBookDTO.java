package com.bridgelabz.springaddressbookapplication.dto;




import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.ToString;

public @ToString class AddressBookDTO {

	@NotEmpty(message = "Name is a required field.")
    @Pattern(regexp = "^[A-Za-z\\s]{2,}$", message = "Name must contain only letters and spaces, with at least 2 characters.")
    public String name;
    public String phoneNumber;
    public String email;
    public String city;

    
    
}