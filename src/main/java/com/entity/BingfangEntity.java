package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 病房
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-06 17:26:54
 */
@TableName("bingfang")
public class BingfangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BingfangEntity() {
		
	}
	
	public BingfangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 病房号
	 */
					
	private String bingfanghao;
	
	/**
	 * 病床数
	 */
					
	private String bingchuangshu;
	
	/**
	 * 病房位置
	 */
					
	private String bingfangweizhi;
	
	/**
	 * 空闲床位
	 */
					
	private String kongxianchuangwei;
	
	/**
	 * 科室
	 */
					
	private String keshi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：病房号
	 */
	public void setBingfanghao(String bingfanghao) {
		this.bingfanghao = bingfanghao;
	}
	/**
	 * 获取：病房号
	 */
	public String getBingfanghao() {
		return bingfanghao;
	}
	/**
	 * 设置：病床数
	 */
	public void setBingchuangshu(String bingchuangshu) {
		this.bingchuangshu = bingchuangshu;
	}
	/**
	 * 获取：病床数
	 */
	public String getBingchuangshu() {
		return bingchuangshu;
	}
	/**
	 * 设置：病房位置
	 */
	public void setBingfangweizhi(String bingfangweizhi) {
		this.bingfangweizhi = bingfangweizhi;
	}
	/**
	 * 获取：病房位置
	 */
	public String getBingfangweizhi() {
		return bingfangweizhi;
	}
	/**
	 * 设置：空闲床位
	 */
	public void setKongxianchuangwei(String kongxianchuangwei) {
		this.kongxianchuangwei = kongxianchuangwei;
	}
	/**
	 * 获取：空闲床位
	 */
	public String getKongxianchuangwei() {
		return kongxianchuangwei;
	}
	/**
	 * 设置：科室
	 */
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
	}

}
