package com.jpademo.dao;

import java.util.List;

import com.jpademo.entity.Family;

public interface FamilyDao {
	public void persist(Family entity);

	public void update(Family entity, int id);

	public Family findById(int id);

	public void deleteById(int id);

	public List<Family> findAll();

}
