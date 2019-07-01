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
        
Reading property files using PropertyPlaceholderConfigurer
    <bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
        <!--Reading from a single property file-->
        <!--<property name="location" value="classpath:application.properties"/>-->

        <!--reading from multple property files-->
        <property name="locations">
            <list>
                <value>classpath:application.properties</value>
                <value>classpath:connection.properties</value>
            </list>
        </property>
    </bean>
    
    <bean class="com.nsv.jsmbaba.readingpropertyfile.Author" id="author">
        <property name="title" value="${title}" />
        <property name="connectionUrl" value="${connection.url}" />
    </bean>
    

Defining Constants
    <!--constants-->
    <util:constant static-field="com.nsv.jsmbaba.constantsdatastructures.Company.COMPANY_NAME" id="companyName" />

Defining DataStructures
    <!--datastructures-->
    <util:list id="availableLocations">
        <value>NJ</value>
        <value>TX</value>
    </util:list>

    <util:map id="availableLocationsMap">
        <entry key="NJ" value="New Jersey"/>
        <entry key="TX" value="Texas"/>
    </util:map>

    <alias name="employee" alias="emp"/>

        
        