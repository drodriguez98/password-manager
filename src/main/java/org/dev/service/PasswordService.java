package org.dev.service;

import org.dev.model.Password;
import org.dev.repository.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PasswordService {

    @Autowired
    private PasswordRepository passwordRepository;

    public List<Password> getAllPasswords() {
        return passwordRepository.findAll();
    }

    public Optional<Password> getPassword(Long id) {
        return passwordRepository.findById(id);
    }

    public Password savePassword(Password password) {
        return passwordRepository.save(password);
    }

    public void deletePassword(Long id) {
        passwordRepository.deleteById(id);
    }
}
