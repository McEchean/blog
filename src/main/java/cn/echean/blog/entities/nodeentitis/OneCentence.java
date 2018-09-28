package cn.echean.blog.entities.nodeentitis;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * @author whf
 */
@NodeEntity
public class OneCentence {
    @Id
    @GeneratedValue
    private Long id;
    @Property
    private String date;
    @Property
    private String content;
    @Property
    private String author;

    public OneCentence() {
    }

    public OneCentence(String date, String content, String author) {
        this.date = date;
        this.content = content;
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "OneCentence{" +
                "date='" + date + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
