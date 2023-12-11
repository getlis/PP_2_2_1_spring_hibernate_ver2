package hiber.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
@Table(name = "cars")
public class Car implements Serializable {

    @Id
    @OneToOne
    @JoinColumn( name = "users_id" , referencedColumnName = "id")
    private User user;

    @Column
    private String model;

    @Column
    private int series;

    public Car() {
    }

    public Car(User user, String model, int series) {
        this.user = user;
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
