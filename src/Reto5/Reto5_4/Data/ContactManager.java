package Reto5.Reto5_4.Data;

import java.util.ArrayList;

/**
 * This class manages contacts by adding contacts to a list and displaying the list of contacts.
 */
public class ContactManager {

    /**
     * Adds a contact to the list of contacts.
     */
    public void addContact(ArrayList<Contact> contactList, Contact contact){
        contactList.add(new Contact(contact.name, contact.address,
                contact.homePhone, contact.workPhone));
    }

    /**
     * Displays the list of contacts.
     */
    public void showContactList(ArrayList<Contact> contactList){
        System.out.println(contactList);
    }
}
