package database;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ContactDao {

    public Contact findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Contact.class, id);
    }

    public void save(Contact contact) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(contact);
        tx1.commit();
        session.close();
    }

    public void update(Contact contact) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(contact);
        tx1.commit();
        session.close();
    }

    public void delete(Contact contact) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(contact);
        tx1.commit();
        session.close();
    }

    public Orders findOrdersById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Orders.class, id);
    }

    public List<Contact> findAll() {
        List<Contact> contacts = (List<Contact>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Contact").list();
        return contacts;
    }
}
