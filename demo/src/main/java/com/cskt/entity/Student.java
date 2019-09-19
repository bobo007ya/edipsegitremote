package com.cskt.entity;

import java.util.Date;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component //讲此bean放入到spring容器
@ConfigurationProperties(prefix="student")
public class Student {
		@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", birthday=" + birthday + "]";
	}
		private String name;
		private int age;
		private boolean sex;
		private Date birthday;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public boolean isSex() {
			return sex;
		}
		public void setSex(boolean sex) {
			this.sex = sex;
		}
		public Date getBirthday() {
			return birthday;
		}
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}
}
