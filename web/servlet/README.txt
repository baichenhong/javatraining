1. 先介绍一下项目的目录结构，一般的java项目都是有由maven进行管理的
当前项目根目录中的maven.xml文件，这个就是maven的项目管理文件。
src/main/java 这里面放的都是java源代码
src/main/resources 这里面的放的都是各种配置文件
src/main/webapp 如果是web工程，这里一般会放置java web相关的资源文件，比如jsp/js/html/css以及必要的 
注意src/main/webapp下面的WEB-INF目录和web.xml文件，这是一个java web工程必须的


2. servlet介绍
com.github.javatraining.web.servlet.Test1Servlet 这是一个典型的servlet
方法说明：
init    这个是servlet实例被创建时候被调用的
destroy 这个是servlet实例被销毁时候被调用的
service 这个是servlet实例提供服务时候被调用的，一般分为get/post/delete/put等http请求
doGet   这个是servlet实例接收到http get请求时候被调用的
doPost  这个是servlet实例接收到http post请求时候被调用的

当你创建servlet的时候，需要在web.xml中对他进行配置后，这个servlet才能工作，打开web.xml，可以看到下面这部分是和Test1Servlet相关的，
servlet是servlet定义标签，主要有servlet name和class name
servlet-mapping是用来定义servlet的url 映射，servlet name和上面的servlet name对应，url-pattern定义的就是访问的url

比如当前项目的servlet，访问url就是http://localhost:8080/servlet/test1

  <servlet>
  	<servlet-name>Test1Servlet</servlet-name>
  	<display-name>Test1Servlet</display-name>
  	<description></description>
  	<servlet-class>com.github.javatraining.web.servlet.Test1Servlet</servlet-class>
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>Test1Servlet</servlet-name>
  	<url-pattern>/test1</url-pattern>
  </servlet-mapping>

3. 项目访问介绍
当前项目部署web路径为 http://localhost:8080/servlet
所以当前index.jsp的访问路径就是 http://localhost:8080/servlet/index.jsp
   当前servlet的访问路径就是   http://localhost:8080/servlet/test1
   
在index.jsp中有一个a标记，这个指向链接就是test1，点击下这个链接 就会向服务器发情一个http get请求

有一组form标记，这个form指向的action就是test1，method是post，点击submit按钮，就会向服务器发情一个http post请求

servlet中都有每个方法都有log输入，你可以从控制台中看到相应的log输出，来判断程序是如何执行的
