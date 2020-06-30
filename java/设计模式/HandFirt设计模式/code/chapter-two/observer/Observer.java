package observer;

/**
 * 订阅者
 */
public interface Observer{

    /**
     * 更新消息
     */
    void update(float temp, float humidity, float pressure);
}