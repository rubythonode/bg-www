package com.bg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bg.dao.MemberDao;
import com.bg.model.Member;
import com.bg.service.MemberService;
import com.google.common.base.Preconditions;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired 
	private MemberDao memberDao;
	
	public Member create(Member member) {
		// TODO Auto-generated method stub
		Preconditions.checkNotNull(member);
		memberDao.create(member);
		return null;
	}
}
