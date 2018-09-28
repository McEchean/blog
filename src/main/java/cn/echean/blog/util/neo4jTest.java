package cn.echean.blog.util;

import org.neo4j.driver.v1.*;
import org.neo4j.ogm.drivers.bolt.response.GraphModelResponse;

import static org.neo4j.driver.v1.Values.parameters;

public class neo4jTest {
    private Driver driver;

    public neo4jTest(String uri,String username, String pwd) {
        this.driver = GraphDatabase.driver(uri, AuthTokens.basic(username,pwd));
    }

    public void addSome(String name) {
        try (Session s = driver.session()){
            try(Transaction tx = s.beginTransaction()) {
                tx.run("merge(a:Person{name:{x}})",parameters("x",name));
                tx.success();
            }
        }
    }
    public void addR(String name1,String toName2) {
        try(Session session = driver.session()) {
            try(Transaction tx = session.beginTransaction()) {
                tx.run("");
            }
        }
    }
    public void close() {
        driver.close();
    }

    public static void main(String[] args) {

        neo4jTest neo = new neo4jTest("bolt://localhost:7687","neo4j","adminwhf");
        for (int i = 0; i < 100; i++) {
            neo.addSome("add1" + i);
        }
        neo.close();
    }
}
