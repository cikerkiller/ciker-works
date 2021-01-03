package com.hf.ciker.works.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ciker
 * @version 1.0
 * @date 2021/1/1 17:37
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BasePO implements Serializable {

    @ApiModelProperty(value = "创建者")
    private String createdBy;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "created_date", fill = FieldFill.INSERT)
    private Date createdDate;

    @ApiModelProperty(value = "更新者")
    private String updatedBy;

    @ApiModelProperty(value = "更新时间")
    @TableField(value = "updated_date", fill = FieldFill.INSERT_UPDATE)
    private Date updatedDate;

    @ApiModelProperty(value = "软删除戳")
    @TableLogic
    private String isDelete;

    @ApiModelProperty(value = "版本号")
    @Version
    private Integer version;
}
