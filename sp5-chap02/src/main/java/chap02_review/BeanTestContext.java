package chap02_review;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanTestContext
{
	@Bean
	public BeanTest_A testA()
	{
		BeanTest_A a = new BeanTest_A();
		return a;
	}
	
	@Bean
	public BeanTest_B testB()
	{
		BeanTest_B b = new BeanTest_B();
		return b;
	}
}
