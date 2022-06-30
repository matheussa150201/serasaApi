package com.serasa.serasa.service;

import com.serasa.serasa.entity.Login;
import com.serasa.serasa.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor()
@Service
public class LoginService {

    private final LoginRepository loginRepository;

    public Login saveLogin(Login login) {
        return loginRepository.save(login);
    }
}
