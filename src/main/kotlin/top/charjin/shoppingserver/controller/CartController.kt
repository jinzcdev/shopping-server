package top.charjin.shoppingserver.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import top.charjin.shoppingserver.model.OsCartModel
import top.charjin.shoppingserver.service.OsCartService
import top.charjin.shoppingserver.service.OsGoodsService
import top.charjin.shoppingserver.service.OsShopService
import javax.annotation.Resource

@RestController
@RequestMapping("/cart")
class CartController {


    @Resource
    private lateinit var cartService: OsCartService

    @Resource
    private lateinit var goodsService: OsGoodsService

    @Resource
    private lateinit var shopService: OsShopService


    /**
     * 根据用户id 查询购物车信息
     */

    @RequestMapping("/query-cart")
    fun queryCartGoodsList(@RequestParam("id") userId: Int): List<OsCartModel>? {
        val listShop = shopService.selectByUserId(userId)
        val cartModelList = arrayListOf<OsCartModel>()
        listShop.forEach { cartModelList.add(OsCartModel(it, goodsService.selectGoodsByShopId(userId, it.id!!))) }
        return cartModelList
    }


}