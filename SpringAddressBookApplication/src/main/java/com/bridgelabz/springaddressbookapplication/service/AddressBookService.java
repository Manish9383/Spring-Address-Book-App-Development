package com.bridgelabz.springaddressbookapplication.service;


import com.bridgelabz.springaddressbookapplication.dto.AddressBookDTO;
import com.bridgelabz.springaddressbookapplication.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    private List<AddressBook> addressBookList = new ArrayList<>();

    @Override
    public List<AddressBook> getAllAddresses() {
        return addressBookList;
    }

    @Override
    public AddressBook getAddressById(int id) {
        return addressBookList.stream()
                .filter(address -> address.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public AddressBook createAddress(AddressBookDTO addressBookDTO) {
        AddressBook newAddress = new AddressBook(addressBookList.size() + 1, addressBookDTO);
        addressBookList.add(newAddress);
        return newAddress;
    }

    @Override
    public AddressBook updateAddress(int id, AddressBookDTO addressBookDTO) {
        AddressBook existingAddress = getAddressById(id);
        if (existingAddress != null) {
            existingAddress.setName(addressBookDTO.name);
            existingAddress.setPhoneNumber(addressBookDTO.phoneNumber);
            existingAddress.setEmail(addressBookDTO.email);
            existingAddress.setCity(addressBookDTO.city);
            return existingAddress;
        }
        return null;
    }

    @Override
    public void deleteAddress(int id) {
        addressBookList.removeIf(address -> address.getId() == id);
    }
}