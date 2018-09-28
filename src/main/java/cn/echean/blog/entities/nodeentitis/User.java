package cn.echean.blog.entities.nodeentitis;

import cn.echean.blog.entities.AbstractEntity;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class User extends AbstractEntity {
    @Property
    private String username;

    @Property
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
