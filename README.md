# SpringCloud

## create project
主项目是pom
spring-cloud-dependencies中的version的区别
其他是jar

allst-wfw-api是与数据库ORM映射的模块

allst-wfw-consumer是消费模块

allst-wfw-provider是服务提供模块

## 项目搭建

### 🍎 网关搭建
模块名： allst-wfw-gateway

### 🍎 前台搭建
模块名： allst-wfw-front

### 🍎 后台搭建
模块名： allst-wfw-back

### 🍎 广告模块
模块名： allst-wfw-ad

### 🍎 注册中心
模块名： allst-wfw-eureka

### 🍎 配置中心
模块名： allst-wfw-config

### 🍎 公共模块
模块名： allst-wfw-common
```text
该模块主要用于存放项目的工具类
1、属性拷贝工具类：ConverUtil
2、

将当前模块安装到本地仓库：maven install, 方便后续其他模块引用
```

### 🍎 其他模块
模块名： allst-wfw-bom
```text
该模块主要用于项目的依赖管理，因此该模块的打包方式为pom
添加SpringBoot、SpringCloud相关依赖

```

 
 