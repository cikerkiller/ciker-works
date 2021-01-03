package com.hf.ciker.works.service.impl;

import com.hf.ciker.works.po.User;
import com.hf.ciker.works.mapper.UserMapper;
import com.hf.ciker.works.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author ciker
 * @since 2021-01-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
