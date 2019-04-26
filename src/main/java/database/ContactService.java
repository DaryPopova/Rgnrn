package database;

public class ContactService {

        private ContactDao contactDao = new ContactDao();

        public ContactService() {
        }

        public Contact findContact(int id) {
            return contactDao.findById(id);
        }

        public void saveContact(Contact contact) {
            contactDao.save(contact);
        }

        public void deleteContact(Contact contact) {
            contactDao.delete(contact);
        }

        public void updateContact(Contact contact) {
            contactDao.update(contact);
        }
}