#jInstagram [![Build Status](https://travis-ci.org/sachin-handiekar/jInstagram.svg)](https://travis-ci.org/sachin-handiekar/jInstagram)
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
* [Donation](#donation)
 
## <a name="introduction">Introduction</a> [&#8593;](#toc)
An unofficial Java library for the [Instagram API](http://instagram.com/developer/).

Note : jInstagram uses code from the [scribe-java] (https://github.com/fernandezpablo85/scribe-java) library developed by [Pablo Fernandez] (https://github.com/fernandezpablo85). 



## <a name="how-to-use">How to Use</a> [&#8593;](#toc)

* Maven Integration

If you're using Maven in your project, then you can integrate jInstagram by adding the following dependency in your pom.xml
	
```xml
<dependency>
   <groupId>com.sachinhandiekar</groupId>
   <artifactId>jInstagram</artifactId>
   <version>1.0.10</version>
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
             <version>1.1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
```
        
    
You can also integrate jInstagram by adding the following jar files in your project - 

* [jInstagram-1.0.10.jar](http://central.maven.org/maven2/com/sachinhandiekar/jInstagram/1.0.10/jInstagram-1.0.10.jar)
* [GSON](http://central.maven.org/maven2/com/google/code/gson/gson/2.2.2/gson-2.2.2.jar), [commons-lang3](http://central.maven.org/maven2/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar), [commons-codec](http://central.maven.org/maven2/commons-codec/commons-codec/1.8/commons-codec-1.8.jar), [jUnit](http://central.maven.org/maven2/junit/junit/4.11/junit-4.11.jar), [mockito](http://central.maven.org/maven2/org/mockito/mockito-all/1.8.4/mockito-all-1.8.4.jar) 


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

	jInstagram is licensed under the MIT License.

	Copyright (C) 2011 by Sachin Handiekar

	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in
	all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
	THE SOFTWARE.

## <a name="donation">Donation</a> [&#8593;](#toc)

jInstagram is an open-source software and free of charge. You can use jInstagram freely for any commercial and non-commercial projects.

If you feel jInstagram makes your life easier, please do consider making a donation!

<a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=WRFVX23N4TUQN"><img src="https://www.paypalobjects.com/en_GB/i/btn/btn_donate_SM.gif" /></a>
