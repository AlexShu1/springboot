package com.sxf.blog.entity;

import java.util.Date;

public class Blog {
    private Integer id;

    private Integer circleid;

    private String title;

    private String subtitle;

    private Integer zansum;

    private Integer commentsum;

    private Integer forwardsum;

    private Integer collectsum;

    private Integer isactive;

    private Integer type;

    private Integer ishot;

    private Integer isessence;

    private Integer orderid;

    private String coverimg;

    private String hotimgurl;

    private Date intime;

    private Integer totalpoint;

    private Integer isdel;

    private Integer isessencepool;

    private Integer activetype;

    private Double activefee;

    private Integer iscontribute;

    private Date essencedate;

    private String userid;

    private Date oprtime;

    private Integer heatValue;

    private Integer partsumEnddays;

    private Integer activeid;

    private Integer ishotOrder;

    private String city;

    private Integer isheatoperate;

    private Integer countview;

    private Integer category;

    private String postcontent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCircleid() {
        return circleid;
    }

    public void setCircleid(Integer circleid) {
        this.circleid = circleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public Integer getZansum() {
        return zansum;
    }

    public void setZansum(Integer zansum) {
        this.zansum = zansum;
    }

    public Integer getCommentsum() {
        return commentsum;
    }

    public void setCommentsum(Integer commentsum) {
        this.commentsum = commentsum;
    }

    public Integer getForwardsum() {
        return forwardsum;
    }

    public void setForwardsum(Integer forwardsum) {
        this.forwardsum = forwardsum;
    }

    public Integer getCollectsum() {
        return collectsum;
    }

    public void setCollectsum(Integer collectsum) {
        this.collectsum = collectsum;
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIshot() {
        return ishot;
    }

    public void setIshot(Integer ishot) {
        this.ishot = ishot;
    }

    public Integer getIsessence() {
        return isessence;
    }

    public void setIsessence(Integer isessence) {
        this.isessence = isessence;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getCoverimg() {
        return coverimg;
    }

    public void setCoverimg(String coverimg) {
        this.coverimg = coverimg == null ? null : coverimg.trim();
    }

    public String getHotimgurl() {
        return hotimgurl;
    }

    public void setHotimgurl(String hotimgurl) {
        this.hotimgurl = hotimgurl == null ? null : hotimgurl.trim();
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Integer getTotalpoint() {
        return totalpoint;
    }

    public void setTotalpoint(Integer totalpoint) {
        this.totalpoint = totalpoint;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Integer getIsessencepool() {
        return isessencepool;
    }

    public void setIsessencepool(Integer isessencepool) {
        this.isessencepool = isessencepool;
    }

    public Integer getActivetype() {
        return activetype;
    }

    public void setActivetype(Integer activetype) {
        this.activetype = activetype;
    }

    public Double getActivefee() {
        return activefee;
    }

    public void setActivefee(Double activefee) {
        this.activefee = activefee;
    }

    public Integer getIscontribute() {
        return iscontribute;
    }

    public void setIscontribute(Integer iscontribute) {
        this.iscontribute = iscontribute;
    }

    public Date getEssencedate() {
        return essencedate;
    }

    public void setEssencedate(Date essencedate) {
        this.essencedate = essencedate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getOprtime() {
        return oprtime;
    }

    public void setOprtime(Date oprtime) {
        this.oprtime = oprtime;
    }

    public Integer getHeatValue() {
        return heatValue;
    }

    public void setHeatValue(Integer heatValue) {
        this.heatValue = heatValue;
    }

    public Integer getPartsumEnddays() {
        return partsumEnddays;
    }

    public void setPartsumEnddays(Integer partsumEnddays) {
        this.partsumEnddays = partsumEnddays;
    }

    public Integer getActiveid() {
        return activeid;
    }

    public void setActiveid(Integer activeid) {
        this.activeid = activeid;
    }

    public Integer getIshotOrder() {
        return ishotOrder;
    }

    public void setIshotOrder(Integer ishotOrder) {
        this.ishotOrder = ishotOrder;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getIsheatoperate() {
        return isheatoperate;
    }

    public void setIsheatoperate(Integer isheatoperate) {
        this.isheatoperate = isheatoperate;
    }

    public Integer getCountview() {
        return countview;
    }

    public void setCountview(Integer countview) {
        this.countview = countview;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getPostcontent() {
        return postcontent;
    }

    public void setPostcontent(String postcontent) {
        this.postcontent = postcontent == null ? null : postcontent.trim();
    }
}