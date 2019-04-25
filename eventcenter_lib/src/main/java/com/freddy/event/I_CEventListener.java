package com.freddy.event;

/**
 * <p>@ProjectName:     CEventCenter</p>
 * <p>@ClassName:       I_CEventListener.java</p>
 * <p>@PackageName:     com.freddy.event</p>
 * <b>
 * <p>@Description:     事件监听器</p>
 * </b>
 * <p>@author:          FreddyChen</p>
 * <p>@date:            2019/04/25 17:52</p>
 * <p>@email:           chenshichao@outlook.com</p>
 */
public interface I_CEventListener {

    /**
     * 事件回调函数
     * <b>注意：</b><br />
     * 如果 obj 使用了对象池，<br />
     * 那么事件完成后，obj即自动回收到对象池，请不要再其它线程继续使用，否则可能会导致数据不正常
     * @param topic
     * @param msgCode
     * @param resultCode
     * @param obj
     */
    void onCEvent(String topic, int msgCode, int resultCode, Object obj);
}
