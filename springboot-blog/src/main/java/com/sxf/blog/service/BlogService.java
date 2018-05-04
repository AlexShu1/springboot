package com.sxf.blog.service;

import com.sxf.blog.entity.UserVo;

import java.util.List;

/**
 * @Author shuxf
 * @Date 2018/4/28 15:47
 */
public interface BlogService {

    List<UserVo> getAuthor();

}
