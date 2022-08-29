### Construction 🚧
## 介绍
这是我自己在学习各版本JDK中新特性的代码存档  
同时分享我整理在Notion上的笔记  
[JDK8](https://seasidetown.notion.site/JDK8-ce3b068baeac460ea54162483826bf6b)  
[JDK9](https://seasidetown.notion.site/JDK9-e39ce52b2c1b41198c302f95a543f822)  
[JDK10](https://seasidetown.notion.site/JDK10-1f7b4cbca315423b8bdcce7101324f94)  
[JDK11](https://seasidetown.notion.site/JDK11-f66d855061534e3584c2384feb5dee0f)  
[JDK12](https://seasidetown.notion.site/JDK12-9ae7ccedafd748ce8195fd882cf1c4aa)  
[JDK13]()  
[JDK14]()  
[JDK15]()

## tips

推荐使用IDEA运行,你可能需要在项目结构中为每一个模块设定单独地依赖并将语言级别为不同的JDK版本

JDK12和13中的Switch表达式为预览版本的特性，直到JDK14后才正式支持  
~~可以在IDEA中设置模块的语言级别为14来避免编译报错~~   
所以JDK12和13模块中的相关代码无法通过编译除非将依赖源设置为JDK14+  
或者:启动Java预览特性，参考[文章](https://blog.csdn.net/chy555chy/article/details/108585027)

另外IDEA可能将JDK9版本的相关模块辨别为Kotlin模块，这样可能会导致编译异常  
解决方法之一是在构建菜单中点击 重新构建项目
参考于[这里](https://stackoverflow.com/questions/53497454/intellij-idea-ultimate-2018-3-thinks-my-java-9-project-is-a-kotlin-project)