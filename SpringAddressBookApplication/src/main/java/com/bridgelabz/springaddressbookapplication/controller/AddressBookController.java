package com.bridgelabz.springaddressbookapplication.controller;


import com.bridgelabz.springaddressbookapplication.dto.AddressBookDTO;
import com.bridgelabz.springaddressbookapplication.dto.ResponseDTO;
import com.bridgelabz.springaddressbookapplication.model.AddressBook;
import com.bridgelabz.springaddressbookapplication.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import jakarta.validation.Valid;



import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @GetMapping("/")
    public ResponseEntity<ResponseDTO> getAllAddresses() {
        List<AddressBook> addressList = addressBookService.getAllAddresses();
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful", addressList);
        return new ResponseEntity<>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressById(@PathVariable("id") int id) {
        AddressBook address = addressBookService.getAddressById(id);
        ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successful", address);
        return new ResponseEntity<>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddress(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBook address = addressBookService.createAddress(addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Address Successfully", address);
        return new ResponseEntity<>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddress(
            @PathVariable int id, 
            @Valid @RequestBody AddressBookDTO addressBookDTO) {

        AddressBook address = addressBookService.updateAddress(id, addressBookDTO);
        if (address != null) {
            ResponseDTO respDTO = new ResponseDTO("Updated Address Successfully", address);
            return new ResponseEntity<>(respDTO, HttpStatus.OK);
        } else {
            ResponseDTO respDTO = new ResponseDTO("Address Not Found", null);
            return new ResponseEntity<>(respDTO, HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddress(@PathVariable("id") int id) {
        addressBookService.deleteAddress(id);
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted ID: " + id);
        return new ResponseEntity<>(respDTO, HttpStatus.OK);
    }
}