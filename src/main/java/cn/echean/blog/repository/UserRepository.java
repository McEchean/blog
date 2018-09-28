package cn.echean.blog.repository;

import cn.echean.blog.entities.nodeentitis.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends Neo4jRepository<User,Long> {
    /**
     * 通过用户名和密码查询用户
     * @param username
     * @param password
     * @return 用户对象
     */
    User getUserByUsernameAndPassword(@Param("username")String username,@Param("userpwd")String password);
}
