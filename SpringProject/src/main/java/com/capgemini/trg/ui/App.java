package com.capgemini.trg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.trg.model.CurrencyConvertor;
import com.capgemini.trg.model.HelloWorld;

public class App 
{
    public static void main( String[] args )
    {
    	/* @SuppressWarning("deprecation")
        XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
   HelloWorld object=(HelloWorld) beanFactory.getBean("helloWorldBean");
   System.out.println(object.getMessage());
    */
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	HelloWorld object=(HelloWorld)context.getBean("helloWorldBean");
    	  System.out.println(object.getMessage());
    	  CurrencyConvertor convertor1=(CurrencyConvertor) context.getBean("convertorBean1");
    	  System.out.println("$100=Rs."+convertor1.dollarsToRupee(100.0));
    	  CurrencyConvertor convertor2=(CurrencyConvertor) context.getBean("convertorBean2");
    	  System.out.println("$100=Rs."+convertor2.dollarsToRupee(100.0));
    	  ((AbstractApplicationContext)context).registerShutdownHook();
    }
}
