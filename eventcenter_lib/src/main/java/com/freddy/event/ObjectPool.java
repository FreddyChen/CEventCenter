package com.freddy.event;

/**
 * <p>@ProjectName:     CEventCenter</p>
 * <p>@ClassName:       ObjectPool.java</p>
 * <p>@PackageName:     com.freddy.event</p>
 * <b>
 * <p>@Description:     自定义的对象池</p>
 * </b>
 * <p>@author:          FreddyChen</p>
 * <p>@date:            2019/04/25 17:30</p>
 * <p>@email:           chenshichao@outlook.com</p>
 */
public abstract class ObjectPool<T extends PooledObject> {

    private T[] mContainer;// 对象容器

    private final Object LOCK = new Object();// 对象锁

    private int length;// 每次返回对象都放到数据末端，length表示前面可用对象数

    public ObjectPool(int capacity) {
        mContainer = createObjPool(capacity);
    }

    /**
     * 创建对象池
     *
     * @param capacity 最大限度容量
     * @return 对象池
     */
    protected abstract T[] createObjPool(int capacity);

    /**
     * 创建一个新的对象
     *
     * @return
     */
    protected abstract T createNewObj();

    /**
     * 从对象池中捞出一个对象，如果池已满，会重新创建一个对象
     *
     * @return
     */
    public final T get() {
        // 先从池中找到空闲的对象，如果没有，则重新创建一个对象
        T obj = findFreeObject();
        if (null == obj) {
            obj = createNewObj();
        } else {
            // 清除对象状态
            obj.reset();
        }

        return obj;
    }

    /**
     * 从池中找到空闲的对象
     *
     * @return
     */
    private T findFreeObject() {
        T obj = null;
        synchronized (LOCK) {
            if (length > 0) {
                --length;
                obj = mContainer[length];
                // 赋值完成后，释放资源
                mContainer[length] = null;
            }
        }

        return obj;
    }

    /**
     * 把对象放回池里面
     *
     * @param obj 需要放回对象池的对象
     */
    public final void returnObj(T obj) {
        synchronized (LOCK) {
            int size = mContainer.length;
            if (length < size) {
                mContainer[length] = obj;
                length++;
            }
        }
    }
}
