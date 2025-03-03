package com.bridgelabz.springaddressbookapplication.service;



import com.bridgelabz.springaddressbookapplication.dto.AddressBookDTO;
import com.bridgelabz.springaddressbookapplication.model.AddressBook;
import com.bridgelabz.springaddressbookapplication.model.AddressBook;

import java.util.List;

public interface IAddressBookService {
    List<AddressBook> getAllAddresses();
    AddressBook getAddressById(int id);
    AddressBook createAddress(AddressBookDTO addressBookDTO);
    AddressBook updateAddress(int id, AddressBookDTO addressBookDTO);  
    void deleteAddress(int id);
}