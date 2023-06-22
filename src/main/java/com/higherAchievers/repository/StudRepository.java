package com.higherAchievers.repository;

import com.higherAchievers.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudRepository extends JpaRepository<Student, Long> {
}
