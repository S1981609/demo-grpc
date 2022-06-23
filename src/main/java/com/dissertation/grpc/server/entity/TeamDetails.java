package com.dissertation.grpc.server.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team_info", schema = "public")
public class TeamDetails {
	@Column(name = "member1")
	String member1;
	@Column(name = "member2")
	String member2;
	@Column(name = "member1_id")
	Integer member1id;
	@Column(name = "member2_id")
	Integer member2id;
	@Column(name = "course_code")
	String courseCode;
	@Id
	@GeneratedValue
	@Column(name = "group_id")
	Integer groupId;
	public String getMember1() {
		return member1;
	}
	public void setMember1(String member1) {
		this.member1 = member1;
	}
	public String getMember2() {
		return member2;
	}
	public void setMember2(String member2) {
		this.member2 = member2;
	}
	public Integer getMember1id() {
		return member1id;
	}
	public void setMember1id(Integer member1id) {
		this.member1id = member1id;
	}
	public Integer getMember2id() {
		return member2id;
	}
	public void setMember2id(Integer member2id) {
		this.member2id = member2id;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseCode, groupId, member1, member1id, member2, member2id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamDetails other = (TeamDetails) obj;
		return Objects.equals(courseCode, other.courseCode) && Objects.equals(groupId, other.groupId)
				&& Objects.equals(member1, other.member1) && Objects.equals(member1id, other.member1id)
				&& Objects.equals(member2, other.member2) && Objects.equals(member2id, other.member2id);
	}
	@Override
	public String toString() {
		return "TeamDetails [member1=" + member1 + ", member2=" + member2 + ", member1id=" + member1id + ", member2id="
				+ member2id + ", courseCode=" + courseCode + ", groupId=" + groupId + "]";
	}
	
}
