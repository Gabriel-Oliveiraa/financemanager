package br.com.texsistemas.financemanager.domain.service;

import br.com.texsistemas.financemanager.domain.model.user.User;
import br.com.texsistemas.financemanager.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserSeviceImpl implements UserService {

    private final UserRepository repository;

    public UserSeviceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User getUser(String email) {
        return repository.;
    }

    

}
