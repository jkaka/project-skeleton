#1.0.1-SNAPSHOT版本修改点
## 日志格式
1. 日志输出路径调整
    > 原始：${user.dir}/logs/ota.%d{yyyy-MM-ddHH}.log
    
    > 现在：${LOG_PATH}ota/logs/info.ota.%d{yyyy-MM-ddHH}.log
    
    > 原因：根据运维指定的标准输出路径：/app/logs/项目名/xxx.log
2. 日志输出格式调整
    > 原始：%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level [%c] [%L] -> - [%msg]%n
    
    > 现在：%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level [%c] [%L] -> traceId:[%X{traceId}]- [%msg]%n
    
    > 原因：日志加上traceId输出，方便定位问题。


##dockfile
取消在容器内编译、打包操作，这样构建会非常慢；现灵雀云已支持无需在docker内重新打包操作。

##基础类调整
* 删除服务自身的LogUtil.java，引用了common包中的LogUtil.java
* 增加ServerPortConfig.java动态设置服务的端口号的配置类
* APPConfig重命名为AppProperties，与Apollo的application.properties相对应。

##apidoc
在boot模块增加了apidoc.json、docheader.md两个文件，根据服务的不同需对docheader做出相应调整，然后直接使用命令生成对应api文档。

##包结构调整
* 基础包命名，由原来的groupId+功能名，修改为groupId+模块名+功能名
    > 如：biz模块中的com.xx.ota.service    修改为   com.xx.ota.biz.servie
    
    > 原因：在biz模块中有一个类com.xx.ota.aspect.Operation.java、boot模块中也有一个com.xx.ota.aspect.Operation.java，此时再boot中就不能引用到biz的Operation.java。
* boot模块中的config包重命名为beanconfig，用于存放@Configuration配置类。
* config模块中的子包，重命名为properties用于存放配置属性类。
* 新增了一些常用的空包，如：biz模块的dataobject、manager、mapper；common模块的enums、constants等。

###使用命令
mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=com.kaka.template -DarchetypeVersion=1.0.0-SNAPSHOT -DarchetypeArtifactId=project-skeleton -DgroupId=com.kaka.template -DartifactId=project-template -Dversion=0.1-SNAPSHOT -DappName=pro-template