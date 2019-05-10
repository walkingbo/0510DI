package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import db.GoodService;
import di.CollectionBean;


public class Main {

	public static void main(String[] args) {
		try(GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");){
			
			/*
			//good 을 사용하기 위해 new good을 안하고 
			//applicationContext.xml이라는 파일을 생성해서 사용 = 이것이 IoC
			Good good = context.getBean("g1",Good.class);
			//매개변수 없는 생성자를 이용했으므로 인스턴스 변수가 기본값을 
			//가지고 있습니다.
			System.out.println(good);
			
			good= context.getBean("g2",Good.class);
			System.out.println(good);
			
			good= context.getBean("g3",Good.class);
			System.out.println(good);
			
			good= context.getBean("g4",Good.class);
			System.out.println(good);
			
			good= context.getBean("g5",Good.class);
			System.out.println(good);
			
			good= context.getBean("g6",Good.class);
			System.out.println(good);
		    */
			
			
			CollectionBean bean=
					context.getBean("collectionBean",CollectionBean.class);
			System.out.println(bean.getList());
			System.out.println(bean.getSet());
			System.out.println(bean.getMap());
			System.out.println(bean.getProp());
			
			
			GoodService goodService =
					context.getBean("goodService",GoodService.class);
			db.Good good = goodService.get();
			System.out.println(good);
			
		}catch(Exception e) {
			System.out.println("예외:" + e.getMessage());
			e.printStackTrace();
		}

	}

}
