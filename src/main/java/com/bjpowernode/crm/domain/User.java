package com.bjpowernode.crm.domain;

public class User {
    /**
     * 关于日期
     * 年月日 yyyy-MM-dd
     *yyyy-MM-dd HH:mm:ss
     */
    /**
     * 关于登录
     *      select count(*) from tbl_user loginAct =? and loginPwd = ? 只能判断账号合不合法不能判断 是否还有用
     */
    private String id ;//主键
    private String loginAct;//登陆账号
    private String name;//
    private String loginPwd;//登陆密码
    private String email ;//邮箱
    private String expireTime;
    private String lockState; //锁定状态 0表示锁定 1表示启用
    private String deptno;//部门编号
    private String allowIps;//允许访问的IP地址
    private String createTime;//创建时间
    private String createBy;//创建时间
    private String editTime;//修改时间
    private String editBy;//修改的人

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginAct() {
        return loginAct;
    }

    public void setLoginAct(String loginAct) {
        this.loginAct = loginAct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getLockState() {
        return lockState;
    }

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getAllowIps() {
        return allowIps;
    }

    public void setAllowIps(String allowIps) {
        this.allowIps = allowIps;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }
}
