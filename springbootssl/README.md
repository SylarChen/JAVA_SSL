#Spring Boot SSL Configuration (Page Redirect, Log Config, Bean Injection, Props Read)
https://www.drissamri.be/blog/java/enable-https-in-spring-boot/
##Generate Key Store
http://blog.csdn.net/saindy5828/article/details/11987587 <br />
keytool -genkey -alias tomcat -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 3650 
##Configure key in application.properties
server.port: 8443 <br /> 
server.ssl.key-store: .\\keystore.p12 <br />
server.ssl.key-store-password: 123456 <br />
server.ssl.keyStoreType: PKCS12 <br />
server.ssl.keyAlias: tomcat
##Redirect index page
http://stackoverflow.com/questions/33327678/springboot-controller-redirect-not-working  <br />
	@RequestMapping(value="/", method=RequestMethod.GET)  <br />
    public String index(Model model) {  <br />
		return "redirect:Enable%20HTTPS%20in%20Spring%20Boot.html";  <br />
	}
##Spring boot log configuration
https://springframework.guru/using-logback-spring-boot/ <br />
application.properties: <br />
logging.level.suiteinstaller.TestController=DEBUG <br />
logging.file=logs/my.log <br />
##Spring boot bean injection
http://stackoverflow.com/questions/31459838/spring-boot-dependency-injection <br />
@Component ---> MyConfig.java <br />
@Autowired <br />
##Spring boot Props Read
http://stackoverflow.com/questions/25869428/classpath-resource-not-found-when-running-as-jar <br />
Read props under resource folder inside jar ---> MyConfig.java <br />
ClassPathResource classPathResource = new ClassPathResource("myconf.json"); //myconf.json is under resource folder
InputStream inputStream = classPathResource.getInputStream(); <br />
##Run and check
Page Redirect: <br />
https://localhost:8443 <br />
https://localhost:8443/log <br />
Bean Injection, Props Read: <br />
https://localhost:8443/conf <br /> 
Log Config: <br />
https://localhost:8443/hello <br />
