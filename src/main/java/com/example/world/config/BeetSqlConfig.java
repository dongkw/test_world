package com.example.world.config;

import java.io.IOException;
import javax.sql.DataSource;
import lombok.Data;
import org.beetl.core.resource.WebAppResourceLoader;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.beetl.sql.core.ClasspathLoader;
import org.beetl.sql.core.DefaultNameConversion;
import org.beetl.sql.core.Interceptor;
import org.beetl.sql.core.UnderlinedNameConversion;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;
import org.beetl.sql.ext.spring4.BeetlSqlDataSource;
import org.beetl.sql.ext.spring4.BeetlSqlScannerConfigurer;
import org.beetl.sql.ext.spring4.SqlManagerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/7/25 下午5:47
 */
@Configuration
@Data
public class BeetSqlConfig {


  @Bean(initMethod = "init", name = "beetConfig")
  public BeetlGroupUtilConfiguration getBeetGroupUtilConfig() {
    BeetlGroupUtilConfiguration beetlGroupUtilConfiguration = new BeetlGroupUtilConfiguration();
    ResourcePatternResolver patternResolver = ResourcePatternUtils
        .getResourcePatternResolver(new DefaultResourceLoader());
    // WebAppResourceLoader 配置root路径是关键
    WebAppResourceLoader webAppResourceLoader = null;
    try {
      webAppResourceLoader = new WebAppResourceLoader(
          patternResolver.getResource("classpath:/sql").getFile().getPath());
    } catch (IOException e) {
      e.printStackTrace();
    }

//    WebAppResourceLoader webAppResourceLoader = new WebAppResourceLoader();
    beetlGroupUtilConfiguration.setResourceLoader(webAppResourceLoader);

    //读取配置文件信息
    return beetlGroupUtilConfiguration;
  }

  @Bean(name = "beetlViewResolver")
  public BeetlSpringViewResolver getBeetlSpringViewResolver(
      @Qualifier("beetConfig") BeetlGroupUtilConfiguration beetlGroupUtilConfiguration) {
    BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
    beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
    beetlSpringViewResolver.setOrder(0);
    beetlSpringViewResolver.setConfig(beetlGroupUtilConfiguration);
    return beetlSpringViewResolver;
  }

  //=============================以下是beetsql配置=============
  //配置包扫描
  @Bean(name = "beetlSqlScannerConfigurer")
  public BeetlSqlScannerConfigurer getBeetlSqlScannerConfigurer() {
    BeetlSqlScannerConfigurer conf = new BeetlSqlScannerConfigurer();
    conf.setBasePackage("com.example.world.dao");
    conf.setDaoSuffix("Dao");
    conf.setSqlManagerFactoryBeanName("sqlManagerFactoryBean");
    return conf;
  }

  @Bean(name = "sqlManagerFactoryBean")
  @Primary
  public SqlManagerFactoryBean getSqlManagerFactoryBean(
      @Qualifier("datasource") DataSource datasource) {
    SqlManagerFactoryBean factory = new SqlManagerFactoryBean();
    BeetlSqlDataSource source = new BeetlSqlDataSource();
    source.setMasterSource(datasource);
    factory.setCs(source);
    factory.setDbStyle(new MySqlStyle());
    factory.setInterceptors(new Interceptor[]{new DebugInterceptor()});
    //去下划线
    UnderlinedNameConversion nc = new UnderlinedNameConversion();
//    DefaultNameConversion nc=new DefaultNameConversion();
    factory.setNc(nc);
    factory.setSqlLoader(new ClasspathLoader("/sql"));
    //sql文件路径
    return factory;
  }

  //配置数据库
  @Bean(name = "datasource")
  public DataSource getDataSource(Environment env) {
    String url = env.getProperty("spring.datasource.mysql.url");
    String userName = env.getProperty("spring.datasource.mysql.username");
    String password = env.getProperty("spring.datasource.mysql.password");
    return DataSourceBuilder.create().url(url).username(userName).password(password).build();
  }

  //开启事务
  @Bean(name = "transactionManager")
  public DataSourceTransactionManager getDataSourceTransactionManager(
      @Qualifier("datasource") DataSource datasource) {
    DataSourceTransactionManager dsm = new DataSourceTransactionManager();
    dsm.setDataSource(datasource);
    return dsm;
  }
}
