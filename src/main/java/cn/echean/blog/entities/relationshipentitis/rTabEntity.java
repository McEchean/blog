package cn.echean.blog.entities.relationshipentitis;

import cn.echean.blog.entities.AbstractEntity;
import cn.echean.blog.entities.nodeentitis.ArticleEntity;
import cn.echean.blog.entities.nodeentitis.TabEntity;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "HAS_TAB")
public class rTabEntity extends AbstractEntity {

    @StartNode
    private ArticleEntity articleEntity;

    @EndNode
    private TabEntity tabEntity;

    public rTabEntity(ArticleEntity articleEntity, TabEntity tabEntity) {
        this.articleEntity = articleEntity;
        this.tabEntity = tabEntity;
    }

    public rTabEntity() {
    }
}
