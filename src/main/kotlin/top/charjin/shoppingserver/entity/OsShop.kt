package top.charjin.shoppingserver.entity

import java.io.Serializable

class OsShop : Serializable {
    var id: Int? = null

    var name: String? = null

    /**
     * 商品类型(id)
     */
    var shopTypeId: Int? = null

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(javaClass.simpleName)
        sb.append(" [")
        sb.append("Hash = ").append(hashCode())
        sb.append(", id=").append(id)
        sb.append(", name=").append(name)
        sb.append(", shopTypeId=").append(shopTypeId)
        sb.append("]")
        return sb.toString()
    }

    companion object {

        private const val serialVersionUID = 1L
    }
}