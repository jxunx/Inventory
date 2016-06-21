package io.jxunix.domain;

import java.util.Date;

public class PurchaseReturnOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_return_order.id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_return_order.goods_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_return_order.supplier_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String supplierId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_return_order.user_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_return_order.create_time
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_return_order.id
     *
     * @return the value of purchase_return_order.id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_return_order.id
     *
     * @param id the value for purchase_return_order.id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_return_order.goods_id
     *
     * @return the value of purchase_return_order.goods_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_return_order.goods_id
     *
     * @param goodsId the value for purchase_return_order.goods_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_return_order.supplier_id
     *
     * @return the value of purchase_return_order.supplier_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_return_order.supplier_id
     *
     * @param supplierId the value for purchase_return_order.supplier_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_return_order.user_id
     *
     * @return the value of purchase_return_order.user_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_return_order.user_id
     *
     * @param userId the value for purchase_return_order.user_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_return_order.create_time
     *
     * @return the value of purchase_return_order.create_time
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_return_order.create_time
     *
     * @param createTime the value for purchase_return_order.create_time
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}