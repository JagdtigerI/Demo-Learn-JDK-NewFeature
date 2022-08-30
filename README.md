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

+ 推荐使用IDEA,你需要在项目结构中为每一个模块单独地设定依赖与语言级别为不同的JDK版本

+ IDEA可能将JDK9版本的那些模块辨别为Kotlin模块，这会导致编译异常。解决方法之一是在构建菜单中点击***重新构建项目***
  参考于[这里](https://stackoverflow.com/questions/53497454/intellij-idea-ultimate-2018-3-thinks-my-java-9-project-is-a-kotlin-project)

+ 有些模块中的新特性是预览版本(preview)的，而JDK预览版本的特性是默认关闭的，所以一些相关代码无法通过编译。  
  IDEA的提示是将依赖源设置为更新的JDK版本。或者可以放弃运行示例代码，不建议折腾开启JDK的预览特性。

------------------------------------------------------

### 如果你坚持要开启JDK的预览特性,这是我走过的一些弯路(2022-8月):

（我在这上面浪费了将近一个小时，最后也没有一个方便的解决方案）  
本项目的构建系统是Maven，所以我希望可以通过修改pom.xml文件来解决这个问题。
首先我参考了[这篇文章](https://blog.csdn.net/chy555chy/article/details/108585027)，更新了我的pom配置后没有用。  
然后继续查找了很多篇文章，进行了多次尝试，最后还是没有成功。  
这里仅分享一篇还算有用的[StackOverflow帖子](https://stackoverflow.com/questions/52232681/compile-and-execute-a-jdk-preview-feature-with-maven)
，在最新的一个回答中，应该只需要一行配置代码就可以开启JDK的预览特性了，但可能IDEA还没有适配  
最后我放弃通过maven的插件方法来解决这个问题，并找到了通过修改IDEA中java编译器和vm参数的方式开启预览特性的方法。[文章链接🔗](https://foojay.io/today/how-to-run-project-loom-from-intellij-idea/)  
本质上就是添加--enable-preview这个参数到javac和java后。

在idea的[官方文档](https://www.jetbrains.com/idea/guide/tips/turn-on-preview-features/)中，开启最新版本的JDK(目前是19)
的预览特性好像是很方便的，但JB好像没有考虑为老版本的JDK进行同样的配置。
