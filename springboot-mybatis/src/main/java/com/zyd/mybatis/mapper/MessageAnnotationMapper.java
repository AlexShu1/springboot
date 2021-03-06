/**
 * Copyright [2016-2017] [xianfeng.shu]
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zyd.mybatis.mapper;

import com.zyd.mybatis.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * springboot
 * Created by xianfeng.shu on com.zyd.testMybatis.mapper
 * @Author: xianfeng.shu
 * @Date: 2017/8/8 10:22
 */
@Mapper
public interface MessageAnnotationMapper {

    @Select("SELECT NICK_NAME FROM custom")
    @Results({
            @Result(property = "nickName",  column = "NICK_NAME")
    })
    List<Message> list();
}
