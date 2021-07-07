package com.memoir.memoir.repositories;

import com.memoir.memoir.domain.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
