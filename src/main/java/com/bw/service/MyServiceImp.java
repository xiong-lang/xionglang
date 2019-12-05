package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.mapper.MyMapper;
import com.bw.pojo.Dept;
import com.bw.pojo.Movie;
@Service
public class MyServiceImp implements MyService{

	@Resource
	private MyMapper mm;
	public List<Movie> getAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mm.getAll(map);
	}
	public List<Dept> getDept() {
		// TODO Auto-generated method stub
		return mm.getDept();
	}
	public int addMiddle(String[] array, Movie m) {
		mm.addMovie(m);
		for (String str : array) {
			Integer did = Integer.parseInt(str);
			mm.addMiddle(m.getId(),did);
		}
		return 0;
	}
	
}
