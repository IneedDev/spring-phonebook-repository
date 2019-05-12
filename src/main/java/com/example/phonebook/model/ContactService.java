package com.example.phonebook.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    private static List<ContactForm> data = new ArrayList <>();
    //bezxargumentowy konstruktor
    //bean
    //singelton

    public String addPhoneContact(ContactForm contactForm){
        data.add(contactForm);
        System.out.println("ContactForm: " + contactForm.getSurname()+" | "+contactForm.getName()+" | "+contactForm.getPhonenumber() + "  "+data.size());
        return contactForm.getSurname();
    }

    public List<ContactForm> printAllPhoneContacts(){
        return data;
    }

    //validacja notempty not null reex ilosc znaków


}
