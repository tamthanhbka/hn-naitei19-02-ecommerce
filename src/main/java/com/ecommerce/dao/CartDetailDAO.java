package com.ecommerce.dao;

import com.ecommerce.model.CartDetail;

/**
 * @Project: hn-naitei19-02-ecommerce
 * @Author: sonle
 * @Date: 20/09/2023
 * @Time: 00:16
 */
public interface CartDetailDAO extends DAO<Long, CartDetail> {
    void deleteAllByCartId(Long cartId);
}
