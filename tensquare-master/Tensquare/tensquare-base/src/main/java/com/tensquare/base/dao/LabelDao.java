package com.tensquare.base.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.tensquare.base.pojo.Label;

/**
 * @program: tensquare-parent
 * @Date: 2019-3-21 21:58
 * @Author: 846602483
 * @Description:标签数据访问接口
 */
public interface LabelDao extends JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {






}
