package io.jxunix.domain;

public class Admin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.password
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.name
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.sex
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private Boolean sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.birthday
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.mobile
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private Integer mobile;

    @Override
    public String toString() {
        return "Admin [id=" + id + ", password=" + password + ", name=" + name + ", sex=" + sex + ", birthday="
                + birthday + ", mobile=" + mobile + "]";
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.id
     *
     * @return the value of admin.id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.id
     *
     * @param id the value for admin.id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.password
     *
     * @return the value of admin.password
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.password
     *
     * @param password the value for admin.password
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.name
     *
     * @return the value of admin.name
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.name
     *
     * @param name the value for admin.name
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.sex
     *
     * @return the value of admin.sex
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.sex
     *
     * @param sex the value for admin.sex
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.birthday
     *
     * @return the value of admin.birthday
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.birthday
     *
     * @param birthday the value for admin.birthday
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.mobile
     *
     * @return the value of admin.mobile
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public Integer getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.mobile
     *
     * @param mobile the value for admin.mobile
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }
}