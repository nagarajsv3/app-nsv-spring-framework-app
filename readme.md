Spring Framework - Dependency Injection / Dependency Inversion / Inversion of control

Dependency Injection in 2 ways
1. Setter Based : Setter method is used to set the dependency on the created object
    <bean class="com.nsv.jsmbaba.xmlapproach.Circle" id="circle" />
    <!--setter based dependency injection-->
    <bean class="com.nsv.jsmbaba.xmlapproach.ShapeCreator" id="shapeCreator">
        <property name="shape" ref="circle"/>
    </bean>

2. Constructor Based : Constructor is used to set the dependency while creating the object
    <!--constructor based dependency injection-->
    <bean class="com.nsv.jsmbaba.xmlapproach.ShapeCreator" id="shapeCreator">
        <constructor-arg name="shape" ref="circle" />
    </bean>

Create application-context.xml under main/resources
Create all the required bean
    <bean class="com.nsv.jsmbaba.xmlapproach.Circle" id="circle" />
    <!--setter based dependency injection-->
    <bean class="com.nsv.jsmbaba.xmlapproach.ShapeCreator" id="shapeCreator">
        <property name="shape" ref="circle"/>
    </bean>
    <!--constructor based dependency injection-->
    <bean class="com.nsv.jsmbaba.xmlapproach.ShapeCreator" id="shapeCreator">
        <constructor-arg name="shape" ref="circle" />
    </bean>