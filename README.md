### Construction 🚧
## 介绍
这是我自己在学习各版本JDK中新特性的代码存档  
同时分享我整理在Notion上的笔记  
[JDK8](https://seasidetown.notion.site/JDK8-ce3b068baeac460ea54162483826bf6b)  
[JDK9](https://seasidetown.notion.site/JDK9-e39ce52b2c1b41198c302f95a543f822)  
[JDK10](https://seasidetown.notion.site/JDK10-1f7b4cbca315423b8bdcce7101324f94)  
[JDK11]()  
[JDK12]()  
[JDK13]()  
[JDK14]()  
[JDK15]()

## tips

推荐使用IDEA运行，如果在clone我的仓库之后.idea下的配置文件能生效是最好的情况     
发现异常的话,你可能需要在项目结构中为每一个模块设定依赖和语言级别为不同的JDK版本

另外IDEA可能将JDK9版本的相关模块辨别为Kotlin模块，这样可能会导致编译异常  
解决方法之一是在构建菜单中点击 重新构建项目
参考于[这里](https://stackoverflow.com/questions/53497454/intellij-idea-ultimate-2018-3-thinks-my-java-9-project-is-a-kotlin-project)