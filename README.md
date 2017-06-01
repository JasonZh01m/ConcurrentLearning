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

