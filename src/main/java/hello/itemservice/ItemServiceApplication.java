package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}


	/*basenames : 설정 파일의 이름을 지정한다.
	messages 로 지정하면 messages.properties 파일을 읽어서 사용한다.
	추가로 국제화 기능을 적용하려면 messages_en.properties , messages_ko.properties 와 같이 파일명 마지막에 언어 정보를 주면된다.
	만약 찾을 수 있는 국제화 파일이 없으면 messages.properties (언어정보가 없는 파일명)를 기본으로 사용한다.
	파일의 위치는 /resources/messages.properties 에 두면 된다.
	여러 파일을 한번에 지정할 수 있다. 여기서는 messages , errors 둘을 지정했다.
	defaultEncoding : 인코딩 정보를 지정한다. utf-8 을 사용하면 된다*/

	// 스프링 부트를 사용하면 스프링 부트가 MessageSource 를 자동으로 스프링 빈으로 등록
/*	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("messages", "errors");
		messageSource.setDefaultEncoding("utf-8");
		return messageSource;
	}*/

}
