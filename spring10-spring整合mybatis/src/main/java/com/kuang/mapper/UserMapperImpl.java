package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author ：fzj
 * @date ：2021/1/15
 */
public class UserMapperImpl implements UserMapper {

    //我们的所有操作都使用sqlSession来执行，在原来，现在都使用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectAllUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectAllUsers();
    }

    @Override
    public int deleteUser(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }
}
