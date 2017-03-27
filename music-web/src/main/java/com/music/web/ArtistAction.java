package com.music.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.music.entity.Artist;
import com.music.service.ArtistService;

/**
 * 
 * @author Forever
 * @version 1.0
 */
@Controller
@RequestMapping("/artist")
public class ArtistAction {
	@Resource(name="artistService")
	private ArtistService artistService;
	
	//添加歌手
	public String addArtist(Artist a){
		System.out.println("------");
		return "";
	}
	
	//查询全部歌手
	@RequestMapping("/findALl")
	@ResponseBody
	public List findAllArtist(){
		System.out.println("------findAllArtist  Action-------");
		List list = artistService.findAllArtist();
		System.out.println(list.size());
		return list;
	}

	
	public void setArtistService(ArtistService artistService) {
		this.artistService = artistService;
	}
}










