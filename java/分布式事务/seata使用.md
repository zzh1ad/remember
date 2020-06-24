## seata框架使用

官网:https://seata.io/zh-cn/

### AT模式

可以保证强一致
![](./image/seata流程1.png)
![](./image/seata流程2.png)

### 注意事项

1.1.0版本后配置文件改为驼峰格式。

seata.tx-serivce-group 这个配置要和 file.config内容一致

事务回滚失败产生脏数据需要手动清理undo表
