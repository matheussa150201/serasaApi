package com.serasa.serasa.controller;

import com.serasa.serasa.entity.Login;
import com.serasa.serasa.repository.LoginRepository;
import com.serasa.serasa.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private LoginRepository loginRepository;

    @GetMapping
    public ResponseEntity<Boolean> getCheckLogin(@RequestParam String user, @RequestParam String password ) {
        Optional<Login> optionalLoginDTO = loginRepository.findByUser(user);
        if (optionalLoginDTO.isEmpty()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
        }
        Login login = optionalLoginDTO.get();
        boolean valid = passwordEncoder.matches(password, login.getPassword());

        HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
        return ResponseEntity.status(status).body(valid);
    }

    @PostMapping("/save")
    public ResponseEntity<Login> saveLogin(@RequestBody Login login) {
        login.setPassword(passwordEncoder.encode(login.getPassword()));
        login.setUser(login.getUser());
        loginRepository.save(login);
    return new ResponseEntity<Login>(HttpStatus.OK);
    }
}
