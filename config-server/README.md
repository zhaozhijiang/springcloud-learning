### Spring Cloud Config 简介
>Spring Cloud Config 分为服务端和客户端两个部分。服务端被称为分布式配置中心，它是个独立的应用，可以从配置仓库获取配置信息并提供给客户端使用。客户端可以通过配置中心来获取配置信息，在启动时加载配置。Spring Cloud Config 的配置中心默认采用Git来存储配置信息，所以天然就支持配置信息的版本管理，并且可以使用Git客户端来方便地管理和访问配置信息。

### 通过config-server获取配置信息
>这里我们通过config-server来演示下如何获取配置信息。

### 获取配置文件信息的访问格式
```shell
# 获取配置信息
/{label}/{application}-{profile}
# 获取配置文件信息
/{label}/{application}-{profile}.yml
```
### 占位符相关解释
- application：代表应用名称，默认为配置文件中的spring.application.name，如果配置了spring.cloud.config.name，则为该名称；
- label：代表分支名称，对应配置文件中的spring.cloud.config.label；
- profile：代表环境名称，对应配置文件中的spring.cloud.config.profile。
### 使用到的模块
```xml
springcloud-learning
├── eureka-server -- eureka注册中心
├── config-server -- 配置中心服务
├── config-security-server -- 带安全认证的配置中心服务
└── config-client -- 获取配置的客户端服务
```

