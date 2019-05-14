package top.charjin.shoppingserver.entity

import java.io.Serializable

class OsUser : Serializable {
    var id: Int? = null

    /**
     * -- 头像在服务器的路径
     */
    var headPortrait: String? = null

    /**
     * 用户名
     */
    var username: String? = null

    /**
     * 密码
     */
    var password: String? = null

    /**
     * 真实姓名
     */
    var realName: String? = null

    /**
     * 性别,为了便于读取存为男,女
     */
    var sex: String? = null

    /**
     * 联系方式
     */
    var phone: String? = null

    /**
     * 收货地址
     */
    var address: String? = null

    companion object {

        private const val serialVersionUID = 1L
    }
}