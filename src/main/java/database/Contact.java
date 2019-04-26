package database;

import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "contact")
public class Contact {
    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Orders> orders;

    public Contact() {
    }

    public Contact(String name, int id) {
        this.name = name;
        this.id = id;
        orders = new ArrayList<Orders>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrder(Orders order) {
        order.setContact(this);
        orders.add(order);
    }

    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}
