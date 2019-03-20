# Note: jInstagram will no longer be supporting the new Instagram Graph API. Please use RestFB library to interact with the new Graph API (https://restfb.com/) 


# jInstagram [![Build Status](https://travis-ci.org/sachin-handiekar/jInstagram.svg)](https://travis-ci.org/sachin-handiekar/jInstagram) [![Maven Central](https://img.shields.io/maven-central/v/com.sachinhandiekar/jInstagram.svg)](https://img.shields.io/maven-central/v/com.sachinhandiekar/jInstagram.svg) [![javaDoc](https://javadoc-emblem.rhcloud.com/doc/com.sachinhandiekar/jInstagram/badge.svg?subject=javaDoc&prefix=v)](http://www.javadoc.io/doc/com.sachinhandiekar/jInstagram) [![Coverage Status](https://coveralls.io/repos/sachin-handiekar/jInstagram/badge.svg?branch=master&service=github)](https://coveralls.io/github/sachin-handiekar/jInstagram?branch=master) [![Coverity Scan Build Status](https://scan.coverity.com/projects/7231/badge.svg?flat=1)](https://scan.coverity.com/projects/sachin-handiekar-jinstagram) [![Join the chat at https://gitter.im/sachin-handiekar/jInstagram](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/sachin-handiekar/jInstagram?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

A java library for the Instagram API.

## <a name="toc">Table of Contents</a>
* [Introduction](#introduction)
* [How to Use](#how-to-use)
* [Instagram Endpoints](#instagram-endpoints)
* [Instagram Realtime](#instagram-realtime)
* [Code Examples](#code-examples)
* [Development](#development)
* [Projects using jInstagram](#projects-using-jinstagram)
* [License](#license)
 
## <a name="introduction">Introduction</a> [&#8593;](#toc)
An unofficial Java library for the [Instagram API](http://instagram.com/developer/).

Note : jInstagram uses code from the [scribe-java](https://github.com/fernandezpablo85/scribe-java) library developed by [Pablo Fernandez](https://github.com/fernandezpablo85). 



## <a name="how-to-use">How to Use</a> [&#8593;](#toc)

* Maven Integration

If you're using Maven in your project, then you can integrate jInstagram by adding the following dependency in your pom.xml
	
```xml
<dependency>
   <groupId>com.sachinhandiekar</groupId>
   <artifactId>jInstagram</artifactId>
   <version>1.2.2</version>
</dependency>
```

If you prefer using the latest snapshot build, include the following lines to your pom.xml.
	
```xml
    <repositories>
        <repository>
            <id>oss.snapshots</id>
            <name>OSS Sonatype Snapshot Repository</name>
            <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
            <releases>
                <enabled>false</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>com.sachinhandiekar</groupId>
            <artifactId>jInstagram</artifactId>
             <version>1.2.3-SNAPSHOT</version>
        </dependency>
    </dependencies>
```
        
    
You can also integrate jInstagram by adding the following jar files in your project - 

* [jInstagram-1.2.2.jar](http://central.maven.org/maven2/com/sachinhandiekar/jInstagram/1.2.2/jInstagram-1.2.2.jar)
* [GSON](http://central.maven.org/maven2/com/google/code/gson/gson/2.2.2/gson-2.2.2.jar), [commons-lang3](http://central.maven.org/maven2/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar), [commons-codec](http://central.maven.org/maven2/commons-codec/commons-codec/1.8/commons-codec-1.8.jar), [jUnit](http://central.maven.org/maven2/junit/junit/4.11/junit-4.11.jar), [mockito](http://central.maven.org/maven2/org/mockito/mockito-all/1.8.4/mockito-all-1.8.4.jar), [slf4j-api](http://central.maven.org/maven2/org/slf4j/slf4j-api/1.7.5/slf4j-api-1.7.5.jar)


## <a name="instagram-endpoints">Instagram Endpoints</a> [&#8593;](#toc)

Please see the [API Usage](https://github.com/sachin-handiekar/jInstagram/wiki/jInstagram-Usage) for more details.

## <a name="instagram-realtime">Instagram Realtime</a> [&#8593;](#toc)

Please see the [Realtime API Usage](https://github.com/sachin-handiekar/jInstagram/wiki/Instagram-Realtime-API) for more details.

  

## <a name="code-examples">Code Examples</a> [&#8593;](#toc)

Please see the sample project to see a working example of [jInstagram integration](https://github.com/sachin-handiekar/jInstagram-examples).


## <a name="development">Development</a> [&#8593;](#toc)

Please see the [development guide](https://github.com/sachin-handiekar/jInstagram/wiki/Development-Guide).

## <a name="projects-using-jinstagram">Projects using jInstagram</a> [&#8593;](#toc)

Please see the [wiki link](https://github.com/sachin-handiekar/jInstagram/wiki/Projects-using-jInstagram) for a list of projects using [jInstagram](https://github.com/sachin-handiekar/jInstagram).

## <a name="license">License</a> [&#8593;](#toc)

Please check the [license](https://github.com/sachin-handiekar/jInstagram/blob/master/LICENSE.txt) file.
