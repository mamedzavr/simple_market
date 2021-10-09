package com.telekom.ecare.repository;

import com.telekom.ecare.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
