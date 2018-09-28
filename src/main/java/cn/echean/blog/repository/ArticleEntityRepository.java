package cn.echean.blog.repository;

import cn.echean.blog.entities.nodeentitis.ArticleEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.Collection;

public interface ArticleEntityRepository extends Neo4jRepository<ArticleEntity,Long> {

    ArticleEntity findByName(@Param("name")String name);

    Collection<ArticleEntity> findAllByNameLike(@Param("name")String name);

    @Query("Match (n:ArticleEntity)-[p:HAS_TAB]->(m:TabEntity)  return n,m,p limit {limit}")
    Collection<ArticleEntity> getAll(@Param("limit")Integer limit);

    /**
     * 查询分类下的所有文章
     * @param name
     * @return 文章列表
     */
    @Query("Match (n:ArticleEntity) where n.category={name} return n")
    Collection<ArticleEntity> getArticleEntitiesByCategory(@Param("name")String name);

    /**
     * 根据传入的参数排序，返回有限条
     * @param param
     * @param limit
     * @return
     */
    @Query("match(n:ArticleEntity) return n order by n.{param} limit {limit}")
    ArrayList<ArticleEntity> getArticleSortByParam(@Param("param")String param,@Param("limit")Integer limit);


    /**
     * 查询所有分类
     * @return
     */
    @Query("match(n:ArticleEntity) return distinct n.category")
    ArrayList<String> getAllCategory();
}
