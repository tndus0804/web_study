package net.datasa.service;

import java.util.ArrayList;

import net.datasa.vo.Member;

public class BMIService {
	private ArrayList<Member> list = new ArrayList<>();
	
	public BMIService() {
		list.add(new Member("홍길동", 160, 51));
		list.add(new Member("김철수", 180, 75));
		list.add(new Member("김영희", 165, 55));
	}
	
	
	// 메서드
	public void insertMember(Member member) {
		list.add(member);
	}
	
	public Member selectByCode(int code) {
		for(Member m : list) {
			if(m.getMyCode() == code) {
				return m;
			}
		}
		return null;
	}
	
	public ArrayList<Member> selectAll() {
		return list;
	}
	
	public void updateMember(Member member, double height, double weight) {
		member.setHeight(height);
		member.setWeight(weight);
		member.calcBMI();
	}
	
	public void deleteMember(Member member) {
		list.remove(member);
	}
	
	public void deleteMember(int code) {
		for(Member m : list) {
			if(m.getMyCode() == code) {
//				m1 = m;
				list.remove(m);
				break;
			}
		}
	}
//	public Member[] selectAll() {
//		
//		Member[] m = (Member[])list.toArray();
//		return m;
//	}
	
	
}
