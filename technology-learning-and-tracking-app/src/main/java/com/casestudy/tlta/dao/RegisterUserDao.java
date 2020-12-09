package com.casestudy.tlta.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import com.casestudy.tlta.entity.RegisterUser;
import com.casestudy.tlta.entity.RegisterUserBuilder;

public interface RegisterUserDao {

	public void addUser(RegisterUserBuilder login) throws PersistenceException;

	public RegisterUser getUserById(Integer id) throws PersistenceException;

	public RegisterUser getModeratorById(Integer id) throws PersistenceException;

	public Integer deleteUser(Integer id) throws PersistenceException;

	public RegisterUser updatePassword(RegisterUser login) throws PersistenceException;

	public RegisterUser updatePassword(RegisterUser login, String email, String lastName) throws PersistenceException;

	public RegisterUser updateFirstName(RegisterUser login) throws PersistenceException;

	public RegisterUser updateLastName(RegisterUser login) throws PersistenceException;

	public List<RegisterUser> getAllRegisteredUser() throws PersistenceException;

}