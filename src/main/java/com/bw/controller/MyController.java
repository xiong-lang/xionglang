package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.pojo.Dept;
import com.bw.pojo.Movie;
import com.bw.service.MyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MyController {

	@Resource
	private MyService ms;
	@RequestMapping("list")
	public String getAll(Model model,@RequestParam(defaultValue="1")Integer pageNum,String name){
		PageHelper.startPage(pageNum,3);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", name);
		List<Movie> list = ms.getAll(map);
		PageInfo<Movie> pin=new PageInfo<Movie>(list);
		model.addAttribute("pin", pin);
		return "list";
	}
	@RequestMapping("getDept")
	public String getDept(Map<String, Object> map){
		List<Dept> list=ms.getDept();
		map.put("list", list);
		return "add";
	}
	@RequestMapping("add")
	public String add(String[] array,Movie m){
		ms.addMiddle(array,m);
		return "redirect:list";
	}
}
