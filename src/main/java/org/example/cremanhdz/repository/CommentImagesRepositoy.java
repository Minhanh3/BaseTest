package org.example.cremanhdz.repository;

import org.example.cremanhdz.entity.CommentImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentImagesRepositoy extends JpaRepository<CommentImages, Long> {
}
