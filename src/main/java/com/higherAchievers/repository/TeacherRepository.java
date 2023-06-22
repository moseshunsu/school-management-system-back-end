package com.higherAchievers.repository;

import com.higherAchievers.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    boolean existsByUsernameOrEmailAllIgnoreCase(String username, String email);
    boolean existsByEmail(String email);
    boolean existsByUsername(String email);
    Optional<Teacher> findByUsernameOrEmail(String username, String email);

}
