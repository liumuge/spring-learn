package com.itcast;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/10/23
 * @time: 10:20
 * @description:
 */

import config.SpringConfiguration;
import javafx.application.Application;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试queryrunner是否是单例
 */
public class QueryRunnerTest {

	@Test
	public void testQueryRunner(){
		//1.获取容器
		ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		//2.获取queryRunner对象
		QueryRunner runner=ac.getBean("runner",QueryRunner.class);
		QueryRunner runner1=ac.getBean("runner",QueryRunner.class);
		System.out.println(runner==runner1);
	}
}
