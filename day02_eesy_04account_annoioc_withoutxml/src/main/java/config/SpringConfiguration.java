package config;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/10/23
 * @time: 9:10
 * @description:
 */

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 * 该类是一个配置类,它的作用和bean.xml是一样的
 * spring中的新注解
 * 		@Configuration
 * 			作用: 指定当前类是一个配置类
 * 			细节: 当配置类作为AnnotationConfigApplicationContext对象创建的参数时,该注解可以不写
 * 		@ComponentScan
 * 			作用:用于通过注解指定spring在创建容器时要扫描的包
 * 			属性:
 * 				value: 它和basePackages的作用是一样的,都是用于指定创建容器时要扫描的包
 * 					   我们使用此注解就等同于在xml中配置了:
 * 					   <!-- 告知spring在创建容器时要创建的包 -->
 * 					   <context:component-scan base-package="com.itcast"></context:component-scan>
 * 		@Bean
 * 			作用:用于的当前方法的返回值作为bean对象存入spring的ioc容器中
 * 			属性:
 * 				name:用于指定bean的id,默认值是当前方法名
 * 			细节:
 * 				当我们使用注解配置方法时,如果方法有参数,spring框架会去容器中查找有没有可用的bean对象
 * 				查找的方式和Autowired注解的作用一样
 * 		@Import
 * 			作用:用于导入其他的配置类
 * 			属性:
 * 				value: 用于指定其他配置类的字节码
 * 					   当我们使用Import的注解之后,有Import注解的类就是父配置类,导入的是子配置类
 * 		@PropertySource
 * 			作用: 用于指定properties文件的位置
 * 			属性:
 * 				value: 指定文件的名称和路径
 * 						关键字: classpath,表示类路径下
 */
//@Configuration
@ComponentScan("com.itcast")
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {

}
