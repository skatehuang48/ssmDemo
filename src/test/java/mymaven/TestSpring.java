package mymaven;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsk.bean.DeptBean;
import com.hsk.controller.DeptController;
import com.hsk.dao.DeptDao;
import com.hsk.service.DeptService;
import com.hsk.service.impl.DeptServiceImpl;

/**
 * 测试使用@Component、service\controller注解的bean是否被加载到spring的ioc容器中
 * @author Administrator
 *
 */
public class TestSpring {

	@Test
	public void testSpring(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml");
		//DeptBean deptBean = ac.getBean(DeptBean.class);
		DeptService deptService = ac.getBean("deptService", DeptServiceImpl.class);
		//DeptController deptController = ac.getBean(DeptController.class);
		//deptBean.setDeptName("管理部");
		//System.out.println(deptBean);
		System.out.println(deptService);
		//System.out.println(deptController);
	}
}
