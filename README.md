## Thread常用方法

- 来自慕课网 深入浅出多线程

|类别|方法签名|简介|
|:---------|:---------|:---------|
|线程的创建|`Thread()`||
|↑|`Thread(String name)`||
|↑|`Thread(Runnable target)`||
|↑|`Thread(Runnable target, String name)`||
|线程的方法|`void start()`|启动线程|
|↑|`static void sleep(long millis)`|线程休眠|
|↑|`static void sleep(long millis, int nanos)`|↑|
|↑|`void join()`|使其他线程等待当前线程终止|
|↑|`void join(long millis)`|↑|
|↑|`void join(long millis, int nanos)`|↑|
|↑|`static void yield()`|当前运行线程释放处理器资源|
|获取线程引用|`static Thread currentThread()`|返回当前运行的线程引用|

##### 线程**不正确**的停止方式
`stop()`方法会让线程戛然而止,从而让人分不清哪些工作完成了,哪些工作没有完成,所以不要使用该方法。
官方已经不建议使用。
`interrupt()`
##### 线程**正确**的停止方式
使用退出标志,如: `volatile boolean keepRunning = true`

##### 争用条件 Race Condition
当多个线程同时共享访问同一数据(内存区域)时， 每个线程都尝试操作该数据，从而导致数据被破坏，
这种现象称为争用条件

##### 线程交互:互斥与同步
互斥：同一时间只能有一条线程对临界区进行操作
同步：线程之间的通信机制


