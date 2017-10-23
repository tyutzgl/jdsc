package cn.tyutzgl.springmvc.service;

import cn.tyutzgl.springmvc.mapper.ItemsMapper;
import cn.tyutzgl.springmvc.pojo.Items;
import cn.tyutzgl.springmvc.pojo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemsMapper itemsMapper;

    @Autowired
    public ItemServiceImpl(ItemsMapper itemsMapper) {
        this.itemsMapper = itemsMapper;
    }


    @Override
    public List<Items> queryItemList() {
        // 从数据库查询商品数据
        return this.itemsMapper.selectByExample(null);
    }


    @Override
    public Items queryItemById(int id) {
        //根据ID查询商品信息
        return this.itemsMapper.selectByPrimaryKey(id);
    }


    @Override
    public void updateItemById(Items item) {
        //根据商品ID 修改商品信息
        this.itemsMapper.updateByPrimaryKeySelective(item);
    }

    @Override
    public Items queryItemByIdAndName(Items items) {
        //根据商品ID和商品名称查询商品
        return this.itemsMapper.selectByIdAndName(items);
    }

    @Override
    public void insetItem(Items item) {
        // 插入一条商品信息
        this.itemsMapper.insert(item);
    }


}


