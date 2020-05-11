package com.tensquare.friend.dao;

import com.tensquare.friend.pojo.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @program: tensquare-parent
 * @Date: 2019-4-3 18:06
 * @Author: 846602483
 * @Description:
 */
public interface FriendDao extends JpaRepository<Friend,String> {


    public Friend findByUseridAndFriendid(String userid, String friendid);


    @Query(value = "UPDATE tb_friend SET islike=? WHERE userid = ? AND friend = ?",nativeQuery = true)
    public void UpdateIslike(String islike, String userid, String friendid);

    @Modifying
    @Query(value = "DELETE FROM tb_friend WHERE userid = ? AND friend = ?",nativeQuery = true)
    void deletefriend(String userid, String friendid);
}
