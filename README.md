# java_SpringDependecy
Spring dependecy Injection use and cases
(0)Add JARS or maven plugin to pom.xml
      --SpringBeans
      --Spring Core
      --Spring Context
      --Spring Context Support
      --Spring Expression
(1)#######Create Model/Bean/POJO class of STUDENT and SCHOOL with getter and setter
(2)#######Create Spring BEan Config applicationContext.xml file to reg beans
###___________________________________________________________________________
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<bean id="student" class="com.imagegrafia.model.Student">
<property name="name" value="Ashish"/>
<property name="id" value="100"/>
<property name="school" ref="school"/>    <!---------refering other bean(Student.class) with their id as ref obj --> 
</bean>

<bean id="school" class="com.imagegrafia.model.School">
<property name="name" value="KVS"/>
<property name="address" value="saharsa Bihar"></property>

</bean>
</beans>
####_________________________________________________________________________
(3)######Create ApplicationContext ref in main Method and call the bean object to inject value to corresponding BEANS/POJO class
####____________________________________________________________________
 public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/imagegrafia/cfgs/applicationContext.xml");

       Student std=context.getBean(Student.class);  //Spring will takecare of Object Creation using Property value from xml file
       System.out.println(std);
 
    }
    __________________________________________
