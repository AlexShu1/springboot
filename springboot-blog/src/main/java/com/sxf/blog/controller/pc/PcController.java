package com.sxf.blog.controller.pc;

import com.sxf.blog.entity.Response;
import com.sxf.blog.entity.UserVo;
import com.sxf.blog.service.BlogService;
import com.wordnik.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author shuxf
 * @Date 2018/4/27 10:12
 */
@RestController
@RequestMapping("/pc/blog/")
public class PcController {
    private static final Logger logger = LoggerFactory.getLogger(PcController.class);

    @Autowired
    private BlogService blogService;

    /**
     * 博客PC端首页接口
     */
    @ApiOperation(value = "博客PC端首页接口", notes = "获取首页中推荐的热门作者（热门用户列表）", response = Response.class)
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public Response getPcIndex(){
        Response response = new Response();

        List<UserVo> userList = blogService.getAuthor();

        if (response.getCode() == 200) {
            response.setMessage("查询成功");
            response.setData(userList);
        } else {
            response.setCode(300);
            response.setMessage("查询失败");
        }
        return response;
    }
}
