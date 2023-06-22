package com.higherAchievers.service;

import com.higherAchievers.entity.Teacher;
import com.higherAchievers.repository.TeacherRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final TeacherRepository teacherRepository;

    public UserDetailsServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {

        Teacher teacher = teacherRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail).orElseThrow(
                () -> new UsernameNotFoundException("Details not found for this teacher : " + usernameOrEmail));

        return new User(usernameOrEmail, teacher.getPassword(),
                Collections.singleton(new SimpleGrantedAuthority(teacher.getRole())));

    }

}
