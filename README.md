# springboot-dubbo
利用SpringBoot做微服务，Dubbo做RPC框架，搭建Web应用

- 2018.02.03 更新记录（第二次）

**重点参考了开源项目：https://gitee.com/didispace/SpringBoot-Learning 在此特别致谢！！**

> 1. 开启aop切面对请求日志做统一处理
> 2. 添加自定义banner

- 2018.02.03 更新记录

**重点参考了博客：http://blog.csdn.net/winter_chen001/article/details/77249029  在此特别致谢！！**

> 1. 测试Swagger2支持，简化方便接口编写
> 2. 测试统一的异常处理类GlobalExceptionHandler和MyException，
> 分别对错误请求和json请求做统一的错误处理
> 3. 测试dev/test/prod三个不同的环境配置文件
> 4. 测试定时任务支持
> 5. 测试异步调用
> 6. 测试mybatis依赖


## 本工程旨在构造一套通用的微服务，以解决工程开发中常用的功能，避免重复劳动
> 目前想到的有：
1. 缓存(redis)——未实现
2. 队列(rabbitmq)——未实现
3. 定时任务——未实现
4. 文件上传(fastDFS)——未实现
5. excel导出(POI)——未实现
6. 权限控制(shiro)——未实现
7. 邮件服务——未实现
8. 搜索服务——未实现
