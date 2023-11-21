package chap02_review;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx
			= new AnnotationConfigApplicationContext(BeanTestContext.class);
		BeanTest_A a = ctx.getBean("testA", BeanTest_A.class);
		a.test();
		BeanTest_B b = ctx.getBean("testB", BeanTest_B.class);
		b.test();
		ctx.close();
	}
}
