package cn.tyutzgl.springmvc.service;

import cn.tyutzgl.springmvc.pojo.Items;
import cn.tyutzgl.springmvc.pojo.QueryVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestItemServiceImpl implements ItemService{
    @Override
    public List<Items> queryItemList() {
        return null;
    }

    @Override
    public Items queryItemById(int id) {
        return null;
    }

    @Override
    public void updateItemById(Items item) {

    }

    @Override
    public Items queryItemByIdAndName(Items items) {
        return null;
    }

    @Override
    public void insetItem(Items item) {

    }


    /**
     *      ____
     *     /    \                                                                /|
     * +-------------------+--------------------------------------------------------+
     * |-------------------|--------------------------------------------------------|
     * |    ////////       |          /\ /\ /\ /\ /\                               ()
     *  \------------------|--------------------------------------------------------|
     *   \-----------------|--------------------------------------------------------/
     *    |----------------|  \\    |
     *    |----------------|   \\   |
     *    |   0000         |--------+
     *    |   0000         |
     *    |   0000         |
     *    |   0000         |
     *    |   0000        /              神枪除BUG   biubiubiu~~~~~
     *    |   0000        |
     *    |   0000        |
     *    |               |
     *    |               |
     *    |               |
     *    |               |
     *    |                \
     *    +-----------------\
     *
     *
     *
     */
}
