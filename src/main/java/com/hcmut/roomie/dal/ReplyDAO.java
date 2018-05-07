package com.hcmut.roomie.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcmut.roomie.entity.Reply;
@Repository
public interface ReplyDAO extends JpaRepository<Reply, Long>{

}
