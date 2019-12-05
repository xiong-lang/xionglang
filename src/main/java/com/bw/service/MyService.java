package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.pojo.Dept;
import com.bw.pojo.Movie;

public interface MyService {

	List<Movie> getAll(Map<String, Object>map);

	List<Dept> getDept();

	int addMiddle(String[] array,Movie m);
}
