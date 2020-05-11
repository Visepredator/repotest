package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @program: tensquare-parent
 * @Date: 2019-3-21 21:31
 * @Author: 846602483
 * @Description:标签控制层
 */

@RestController
@CrossOrigin
@RequestMapping("/label")
@RefreshScope
public class LabelController {

    @Autowired
    private LabelService labelService;
    @Autowired
    private HttpServletRequest httpServletRequestl;

    @Value("${ip}")
    private String ip;

    /**
     * 查询全部列表
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result<List> findAll(){

        System.out.println("ip测试地址"+ip);
        //获取头信息
       String header =  httpServletRequestl.getHeader("Authorization");
        System.out.println(header);
       return new Result<>(true, StatusCode.OK,"查询成功",labelService.findAll());

    }

    /**
     * 根据ID查询标签
     * @param labelId
     * @return
     */
    @RequestMapping(value = "/{labelId}",method = RequestMethod.GET)
    public Result<Label> findById(@PathVariable("labelId")String labelId){


        return new Result<>(true, StatusCode.OK,"查询成功",labelService.finaById(labelId));


    }

    /**
     * 增加标签
     * @param label
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Label label ){

        labelService.add(label);

        return new Result(true, StatusCode.OK,"添加成功");
    }

    /**
     * 修改标签
     * @param labelId
     * @param label
     * @return
     */
    @RequestMapping(value = "/{labelId}" ,   method = RequestMethod.PUT)
    public Result update(@PathVariable("labelId") String labelId,@RequestBody Label label ){

        label.setId(labelId);

        labelService.update(label);

        return new Result(true, StatusCode.OK,"更新成功");
    }

    /**
     * 删除标签
     * @param labelId
     * @return
     */
    @RequestMapping(value = "/{labelId}",method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable("labelId") String labelId){

       labelService.deleteById(labelId);
        return new Result(true, StatusCode.OK,"删除成功");


    }

    /**
     * 根据条件查询
     */

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public Result<List> findSearch(@RequestBody Label label){

        List<Label> list = labelService.findSearch(label);
        return new Result<>(true,StatusCode.OK,"查询成功",list);

    }

    /**
     * 分页条件查询
     */

    @RequestMapping(value = "/search/{page}/{size}",method = RequestMethod.POST)
    public Result<List> pageQuery(@RequestBody Label label,@PathVariable("page") int page,@PathVariable("size") int size){

       Page<Label> pageData = labelService.pageQuery(label,page,size);
        return new Result<>(true,StatusCode.OK,"查询成功",new PageResult<Label>(pageData.getTotalElements(),pageData.getContent()));

    }


}
