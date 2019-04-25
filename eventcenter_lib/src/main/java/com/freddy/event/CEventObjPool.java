package com.freddy.event;

/**
 * <p>@ProjectName:     CEventCenter</p>
 * <p>@ClassName:       CEventObjPool.java</p>
 * <p>@PackageName:     com.freddy.event</p>
 * <b>
 * <p>@Description:     事件对象池</p>
 * </b>
 * <p>@author:          FreddyChen</p>
 * <p>@date:            2019/04/25 17:45</p>
 * <p>@email:           chenshichao@outlook.com</p>
 */
public class CEventObjPool extends ObjectPool<CEvent> {

    public CEventObjPool(int capacity) {
        super(capacity);
    }

    @Override
    protected CEvent[] createObjPool(int capacity) {
        return new CEvent[capacity];
    }

    @Override
    protected CEvent createNewObj() {
        return new CEvent();
    }
}
