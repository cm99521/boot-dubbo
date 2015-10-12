package boot.dubbo.normal.client.normal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import boot.dubbo.api.UserService;

public class WSConsumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ws-consumer.xml");
		context.start();

		final UserService webservice = (UserService) context.getBean("wsService1");

		while (true) {

			System.out.println(">>>>webservice getAll " + webservice.findAllUsers());

			Thread.sleep(5000);
		}

	}

}
