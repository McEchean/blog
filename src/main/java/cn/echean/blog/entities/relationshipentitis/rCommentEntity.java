package cn.echean.blog.entities.relationshipentitis;

import cn.echean.blog.entities.AbstractEntity;
import cn.echean.blog.entities.nodeentitis.ArticleEntity;
import cn.echean.blog.entities.nodeentitis.CommentEntity;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.ArrayList;
import java.util.List;

@RelationshipEntity(type = "HAS_COMMENT")
public class rCommentEntity extends AbstractEntity {

    private List<String> roles = new ArrayList<>();

    @StartNode
    private ArticleEntity articleEntity;

    @EndNode
    private CommentEntity commentEntity;
}
