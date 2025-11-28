package com.codingshuttle.SpringSecurity.repository;

import com.codingshuttle.SpringSecurity.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
