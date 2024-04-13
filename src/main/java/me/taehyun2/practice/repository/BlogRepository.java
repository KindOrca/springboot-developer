package me.taehyun2.practice.repository;

import me.taehyun2.practice.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
