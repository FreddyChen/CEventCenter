package com.freddy.event;

/**
 * <p>@ProjectName:     CEventCenter</p>
 * <p>@ClassName:       CEvent.java</p>
 * <p>@PackageName:     com.freddy.event</p>
 * <b>
 * <p>@Description:     事件模型</p>
 * </b>
 * <p>@author:          FreddyChen</p>
 * <p>@date:            2019/04/25 17:24</p>
 * <p>@email:           chenshichao@outlook.com</p>
 */
public class CEvent implements PooledObject {

    private String topic;   // 主题
    private int msgCode;    // 消息类型
    private int resultCode; // 预留参数
    private Object obj;     // 回调返回数据

    public CEvent() {
    }

    public CEvent(String topic, int msgCode, int resultCode, Object obj) {
        this.topic = topic;
        this.msgCode = msgCode;
        this.resultCode = resultCode;
        this.obj = obj;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(int msgCode) {
        this.msgCode = msgCode;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    /**
     * 恢复到默认状态
     */
    @Override
    public void reset() {
        this.topic = null;
        this.msgCode = 0;
        this.resultCode = 0;
        this.obj = null;
    }
}
