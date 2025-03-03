package com.bridgelabz.springaddressbookapplication.service;


import java.util.List;
import com.bridgelabz.springaddressbookapplication.dto.AddressBookDTO;
import com.bridgelabz.springaddressbookapplication.model.AddressBook;

public interface IAddressBookService {

    List<AddressBook> getAllAddresses();

    AddressBook getAddressById(int id);

    AddressBook createAddress(AddressBookDTO addressBookDTO);

    AddressBook updateAddress(AddressBookDTO addressBookDTO);

    void deleteAddress(int id);
}