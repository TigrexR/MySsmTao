package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

import java.util.List;

/**
 * 商品管理service
 * Created by Linus on 2018/4/2.
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long itemId) {
//        TbItemExample example = new TbItemExample();
//        TbItemExample.Criteria criteria = example.createCriteria();
//        criteria.andIdEqualTo(itemId);
//        List<TbItem> list = itemMapper.selectByExample(example);
        TbItem item = itemMapper.selectByPrimaryKey(itemId);
//        if(list!=null&&list.size()>0){
//            TbItem item = list.get(0);
//            return item;
//        }
        return item;
    }
}
