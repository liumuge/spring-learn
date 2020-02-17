package com.itcast.ui;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/10/15
 * @time: 17:35
 * @description:
 */

import com.itcast.dao.AccountDao;
import com.itcast.service.AccountService;
import com.itcast.service.imp.AccountServiceImp;
import com.sun.org.apache.bcel.internal.util.ClassPath;
import java.applet.AppletContext;
import javafx.application.Application;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 模拟表现层,用于调用业务层
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1.获取核心容器对象
		//ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
		ClassPathXmlApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
		//2.根据id获取Bean对象
		AccountService as=(AccountService)ac.getBean("accountService");
		//AccountService as2=(AccountService)ac.getBean("accountService");
//		System.out.println(as);
//
//		AccountDao accountDao = ac.getBean("accountDao", AccountDao.class);
//		System.out.println(accountDao);
		//System.out.println(as==as2);
		as.saveAccount();
		ac.close();

	}
}
