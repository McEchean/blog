package cn.echean.blog.entities.nodeentitis;

import cn.echean.blog.entities.AbstractEntity;
import cn.echean.blog.entities.relationshipentitis.rTabEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class ArticleEntity extends AbstractEntity {
    @Property
    private String name;
    @Property
    private Integer content_id;
    @Property
    private String date;
    @Property
    private String author;
    @Property
    private Integer likenum;

    @JsonIgnoreProperties("articleEntities")
    @Relationship(type = "HAS_TAB")
    private List<rTabEntity> rTabEntities;

    public ArticleEntity() {
    }

    public ArticleEntity(String name, Integer contentId, String date, String author, Integer likenum) {
        this.name = name;
        this.content_id = contentId;
        this.date = date;
        this.author = author;
        this.likenum = likenum;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getContentId() {
        return content_id;
    }

    public void setContentId(Integer contentId) {
        this.content_id = contentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "ArticleEntity{" +
                "name='" + name + '\'' +
                ", contentId=" + content_id +
                ", date=" + date +
                ", author='" + author + '\'' +
                ", likenum=" + likenum +
                ", tabEntities=" + rTabEntities +
                '}';
    }
}
