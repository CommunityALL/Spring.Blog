package com.site.blog.repo;

import com.site.blog.models.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PostRepository extends CrudRepository<Post, Long> {

    @Query("SELECT e FROM Post e WHERE e.title LIKE %:search%")
    Iterable<Post> findByTitleLikeIgnoreCase(@Param("search") String search);

}
