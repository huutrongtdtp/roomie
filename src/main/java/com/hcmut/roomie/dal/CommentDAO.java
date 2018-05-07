package com.hcmut.roomie.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcmut.roomie.entity.Comment;
@Repository
public interface CommentDAO extends JpaRepository<Comment, Long>{

}
