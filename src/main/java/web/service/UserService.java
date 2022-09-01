package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public void save(User user);
    public User findById(long id);
    public void update(User user);
    public void delete(long id);
    public List<User> showAll();

}
