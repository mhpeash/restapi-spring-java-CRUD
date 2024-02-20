package com.mhpeash.api.restapi.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "accesstoken")
public class AccessToken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "UserId")
    private String userId;

    @Column(name = "UserToken")
    private String userToken;

    @Column(name = "CreateDate")
    private String createDate;

    @Column(name = "UpdateDate")
    private String updateDate;

    public AccessToken(String userId, String userToken, String createDate, String updateDate) {
        super();
        this.userId = userId;
        this.userToken = userToken;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public AccessToken() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
