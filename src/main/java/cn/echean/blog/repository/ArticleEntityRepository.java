package cn.echean.blog.repository;

import cn.echean.blog.entities.nodeentitis.ArticleEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface ArticleEntityRepository extends Neo4jRepository<ArticleEntity,Long> {

    ArticleEntity findByName(@Param("name")String name);

    Collection<ArticleEntity> findAllByNameLike(@Param("name")String name);

    @Query("Match (n:ArticleEntity)-[p:HAS_TAB]->(m:TabEntity)  return n,m,p limit {limit}")
    Collection<ArticleEntity> getAll(@Param("limit")Integer limit);

}
