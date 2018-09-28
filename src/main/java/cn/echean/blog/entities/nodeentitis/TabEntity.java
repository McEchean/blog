package cn.echean.blog.entities.nodeentitis;

import cn.echean.blog.entities.AbstractEntity;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class TabEntity extends AbstractEntity {
    @Property
    private String name;

//    @JsonIgnoreProperties("tabEntity")
    @Relationship(type = "HAS_TAB",direction = "INCOMING")
    private List<ArticleEntity> articleEntities;

    public TabEntity() {
    }

    public TabEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TabEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
