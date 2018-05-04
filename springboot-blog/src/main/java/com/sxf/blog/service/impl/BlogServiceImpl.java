package com.sxf.blog.service.impl;

import com.sxf.blog.entity.UserVo;
import com.sxf.blog.mapper.BlogMapper;
import com.sxf.blog.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author shuxf
 * @Date 2018/4/28 17:05
 */
@Service
public class BlogServiceImpl implements BlogService {
    private static final Logger logger = LoggerFactory.getLogger(BlogServiceImpl.class);

    @Autowired
    private BlogMapper blogMapper;

    /**
     * 获取blog首页中的信息（推荐作者列表）
     */
    @Override
    public List<UserVo> getAuthor(){
        try {
            logger.info("获取blog首页推荐作者列表");
            return blogMapper.getAuthor();
        }catch (Exception e){
            logger.error("获取首页推荐作者列表失败", e);
            throw e;
        }
    }
}
