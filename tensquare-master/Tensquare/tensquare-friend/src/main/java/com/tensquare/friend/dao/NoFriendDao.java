package com.tensquare.friend.dao;

import com.tensquare.friend.pojo.NoFriend;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: tensquare-parent
 * @Date: 2019-4-3 18:06
 * @Author: 846602483
 * @Description:
 */
public interface NoFriendDao extends JpaRepository<NoFriend,String> {


    public NoFriend findByUseridAndFriendid(String userid, String friendid);




}
