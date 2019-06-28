package com.lxt.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.time.LocalDate;

public class BeanFactoryTest {

    @Test
    public void testSimpleLoad(){
        XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        BeanFactory bf2 = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
        MyTestBean myTestBean = (MyTestBean)bf.getBean("myTestBean");
        LocalDate localDate = LocalDate.now().minusMonths(1).minusMonths(1);
        LocalDate startDate = LocalDate.now().minusMonths(1).minusDays(31);
        LocalDate endDate = LocalDate.now().minusDays(1);
        System.out.println(localDate+"=="+startDate);
    }

}
