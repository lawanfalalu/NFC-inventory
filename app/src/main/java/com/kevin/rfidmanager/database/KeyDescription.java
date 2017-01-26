package com.kevin.rfidmanager.database;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Kevin on 2017/1/25.
 */

@Entity
public class KeyDescription {

    @Id(autoincrement = true)
    private Long id;

    @Index(unique = true)
    private Long rfid;  // id of card and items

    private String keyDescription;  // key description of the item

    @Generated(hash = 790285072)
    public KeyDescription(Long id, Long rfid, String keyDescription) {
        this.id = id;
        this.rfid = rfid;
        this.keyDescription = keyDescription;
    }

    @Generated(hash = 625617026)
    public KeyDescription() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRfid() {
        return this.rfid;
    }

    public void setRfid(Long rfid) {
        this.rfid = rfid;
    }

    public String getKeyDescription() {
        return this.keyDescription;
    }

    public void setKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
    }
}