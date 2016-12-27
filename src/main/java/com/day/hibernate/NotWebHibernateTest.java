package com.day.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.day.hibernate.domain.Game;
import com.day.hibernate.domain.User;

public class NotWebHibernateTest {
	
	
	/**
	 * 本类用来测试不依赖Spring直接用Hibernate的情况，模仿普通项目下如何使用Hibernate，而非Web环境下使用
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		/**
		 * 1 使用XML配置文件：hibernate.cfg.xml 和 注解配置映射bean
		 * 
		 * 下面是注解配置bean和映射文件XML不同的地方：
		*
		*	（1）：hibernate.hbm.xml 文件中把引用：xxx.hbm.xml改为引用实体类：
		*
     	*	即把：<mapping resource="com/wsw/hibernate/model/Person.hbm.xml"/>
		*
		*	改为：<mapping class="com.wsw.hibernate.model.Teacher" />
        *
		*	（2）：获取SessionFactory方式发生了变化：
		*
      	*	即：由SessionFactory sf = new Configuration().configure().buildSessionFactory()
		*
    	*	改为：SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory()
		 * 
		 * 
		 */
		
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		//测试cascade 级联  和 inverse 维护关系
		
		/*User user = new User();
		user.setName("shimh");
		user.setPwd("123");
		
		Game game = new Game();
		game.setName("lol");
		game.setType("net");
		
		user.setGame(game);
		
		session.save(user);*/
		
		/*User user = new User();
		user.setName("zhangxf");
		user.setPwd("123");
		
		Game game = new Game();
		game.setName("cf");
		game.setType("net");
		
		game.getUsers().add(user);
		
		session.save(game);*/
		
		/*User  user = (User) session.get(User.class, 3);
		session.delete(user);*/
		
		/*Game  game = (Game) session.get(Game.class, 3);
		User u = new User();
		u.setGame(game);
		u.setName("shimh");
		u.setPwd("123");
		session.save(u);*/
		
		
		User  u = (User) session.get(User.class, 5);
		Game game = new Game();
		game.setName("sw");
		game.setType("net");
		game.getUsers().add(u);
		session.save(game);
		
		
		tr.commit();
		session.close();
	}

}
