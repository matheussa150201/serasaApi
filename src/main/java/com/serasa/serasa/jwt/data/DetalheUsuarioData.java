//package com.serasa.serasa.jwt.data;
//
//import com.serasa.serasa.entity.Login;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Optional;
//
//public class DetalheUsuarioData implements UserDetails {
//
//    private final Optional<Login> login;
//
//    public DetalheUsuarioData(Optional<Login> login) {
//        this.login = login;
//    }
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return new ArrayList<>();
//    }
//
//    @Override
//    public String getPassword() {
//        return login.orElse(new Login()).getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return login.orElse(new Login()).getUser();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
