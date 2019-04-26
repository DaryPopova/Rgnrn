package database;

import org.hibernate.annotations.Entity;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @Column(name = "orderid")
    private int orderId;

    @Column(name = "personid")
    private int personId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personid")
    private Contact contact;

    public Orders() {
    }

    public Orders(int orderId, int personId) {
        this.orderId = orderId;
        this.personId = personId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getOrderId() {
        return orderId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personid")
    public int getPersonId() {
        return personId;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return orderId + " " + personId;
    }
}