package com.imooc.miaosha.vo;

import com.imooc.miaosha.domain.MiaoshaUser;
import lombok.Data;

/**
 * Author:DELL
 * Date : 2018/9/4
 **/
@Data
public class GoodsDetailVo {


    private int miaoShaStatus = 0;

    private int remainSeconds = 0;

    private GoodsVo goods;

    private MiaoshaUser user;
}
