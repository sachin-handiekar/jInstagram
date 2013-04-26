#jInstagram
[![Build Status](https://travis-ci.org/sachin-handiekar/jInstagram.png)](https://travis-ci.org/sachin-handiekar/jInstagram)

A Java wrapper for the [Instagram API](http://instagram.com/developer/).

Note : jInstagram uses code from the [scribe-java] (https://github.com/fernandezpablo85/scribe-java) library developed by [Pablo Fernandez] (https://github.com/fernandezpablo85). 


##Usage

* Create the InstagramService object

```java
InstagramService service =	new InstagramAuthService()
    							.apiKey("your_client_id")
    							.apiSecret("your_client_secret")
    							.callback("your_callback_url")     
    							.build();
```    							

[With Scope]

Note : Multiple scopes can be provided with a space in between. For ex. ``` .scope("likes comments") ``` Please see [Instagram API](http://instagram.com/developer/authentication/#scope) for more details regarding the supported scopes.

```java
InstagramService service = new InstagramAuthService()
    							.apiKey("your_client_id")
    							.apiSecret("your_client_secret")
    							.callback("your_callback_url") 
    							.scope("comments")
    							.build();
``` 

Note : An empty token can be define as follows -

```java
private static final Token EMPTY_TOKEN = null;
```

* Validate your user against Instagram

```java
String authorizationUrl = service.getAuthorizationUrl(EMPTY_TOKEN);
```

* Getting the Access Token 

```java
Verifier verifier = new Verifier("verifier you get from the user");
Token accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);
 ```
 
* Creating the Instagram Object

```java
Instagram instagram = new Instagram(accessToken);
```
	    
##Instagram API Endpoints 

### Please see the [API Usage](https://github.com/sachin-handiekar/jInstagram/wiki/jInstagram-Usage) for more details.

##Maven
```xml
<dependency>
   <groupId>com.sachinhandiekar</groupId>
   <artifactId>jInstagram</artifactId>
   <version>1.0.2</version>
</dependency>
```

##Dependencies

* Google GSON (http://code.google.com/p/google-gson/)

##About me

* [LinkedIn](http://uk.linkedin.com/in/sachinhandiekar)
* Email   : sachin.handiekar at gmail.com / sach21 at gmail.com
* Twitter : [@sachinhandiekar](http://twitter.com/sachinhandiekar)
