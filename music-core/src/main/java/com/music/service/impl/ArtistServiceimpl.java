package com.music.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.music.dao.ArtistDao;
import com.music.entity.Artist;
import com.music.service.ArtistService;
/**
 * 
 * @author Forever
 * @version 1.0
 */
@Service("artistService")
public class ArtistServiceimpl implements ArtistService {
	
	@Resource(name="artistDao")
	private ArtistDao artistDao;
	
	
	//添加歌手
	public Artist addArtist(Artist a) {
		return artistDao.addArtist(a);
	}

	//删除歌手
	public boolean delArtist(Artist a) {
		return artistDao.delArtist(a);
	}

	//根据ID查找歌手
	public Artist findArtistById(int id) {
		return artistDao.findArtistById(id);
	}
	
	//修改歌手
	public boolean updateArtist(Artist a) {
		return artistDao.updateArtist(a);
	}
	
	//查看全部歌手
	public List findAllArtist() {
		System.out.println("------artistA    Service--------");
		List list = artistDao.findAllArtist();
		
		System.out.println(list+"----------service");
		return list;
	}
	
	

	public void setArtistDao(ArtistDao artistDao) {
		this.artistDao = artistDao;
	}

	
}
