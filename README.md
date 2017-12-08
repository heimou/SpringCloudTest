# SpringCloudTest
Spring Cloud Test 
1 本地运行需更改HOSTS 文件 C:\Windows\System32\drivers\etc
   增加
      127.0.0.1 eurekapeer1
      127.0.0.1 gateway
      127.0.0.1 webclient
      127.0.0.1 config
2  采用Spring cloud config 分布式集中配置 所有配置文件均在github
    客户端在bootstrap.yml 中获取配置 
3  