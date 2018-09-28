package cn.echean.blog.repository;

import cn.echean.blog.entities.relationshipentitis.rTabEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface RTabRepository extends Neo4jRepository<rTabEntity,Long> {
}
