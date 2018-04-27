package com.sxf.blog.controller.pc;

import com.sxf.blog.entiy.Response;
import com.wordnik.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author shuxf
 * @Date 2018/4/27 10:12
 */
@RestController
@RequestMapping("/pc/blog/")
public class PcController {
    private static final Logger logger = LoggerFactory.getLogger(PcController.class);

    /**
     * 博客PC端首页接口
     */
    @ApiOperation(value = "博客PC端首页接口", notes = "用于PC端前台博客首页的数据请求(静态数据，不含正文分页数据)", response = Response.class)
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public Response getPcIndex(){
        Response response = new Response();

        logger.info("请求Blog系统的控制器成功");
        response.setCode(200);
        response.setData("测试数据返回");
        response.setMessage("请求成功");
        return response;
    }
}
