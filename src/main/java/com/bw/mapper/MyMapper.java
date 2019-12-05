package com.bw.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bw.pojo.Dept;
import com.bw.pojo.Middle;
import com.bw.pojo.Movie;

public interface MyMapper {

	List<Movie> getAll(Map<String, Object>map);
	
	List<Dept> getDept();
	
	void addMiddle(@Param("mid")Integer mid,@Param("did")Integer did);
	
	void addMovie(Movie m);

}
