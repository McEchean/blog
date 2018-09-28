package cn.echean.blog.repository;

import cn.echean.blog.entities.nodeentitis.TabEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface TabEntityRepository extends Neo4jRepository<TabEntity,Long> {
    TabEntity findByName(@Param("name")String name);
}
