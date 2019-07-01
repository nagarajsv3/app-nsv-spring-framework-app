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
  
Bean Scopes
1. Singleton - Default
2. Prototype
3. Request
4. Session
5. GlobalSession
    
Autowiring
@Autowired -> Dependency Injection without using Setter/Constructor based D.I

@Autowired Types
byName
byType
constructor
no

@Qualifier() -> To provide a specific bean during dependency injection if there multiple conflicting beans of the same datatype are present


Bean Configuration Types
1. Only XML
2. XML + Annotation
    <context:annotation-config />
    <context:component-scan basepackages="" />
        