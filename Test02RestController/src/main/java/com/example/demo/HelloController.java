package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	String[] names = {"name1","name2","name3","name4"};
	String[] mails = {"mail1","mail2","mail3","mail4"};
	
	@RequestMapping("/{id}")
	public DataObject index(@PathVariable int id) {
		return new DataObject(id,names[id],mails[id]);
	}

	public static class DataObject{
		public DataObject(int id,String name,String value) {
			this.id = id;
			this.name = name;
			this.value = value;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		private int id;
		private String name;
		private String value;
	}
}
