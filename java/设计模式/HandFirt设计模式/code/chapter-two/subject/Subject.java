package subject;

import observer.Observer;

/**
 * 主题接口
 */
public interface Subject {
    
    /**
     * 注册订阅者
     */
    void registerObserver(Observer o);

    /**
     * 移除订阅者
     */
    void removeObserver(Observer o);

    /**
     * 通知订阅者
     */
    void notifyObservers();
}