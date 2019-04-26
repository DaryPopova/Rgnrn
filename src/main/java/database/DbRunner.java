package database;

public class DbRunner {
    public static void main(String[] args) throws Exception {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("Masha", 26);
        contactService.saveContact(contact);
        Orders order = new Orders(37, 26);
        order.setContact(contact);
        contact.addOrder(order);
        Orders order1 = new Orders(38, 26);
        order1.setContact(contact);
        contact.addOrder(order1);
        contactService.updateContact(contact);
    }
}
