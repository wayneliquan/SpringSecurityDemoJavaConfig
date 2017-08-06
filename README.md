# SpringSecurityDemoJavaConfig
Spring Security 入门Demo 使用Java Config配置

运行：`mvn clean jetty:run`

访问： 
  - 需要user用户登入访问： （user, 123）
    `localhost:8000/home`  
  - 需要admin用户登入访问： （admin, 123）
    `localhost:8000/admin`  
  - 不需要登入访问：
    `http://localhost:8000/public/test.css`  
