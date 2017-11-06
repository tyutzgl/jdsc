package cn.tyutzgl.springmvc.controller;

import cn.tyutzgl.springmvc.pojo.Items;
import cn.tyutzgl.springmvc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 商品管理
 * Date: 2017/8/9
 * Time: 12:01
 */
@Controller
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(@Qualifier("itemServiceImpl") ItemService itemService) {
        this.itemService = itemService;
    }

    /**
     * http://localhost:8080/item/itemList
     *
     * @return modelAndView
     *
     */
    @RequestMapping("/item/itemList")
    public ModelAndView queryItemList() {
        // 获取商品数据
        List<Items> list = this.itemService.queryItemList();

        ModelAndView modelAndView = new ModelAndView();
        // 把商品数据放到模型中
        modelAndView.addObject("itemList", list);
        // 设置逻辑视图
        modelAndView.setViewName("itemList");

        return modelAndView;
    }

    /**
     * 根据id查询商品
     * http://localhost:8080/item/itemEdit
     * @return modelAndView
     */
    @RequestMapping("/item/itemEdit")
    public String queryItemById(@RequestParam(value = "id", defaultValue = "1")
                                        Integer id, ModelMap modelMap) {
        // 根据id查询商品数据
        Items item = this.itemService.queryItemById(id);

        // 把商品数据放在模型中
        modelMap.addAttribute("item", item);

        // 返回逻辑视图
        return "itemEdit";
    }

    //更新商品,绑定pojo类型
    @RequestMapping("/item/updateItem")
    public String updateItem(Items item) {

        // 调用服务更新商品
        this.itemService.updateItemById(item);

        // 重定向itemList
        return "redirect:/item/itemList";
    }

    /**
     * 通过ID和名称查询商品
     */
    @RequestMapping("/item/queryItem")
    public String queryItem(Items item, ModelMap modelMap) {
//        System.out.println(queryVo.getItems().getId());
//        System.out.println(queryVo.getItems().getName());
        //System.out.println("122");
        System.out.println(item.getName());
        Items items = this.itemService.queryItemByIdAndName(item);
        modelMap.addAttribute("item", items);
        return "showQueryItem";
    }

    @RequestMapping("/item/toInsertItem")
    public String toInsertItem(){
        return "insertItem";
    }

    @RequestMapping("/item/insertItem")
    public String insertItem(Items item){
        System.out.println(item.getName());
        this.itemService.insetItem(item);
        return "redirect:/item/itemList";
    }


    @RequestMapping("item/simpList")

    public String simpList(ModelMap modelMap){

        List<Items> list = this.itemService.queryItemList();

        modelMap.addAttribute("list", list);

        return "list";
    }
}

