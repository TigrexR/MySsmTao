package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;

/**
 * Created by Linus on 2018/4/2.
 */
public interface ItemService {
    TbItem getItemById(long itemId);

    EUDataGridResult getItemList(int page, int rows);
}
