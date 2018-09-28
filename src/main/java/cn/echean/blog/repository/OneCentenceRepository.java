package cn.echean.blog.repository;

import cn.echean.blog.entities.nodeentitis.OneCentence;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @author: McEchean
 * @Date: 2018/9/28 13:15
 * @Description:
 */
public interface OneCentenceRepository extends Neo4jRepository<OneCentence,Long> {

    /**
     * 每日一句
     * @return
     */
    @Query("match (n:OneCentence) return n limit 1")
    OneCentence getOneCentenceSortByDate();
}
