package com.coolweather.android.db;
import org.litepal.crud.DataSupport;
/**
 * Created by 恒 on 2019-01-01.
 */
//compile 'com.github.bumptech.glide:glide:3.7,0'
public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getProvinceName(String provinceName){
        return provinceName;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
