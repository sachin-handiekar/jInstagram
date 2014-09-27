#jInstagram [![Build Status](https://travis-ci.org/sachin-handiekar/jInstagram.svg)](https://travis-ci.org/sachin-handiekar/jInstagram)

<a href="http://flattr.com/thing/846144/sachin-handiekarjInstagram-on-GitHub" target="_blank"><img src="http://api.flattr.com/button/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0" /></a>

An unofficial Java library for the [Instagram API](http://instagram.com/developer/).

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

__[With Scope]__

Note : Multiple scopes can be provided with a space in between. For ex. ``` .scope("likes comments") ``` Please see [Instagram API](http://instagram.com/developer/authentication/#scope) for more details regarding the supported scopes.

__Commenting access__ - You need to register your clientId and Application Name on [http://bit.ly/instacomments](http://bit.ly/instacomments), to get access to commenting.

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

* Or Creating the Instagram Object with enforce signed header (Note: Enforce signed header of the APP settings should be checked)

```java
// 1. your_client_secret: do not use accessToken.getSecret(), it may be null.
// 2. your IPs: comma-separated list of one or more IPs.
//    You can use the 127.0.0.1 loopback address during testing.
Instagram instagram = new Instagram(accessToken.getToken(), "your_client_secret", "your_IPs");
```

###Sample Projects
* Basic Web Application [Source](https://github.com/sachin-handiekar/jInstagram-examples) | [Demo](http://jinstagram-sachinhandiekar.rhcloud.com/BasicWebDemo/) - A basic web application demonstrating the use of jInstagram API.
	    
##Instagram API Endpoints 

Please see the [API Usage](https://github.com/sachin-handiekar/jInstagram/wiki/jInstagram-Usage) for more details.

##Instagram Embedding Endpoints

```java
InstagramOembed oembed = new InstagramOembed();
OembedInformation info = oembed.getOembedInformation("http://instagram.com/p/BUG/");
```

##Maven
```xml
<dependency>
   <groupId>com.sachinhandiekar</groupId>
   <artifactId>jInstagram</artifactId>
   <version>1.0.10</version>
</dependency>
```

##Dependencies

* Google GSON (http://code.google.com/p/google-gson/)

##About me

* [LinkedIn](http://uk.linkedin.com/in/sachinhandiekar)
* Email   : sachin.handiekar at gmail.com / sach21 at gmail.com
* Twitter : [@sachinhandiekar](http://twitter.com/sachinhandiekar)
