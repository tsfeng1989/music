package com.music.service;

import java.util.List;

import com.music.entity.Artist;
/**
 * 
 * @author Forever
 * @version 1.0
 */
public interface ArtistService {
	//添加歌手
	public Artist addArtist(Artist a);
	
	//删除歌手
	public boolean delArtist(Artist a);
	
	//根据ID查找歌手
	public Artist findArtistById(int id);
	
	//修改歌手
	public boolean updateArtist(Artist a);
	
	//查看全部歌手
	public List findAllArtist();
	
	
	
}
