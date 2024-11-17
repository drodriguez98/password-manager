package org.dev.controller;

import org.dev.model.Password;
import org.dev.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/passwords")
public class PasswordController {

    @Autowired
    private PasswordService passwordService;

    @GetMapping
    public List<Password> getAllPasswords() {
        return passwordService.getAllPasswords();
    }

    @GetMapping("/{id}")
    public Optional<Password> getPassword(@PathVariable Long id) {
        return passwordService.getPassword(id);
    }

    @PostMapping
    public Password savePassword(@RequestBody Password password) {
        return passwordService.savePassword(password);
    }

    @DeleteMapping("/{id}")
    public void deletePassword(@PathVariable Long id) {
        passwordService.deletePassword(id);
    }
}
