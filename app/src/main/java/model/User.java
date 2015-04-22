package model;

import base.BaseModel;

/**
 * Created by chizhang on 15/4/20.
 */
public class User extends BaseModel{
    // model columns
    public final static String COL_ID = "id";
    public final static String COL_NAME = "name";
    public final static String COL_PASS = "pass";
    public final static String COL_SIGN = "sign";
    public final static String COL_FACE = "face";
    public final static String COL_PUBCOUNT = "pubcount";
    public final static String COL_JOINCOUNT = "joincount";
    public final static String COL_UPTIME = "uptime";

    private String id;
    private String name;
    private String pass;
    private String sign;
    private String face;
    private String pubcount;
    private String joincount;
    private String uptime;

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public User() {

    }

    public User(String id,String name,String pass,String sign,String face,String pubcount,String joincount,String uptime){
        setId(id);
        setName(name);
        setPass(pass);
        setSign(sign);
        setFace(face);
        setPubcount(pubcount);
        setJoincount(joincount);
        setUptime(uptime);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getPubcount() {
        return pubcount;
    }

    public void setPubcount(String pubcount) {
        this.pubcount = pubcount;
    }

    public String getJoincount() {
        return joincount;
    }

    public void setJoincount(String joincount) {
        this.joincount = joincount;
    }

    // default is no login
    private boolean isLogin = false;

    // single instance for login
    static private User user = null;

    static public User getInstance () {
        if (User.user == null) {
        User.user=new User();
        }
        return User.user;
    }
}
