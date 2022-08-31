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
  如果你使用的IDEA自己的构建系统IntelliJ，直接修改项目/模块 的语言级别为X-实验性功能应该就行了。  
  不过本项目我出于习惯使用了Maven，但目前好像通过修改pom的方式开启Java预览特性还比较麻烦，个人不建议折腾。  
  🚧也正是因为这次原因，目前考虑将整个项目的构建系统由Maven转为IDEA自带的构建系统IntelliJ🚧

------------------------------------------------------

### 如果你坚持要(在Maven构建的项目中)开启JDK的预览特性,这是我走过的一些弯路:

本项目的构建系统是Maven，所以我希望可以通过修改pom.xml文件来解决这个问题。
首先我参考了[这篇文章](https://blog.csdn.net/chy555chy/article/details/108585027)，更新了我的pom配置后没有用。  
然后继续查找了很多篇文章，进行了多次尝试，最后还是没有成功。  
这里仅分享一篇还算有用的[StackOverflow帖子](https://stackoverflow.com/questions/52232681/compile-and-execute-a-jdk-preview-feature-with-maven)
，在最新的一个回答中，应该只需要一行配置代码就可以开启JDK的预览特性了，但试了一下没有用。  
也许在以后的更新后，将这个参数添加到Maven的编译器插件中就可以了，但目前(2022-8月)好像IDEA还没有适配。

```xml

<plugin>
  <artifactId>maven-compiler-plugin</artifactId>
  <version>3.10.1</version> <!-- 最低要这个版本才支持 -->
  <configuration>
    <enablePreview>true</enablePreview>
  </configuration>
</plugin>
```

最后我放弃通过maven的插件方法来解决这个问题，并找到了通过修改IDEA中java编译器和vm参数的方式开启预览特性的方法。[文章链接🔗](https://foojay.io/today/how-to-run-project-loom-from-intellij-idea/)  
本质上就是添加--enable-preview这个参数到javac和java后。  

