package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Copyright (C)
 * Author:   mino
 * Date:     14/11/20 5:49 下午
 * History:
 */
public interface PaymentService {
    public int create (Payment payment ); // 写
    public Payment getPaymentById (@Param( "id" ) Long id );// 读取
}
