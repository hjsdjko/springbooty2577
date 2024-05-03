package com.dao;

import com.entity.BingfangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BingfangVO;
import com.entity.view.BingfangView;


/**
 * 病房
 * 
 * @author 
 * @email 
 * @date 2022-03-06 17:26:54
 */
public interface BingfangDao extends BaseMapper<BingfangEntity> {
	
	List<BingfangVO> selectListVO(@Param("ew") Wrapper<BingfangEntity> wrapper);
	
	BingfangVO selectVO(@Param("ew") Wrapper<BingfangEntity> wrapper);
	
	List<BingfangView> selectListView(@Param("ew") Wrapper<BingfangEntity> wrapper);

	List<BingfangView> selectListView(Pagination page,@Param("ew") Wrapper<BingfangEntity> wrapper);
	
	BingfangView selectView(@Param("ew") Wrapper<BingfangEntity> wrapper);
	

}
