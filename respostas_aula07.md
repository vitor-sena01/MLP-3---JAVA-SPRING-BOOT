RESPOTAS DAS PERGUNTAS DA ATIVIDADE - AULA 07

PERGUNTA 01 - Qual dependência fornece o driver do MySQL, especificamente (não o JDBC genérico)?
R: A dependência que fornece o driver para o MySQL é o connector/J, ele é o driver especifico do MySQL, sendo assim, ele fica junto ao JDBC, fazendo uma paceria que ficaria assim JDBC + Connector/J.

PERGUNTA 02 - Na URL jdbc:mysql://localhost:3306/aula, o que representam, especificamente, localhost, 3306 e aula?

R: localhost - significa que é uma aplicação rodando localmente na maquina na qual você é dono.
3306 - porta de conexão na qual o banco de dados está utilizando. 
aula - respresenta o nome do DATABASE , ou seja, todos os dados dos alunos estarão na tabela de base do banco de dados. 

PERGUNTA 03 - Qual é a função do HikariCP nesse processo? 

R: Ele é o gestor das conexões do banco de dados e também um implementador com pool de reutilizações. 

PERGUNTA 04 - Conectar ao banco com sucesso significa que algum cliente já foi salvo nele? Por quê?
R: Não! Conectar ao banco de dados com sucesso não significa que algum cliente já foi salvo nele. Isso significa que a aplicação conseguiu fazer uma conexão com o banco de dados 


PREVISÃO: 
Antes de mudar qualquer coisa, escreva sua previsão: o que você espera que aconteça quando a aplicação rodar com a senha errada? 
R: Eu espero que aconteça um erro no terminal e eu sou obrigado a resolver esse erro para que o codigo possa rodar perfeitamente.

Que tipo de mensagem você imagina que vai aparecer?
R: a mesagem que deve aparecer possa ser : "error in the application.properties"

EXPLICAÇÃO COM MINHAS PALAVRAS: 
R: A causa do erro ocorreu atraves de uma troca de informação colocada dentro do "application.properties", com isso houve o erro esperado na mensagem abaixo. O erro foi corrigido voltando a sua palavra original e analisando onde tinha ocorrido o erro, nisso voltando tudo ao normal.

Mesagem do erro provocado: 
[INFO] Loaded 24228 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] 
[INFO] --------------------------< com.example:aula >--------------------------
[INFO] Building aula 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot:4.1.1:run (default-cli) > test-compile @ aula >>>
[INFO] 
[INFO] --- resources:3.5.0:resources (default-resources) @ aula ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.15.0:compile (default-compile) @ aula ---
[INFO] Loaded 74 auto-discovered prefixes for remote repository apache.snapshots (prefixes-apache.snapshots.txt)
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 1 source file with javac [debug parameters release 17] to target\classes
[INFO] 
[INFO] --- resources:3.5.0:testResources (default-testResources) @ aula ---
[INFO] skip non existing resourceDirectory C:\Users\vitor\OneDrive\Documentos\MLP - 2° BIMESTRE\src\test\resources
[INFO] 
[INFO] --- compiler:3.15.0:testCompile (default-testCompile) @ aula ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 1 source file with javac [debug parameters release 17] to target\test-classes
[INFO] 
[INFO] <<< spring-boot:4.1.1:run (default-cli) < test-compile @ aula <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot:4.1.1:run (default-cli) @ aula ---
[INFO] Loaded 50 auto-discovered prefixes for remote repository ow2-snapshot (prefixes-ow2-snapshot.txt)
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.1.1)

