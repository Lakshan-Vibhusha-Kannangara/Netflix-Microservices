package com.vibhusha.contentservice.repository;

import com.vibhusha.contentservice.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends JpaRepository<Long, Content> {
    Content addContent(Content content);
}
