package com.taotao.service;

import com.taotao.common.pojo.TreeNode;

import java.util.List;

/**
 * Created by Linus on 2018/4/8.
 */
public interface ItemCatService {
    List<TreeNode> getItemCatList(long parentId);
}
