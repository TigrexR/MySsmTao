package com.taotao.service.impl;

import com.taotao.common.pojo.TreeNode;
import com.taotao.mapper.TbItem_catMapper;
import com.taotao.pojo.TbItem_cat;
import com.taotao.pojo.TbItem_catExample;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Linus on 2018/4/8.
 * @author Linus
 */
@Service
public class ItemCatServiceImpl implements ItemCatService{

    @Autowired
    private TbItem_catMapper itemCatMapper;

    @Override
    public List<TreeNode> getItemCatList(long parentId) {
        //根据parentId查询分类列表
        TbItem_catExample example = new TbItem_catExample();
        //设置查询条件
        TbItem_catExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        //执行查询
        List<TbItem_cat> list = itemCatMapper.selectByExample(example);
        //分类列表转换成TreeNode的列表
        List<TreeNode> resultList = new ArrayList<>();
        for (TbItem_cat tbItemCat : list) {
            //创建一个TreeNode对象
            TreeNode node = new TreeNode(tbItemCat.getId(), tbItemCat.getName(), tbItemCat.getIsParent()?"closed":"open");
            resultList.add(node);
        }

        return resultList;
    }
}
