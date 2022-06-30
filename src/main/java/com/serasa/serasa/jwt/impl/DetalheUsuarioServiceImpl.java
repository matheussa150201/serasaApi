//package com.serasa.serasa.jwt.impl;
//
//import com.serasa.serasa.entity.Login;
//import com.serasa.serasa.jwt.data.DetalheUsuarioData;
//import com.serasa.serasa.repository.LoginRepository;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//
//@Component
//public class DetalheUsuarioServiceImpl implements UserDetailsService {
//
//    private final LoginRepository loginRepository;
//
//    public DetalheUsuarioServiceImpl(LoginRepository loginRepository) {
//        this.loginRepository = loginRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<Login> login = loginRepository.findByUser(username);
//        if (login.isEmpty()) {
//            throw new UsernameNotFoundException("Usuário " + username + " não encontrado!");
//        }
//
//        return new DetalheUsuarioData(login);
//    }
//}
