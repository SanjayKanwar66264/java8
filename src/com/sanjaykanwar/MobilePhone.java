package com.sanjaykanwar;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

/**
 * Created by sanjay kanwar on 31/12/2016.
 */
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
    if (findContact(contact.getName()) >= 0){
        System.out.println("Contact is already in the list");
        return false;
    }
    myContacts.add(contact);
    return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int findPosition  = findContact(oldContact);
        if(findPosition< 0){
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        }
        this.myContacts.set(findPosition, newContact);
        System.out.println( oldContact.getName() + "was replaced with " + newContact.getName());
        return true;

    }

    public boolean removeContact(Contact contact){
        int findPosition  = findContact(contact);
        if(findPosition< 0){
            System.out.println(contact.getName() + ", was not found");
            return false;
        }
        this.myContacts.remove(findPosition);
        System.out.println(contact.getName() + "was deleted");
        return true;
    }
    private  int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    private String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return  contact.getName();
        }
        return null;
    }
}
