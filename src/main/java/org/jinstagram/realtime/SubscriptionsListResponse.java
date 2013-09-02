package org.jinstagram.realtime;

import java.util.List;

import org.jinstagram.entity.common.Meta;

import com.google.gson.annotations.SerializedName;

public class SubscriptionsListResponse {

    @SerializedName("meta")
    private Meta meta;

    @SerializedName("data")
    private List<SubscriptionResponseData> data;

    /**
     * @return the meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * @param meta the meta to set
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * @return the data
     */
    public List<SubscriptionResponseData> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(List<SubscriptionResponseData> data) {
        this.data = data;
    }

}
