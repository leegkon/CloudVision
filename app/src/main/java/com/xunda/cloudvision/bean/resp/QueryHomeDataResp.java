package com.xunda.cloudvision.bean.resp;

import com.xunda.cloudvision.bean.AdvertiseBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询广告机信息接口返回数据实体类
 * Created by yinglovezhuzhu@gmail.com on 2016/10/11.
 */

public class QueryHomeDataResp extends BaseResp {

    private List<AdvertiseBean> advertise = new ArrayList<>();

    public List<AdvertiseBean> getAdvertise() {
        return advertise;
    }

    @Override
    public String toString() {
        return "QueryHomeDataResp{" +
                "advertise=" + advertise +
                "} " + super.toString();
    }
}