2026-10-24T14:53:03.492-03:00  INFO 17016 --- [aula] [           main] com.example.aula.AulaApplication         : Starting AulaApplication using Java 25.0.4.1 with PID 17016 (C:\Users\vitor\OneDrive\Documentos\MLP - 2° BIMESTRE\target\classes started by vitor in C:\Users\vitor\OneDrive\Documentos\MLP - 2° BIMESTRE)
2026-10-24T14:53:03.496-03:00  INFO 17016 --- [aula] [           main] com.example.aula.AulaApplication         : No active profile set, falling back to 1 default profile: "default"
2026-10-24T14:53:03.986-03:00  INFO 17016 --- [aula] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-10-24T14:53:04.022-03:00  INFO 17016 --- [aula] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 19 ms. Found 0 JPA repository interfaces.
2026-10-24T14:53:04.409-03:00  INFO 17016 --- [aula] [           main] org.hibernate.orm.jpa                    : HHH008540: Processing PersistenceUnitInfo [name: default]
2026-10-24T14:53:04.503-03:00  INFO 17016 --- [aula] [           main] org.hibernate.orm.core                   : HHH000001: Hibernate ORM core version 7.4.5.Final
2026-10-24T14:53:05.065-03:00  INFO 17016 --- [aula] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-10-24T14:53:05.106-03:00  INFO 17016 --- [aula] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-10-24T14:53:06.254-03:00  WARN 17016 --- [aula] [           main] org.hibernate.orm.jdbc.error             : HHH000247: ErrorCode: 0, SQLState: 08S01
2026-10-24T14:53:06.255-03:00  WARN 17016 --- [aula] [           main] org.hibernate.orm.jdbc.error             : Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
2026-10-24T14:53:06.258-03:00  WARN 17016 --- [aula] [           main] org.hibernate.orm.jdbc                   : HHH100046: Could not obtain connection to query JDBC database metadata

org.hibernate.exception.JDBCConnectionException: Unable to obtain isolated JDBC connection [Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.] [n/a]
        at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:80) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:34) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:115) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:101) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:51) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:366) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironment(JdbcEnvironmentInitiator.java:143) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:120) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:80) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:133) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:260) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:235) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:212) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.boot.model.relational.Database.<init>(Database.java:44) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:251) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:203) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:180) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1388) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.populateSessionFactoryBuilder(EntityManagerFactoryBuilderImpl.java:1468) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1450) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:93) ~[spring-orm-7.0.9.jar:7.0.9]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:443) ~[spring-orm-7.0.9.jar:7.0.9]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:436) ~[spring-orm-7.0.9.jar:7.0.9]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:411) ~[spring-orm-7.0.9.jar:7.0.9]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:419) ~[spring-orm-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1862) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1811) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:603) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:525) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:333) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:371) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:331) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:201) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:977) ~[spring-context-7.0.9.jar:7.0.9]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:621) ~[spring-context-7.0.9.jar:7.0.9]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:756) ~[spring-boot-4.1.1.jar:4.1.1]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:445) ~[spring-boot-4.1.1.jar:4.1.1]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:321) ~[spring-boot-4.1.1.jar:4.1.1]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1365) ~[spring-boot-4.1.1.jar:4.1.1]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1354) ~[spring-boot-4.1.1.jar:4.1.1]
        at com.example.aula.AulaApplication.main(AulaApplication.java:10) ~[classes/:na]
Caused by: com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
        at com.mysql.cj.jdbc.exceptions.SQLError.createCommunicationsException(SQLError.java:165) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:55) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:840) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:416) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:237) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:180) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:144) ~[HikariCP-7.0.2.jar:na]
        at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:373) ~[HikariCP-7.0.2.jar:na]
        at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:210) ~[HikariCP-7.0.2.jar:na]
        at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:488) ~[HikariCP-7.0.2.jar:na]
        at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:576) ~[HikariCP-7.0.2.jar:na]
        at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:97) ~[HikariCP-7.0.2.jar:na]
        at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:111) ~[HikariCP-7.0.2.jar:na]
        at org.hibernate.engine.jdbc.connections.internal.DataSourceConnectionProvider.getConnection(DataSourceConnectionProvider.java:149) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:508) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:48) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        ... 36 common frames omitted
