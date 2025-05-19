package com.futurex.services.FutureXCourseApp;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;


public interface CourseRepository extends JpaRepository<Course, BigInteger> {
}
