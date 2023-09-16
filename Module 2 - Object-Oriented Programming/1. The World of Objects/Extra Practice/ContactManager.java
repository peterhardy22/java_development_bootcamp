public class ContactManager {
    private Contact[] contacts;
    
    public ContactManager(Contact[] contacts) {
        this.contacts = new Contact[contacts.length];
        for (int i = 0; i < this.contacts.length; i++) {
            this.contacts[i] = new Contact(contacts[i]);
        }

    }
    
}