Caused by: com.mysql.cj.exceptions.CJCommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62) ~[na:na]
        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499) ~[na:na]
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483) ~[na:na]
        at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:52) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:95) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:140) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.exceptions.ExceptionFactory.createCommunicationsException(ExceptionFactory.java:156) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:79) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.NativeSession.connect(NativeSession.java:142) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.jdbc.ConnectionImpl.connectOneTryOnly(ConnectionImpl.java:964) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:828) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        ... 49 common frames omitted
Caused by: java.net.ConnectException: Connection refused: getsockopt
        at java.base/sun.nio.ch.Net.pollConnect(Native Method) ~[na:na]
        at java.base/sun.nio.ch.Net.pollConnectNow(Net.java:639) ~[na:na]
        at java.base/sun.nio.ch.NioSocketImpl.timedFinishConnect(NioSocketImpl.java:543) ~[na:na]
        at java.base/sun.nio.ch.NioSocketImpl.connect(NioSocketImpl.java:594) ~[na:na]
        at java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:284) ~[na:na]
        at java.base/java.net.Socket.connect(Socket.java:659) ~[na:na]
        at com.mysql.cj.protocol.StandardSocketFactory.connect(StandardSocketFactory.java:144) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:53) ~[mysql-connector-j-9.7.0.jar:9.7.0]
        ... 52 common frames omitted

2026-10-24T14:53:06.280-03:00 ERROR 17016 --- [aula] [           main] j.LocalContainerEntityManagerFactoryBean : Failed to initialize JPA EntityManagerFactory: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2026-10-24T14:53:06.288-03:00  WARN 17016 --- [aula] [           main] s.c.a.AnnotationConfigApplicationContext : Exception encountered during context initialization - cancellingrefresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/hibernate/autoconfigure/HibernateJpaConfiguration.class]: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2026-10-24T14:53:06.327-03:00  INFO 17016 --- [aula] [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2026-10-24T14:53:06.365-03:00 ERROR 17016 --- [aula] [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/hibernate/autoconfigure/HibernateJpaConfiguration.class]: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1815) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:603) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:525) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:333) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:371) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:331) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:201) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:977) ~[spring-context-7.0.9.jar:7.0.9]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:621) ~[spring-context-7.0.9.jar:7.0.9]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:756) ~[spring-boot-4.1.1.jar:4.1.1]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:445) ~[spring-boot-4.1.1.jar:4.1.1]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:321) ~[spring-boot-4.1.1.jar:4.1.1]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1365) ~[spring-boot-4.1.1.jar:4.1.1]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1354) ~[spring-boot-4.1.1.jar:4.1.1]
        at com.example.aula.AulaApplication.main(AulaApplication.java:10) ~[classes/:na]
Caused by: org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:273) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:235) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:212) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.boot.model.relational.Database.<init>(Database.java:44) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:251) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:203) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:180) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1388) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.populateSessionFactoryBuilder(EntityManagerFactoryBuilderImpl.java:1468) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1450) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:93) ~[spring-orm-7.0.9.jar:7.0.9]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:443) ~[spring-orm-7.0.9.jar:7.0.9]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:436) ~[spring-orm-7.0.9.jar:7.0.9]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:411) ~[spring-orm-7.0.9.jar:7.0.9]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:419) ~[spring-orm-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1862) ~[spring-beans-7.0.9.jar:7.0.9]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1811) ~[spring-beans-7.0.9.jar:7.0.9]
        ... 14 common frames omitted
Caused by: org.hibernate.HibernateException: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
        at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.determineDialect(DialectFactoryImpl.java:190) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.buildDialect(DialectFactoryImpl.java:86) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentWithDefaults(JdbcEnvironmentInitiator.java:200) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:452) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironment(JdbcEnvironmentInitiator.java:143) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:120) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:80) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:133) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:260) ~[hibernate-core-7.4.5.Final.jar:7.4.5.Final]
        ... 30 common frames omitted

[INFO] ------------------------------------------------------------------------
[ERROR] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  14.840 s
[INFO] Finished at: 2026-10-24T14:53:06-03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.springframework.boot:spring-boot-maven-plugin:4.1.1:run (default-cli) on project aula: Process terminated with exit code: 1 -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException