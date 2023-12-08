package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    Car getCar(String _model , int _series );
    List<User> listUsers();
}
