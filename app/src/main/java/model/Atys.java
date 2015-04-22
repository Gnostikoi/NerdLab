package model;

import base.BaseModel;

/**
 * Created by chizhang on 15/4/20.
 */
public class Atys extends BaseModel {

    // model columns
    public final static String COL_ID = "id";
    public final static String COL_USER_NAME = "user_name";
    public final static String COL_USER_FACE = "user_face";
    public final static String COL_TITLE = "title";
    public final static String COL_CONTENT = "content";
    public final static String COL_COMMENT_ID = "comment_id";
    public final static String COL_PUBTIME = "publish_time";
    public final static String COL_PICTURE = "picture";
    public final static String COL_JOIN_COUNT = "join_count";
    public final static String COL_LIKE_COUNT = "like_count";

    private String id;
    private String user_name;
    private String user_face;
    private String title;
    private String content;
    private String comment_id;
    private String pubtime;
    private String picture;
    private String join_count;
    private String like_count;

    public Atys(String id, String user_name, String user_face, String title, String content,
                String comment_id, String pubtime, String picture,
                String join_count, String like_count) {
        setId(id);
        setUser_name(user_name);
        setUser_face(user_face);
        setTitle(title);
        setContent(content);
        setComment_id(comment_id);
        setPubtime(pubtime);
        setPicture(picture);
        setJoin_count(join_count);
        setLike_count(like_count);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_face() {
        return user_face;
    }

    public void setUser_face(String user_face) {
        this.user_face = user_face;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComment_id() {
        return comment_id;
    }

    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }

    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getJoin_count() {
        return join_count;
    }

    public void setJoin_count(String join_count) {
        this.join_count = join_count;
    }

    public String getLike_count() {
        return like_count;
    }

    public void setLike_count(String like_count) {
        this.like_count = like_count;
    }
}
