package com.reeltalks.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.reeltalks.dto.Movie;
@Repository
public class MovieOracleDAO implements MovieDao{

	@Override
	public List<Movie> list(SqlSessionTemplate session) {
		List<Movie> list = session.selectList("selectAll");
		return list;
	}

	@Override
	public int insert(SqlSessionTemplate session, Movie dto) {
		return session.insert("insertmovie", dto);
	}
	
	@Override
	public int find(SqlSessionTemplate session, String movie_id) {
		return session.selectOne("findmovie", movie_id);
	}

	@Override
	public int update(SqlSessionTemplate session, Movie dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(SqlSessionTemplate session, int movieid) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
