##  Spring Cloud使用的各种示例

- [Spring-Cloud-Eureka](https://github.com/t-hong/SpringCloud-Example/tree/master/Spring-Cloud-Eureka)  Eureka服务注册中心的搭建
  * Eureka 注册中心实例.
      >  1、eureka server
          提供服务注册和发现
        
      >  2、service provider
          服务提供方
          将自身服务注册到Eureka，从而使服务消费方能够找到

      >  3、service consumer
          服务消费方
         从Eureka获取注册服务列表，从而能够消费服务
  * 熔断器Hystrix
      > 在消费端 service consumer 处理,提供熔断时的回调处理

  * Spring Cloud Config 配置中心实例
      * Spring cloud使用git或svn存放配置文件，默认情况下使用git，我们先以git为例做一套示例。
      > 1、config server 
           server提供配置文件的存储、以接口的形式将配置文件的内容提供出去
           
      > 2、config client
           client通过接口获取数据、并依据此数据初始化自己的应用。