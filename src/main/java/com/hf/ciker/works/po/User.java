package com.hf.ciker.works.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author ciker
 * @since 2021-01-01
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("ck_user")
@ApiModel(value="User对象", description="用户表")
public class User extends BasePO {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "用户表主键id")
    @TableId(value = "id_ck_user", type = IdType.UUID)
    private String idCkUser;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

}
