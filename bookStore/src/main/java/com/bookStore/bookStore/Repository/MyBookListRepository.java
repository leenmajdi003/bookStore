package com.bookStore.bookStore.Repository;

import com.bookStore.bookStore.Entity.MyBookList;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookListRepository extends JpaRepository<MyBookList,Integer> {
}
