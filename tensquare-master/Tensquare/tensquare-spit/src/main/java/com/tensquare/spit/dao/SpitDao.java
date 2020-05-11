package com.tensquare.spit.dao;

import com.tensquare.spit.pojo.Spit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @program: tensquare-parent
 * @Date: 2019-3-24 21:33
 * @Author: 846602483
 * @Description:
 */
public interface SpitDao extends MongoRepository<Spit,String> {


    public Page<Spit> findByParentid(String parentid, Pageable pageable);


}
