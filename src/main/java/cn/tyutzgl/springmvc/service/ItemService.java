package cn.tyutzgl.springmvc.service;

import cn.tyutzgl.springmvc.pojo.Items;
import cn.tyutzgl.springmvc.pojo.QueryVo;

import java.util.List;

public interface ItemService {

    /**
     * 查询商品列表
     *
     * @return List<Items>
     */
    List<Items> queryItemList();

    Items queryItemById(int id);

    /**
     * 根据id更新商品
     *
     * @param item
     */
    void updateItemById(Items item);

    Items queryItemByIdAndName(Items items);

    void insetItem(Items item);

}
