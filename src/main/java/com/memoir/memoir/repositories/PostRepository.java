package com.memoir.memoir.repositories;

import com.memoir.memoir.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {

    Post findById(String id);
}
