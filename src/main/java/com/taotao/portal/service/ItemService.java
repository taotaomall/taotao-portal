package com.taotao.portal.service;

import com.taotao.portal.pojo.ItemInfo;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 12:23 2018/2/26
 */
public interface ItemService {

        ItemInfo getItemById(Long itemId);
        String getItemDescById(Long itemId);
        String getItemParam(Long itemId);
}
