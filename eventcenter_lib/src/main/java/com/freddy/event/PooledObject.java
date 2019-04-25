package com.freddy.event;

/**
 * <p>@ProjectName:     CEventCenter</p>
 * <p>@ClassName:       PooledObject.java</p>
 * <p>@PackageName:     com.freddy.event</p>
 * <b>
 * <p>@Description:     对象池中的对象要求实现PooledObject接口</p>
 * </b>
 * <p>@author:          FreddyChen</p>
 * <p>@date:            2019/04/25 16:59</p>
 * <p>@email:           chenshichao@outlook.com</p>
 */
public interface PooledObject {

    /**
     * 恢复到默认状态
     */
    void reset();
}
