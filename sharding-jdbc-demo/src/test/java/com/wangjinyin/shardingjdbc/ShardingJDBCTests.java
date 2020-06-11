package com.wangjinyin.shardingjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wangjinyin.shardingjdbc.entity.Course;
import com.wangjinyin.shardingjdbc.entity.Udict;
import com.wangjinyin.shardingjdbc.entity.User;
import com.wangjinyin.shardingjdbc.mapper.CourseMapper;
import com.wangjinyin.shardingjdbc.mapper.UdictMapper;
import com.wangjinyin.shardingjdbc.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJDBCTests {

	// 注入mapper
	@Autowired
	private CourseMapper courseMapper;

	// 注入userMapper
	@Autowired
	private UserMapper userMapper;

	// 注入公共udictMapper
	@Autowired
	private UdictMapper udictMapper;

	// 添加操作
	@Test
	public void addUserDb1() {
		User user = new User();
		user.setUsername("lucymary");
		user.setUstatus("ahhh");
		userMapper.insert(user);
	}

	// 查询操作 @Test public void findUserDb() { QueryWrapper<User> wrapper = new
	// QueryWrapper<>(); // 设置 userid 值 wrapper.eq("user_id",465508031619137537L);
	// User user = userMapper.selectOne(wrapper); System. out .println(user); }

	// ======================测试公共表===================
	// 添加操作
	@Test
	public void addDict() {
		Udict udict = new Udict();
		udict.setUstatus("a");
		udict.setUvalue("已启用");
		udictMapper.insert(udict);
	}

	// 删除操作
	@Test
	public void deleteDict() {
		QueryWrapper<Udict> wrapper = new QueryWrapper<>();
		// 设置userid值
		wrapper.eq("dictid", 476431822910128129L);
		udictMapper.delete(wrapper);
	}

	// ======================测试垂直分库==================
	// 添加操作
	@Test
	public void addUserDb() {
		User user = new User();
		user.setUsername("lucymary");
		user.setUstatus("a");
		userMapper.insert(user);
	}

	// 查询操作
	@Test
	public void findUserDb() {
		QueryWrapper<User> wrapper = new QueryWrapper<>();
		// 设置userid值
		wrapper.eq("user_id", "476420215928782849");
		User user = userMapper.selectOne(wrapper);
		System.out.println(user);
	}

	// ======================测试水平分库=====================
	// 添加操作
	@Test
	public void addCourseDb() {
		Course course = new Course();
		course.setCname("javademo1");
		// 分库根据user_id
		course.setUserId(100L);
		course.setCstatus("Normal1");
		courseMapper.insert(course);
	}

	// 查询操作
	@Test
	public void findCourseDb3() {
		QueryWrapper<Course> wrapper = new QueryWrapper<>();
		// 设置userid值
		wrapper.eq("user_id", 100L);
		// 设置cid值
		wrapper.eq("cid", 476414903851155457L);
		Course course = courseMapper.selectOne(wrapper);
		System.out.println(course);
	}

	// 测试水平分表
	// =======================测试水平分表===================
	// 添加课程的方法
	@Test
	public void addCourse() {
		for (int i = 1; i <= 10; i++) {
			Course course = new Course();
			course.setCname("java" + i);
			course.setUserId(100L);
			course.setCstatus("Normal" + i);
			courseMapper.insert(course);
		}
	}

	// 查询操作
	@Test
	public void findCourseDb() {
		QueryWrapper<Course> wrapper = new QueryWrapper<>();
		// 设置userid值
		wrapper.eq("user_id", 100L);
		// 设置cid值
		wrapper.eq("cid", 465162909769531393L);
		Course course = courseMapper.selectOne(wrapper);
		System.out.println(course);
	}

}
