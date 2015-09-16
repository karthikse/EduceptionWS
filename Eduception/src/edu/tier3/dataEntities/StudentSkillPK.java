package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the student_skills database table.
 * 
 */
@Embeddable
public class StudentSkillPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="student_id", insertable=false, updatable=false)
	private int studentId;

	@Column(name="skill_name")
	private String skillName;

	public StudentSkillPK() {
	}
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getSkillName() {
		return this.skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StudentSkillPK)) {
			return false;
		}
		StudentSkillPK castOther = (StudentSkillPK)other;
		return 
			(this.studentId == castOther.studentId)
			&& this.skillName.equals(castOther.skillName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.studentId;
		hash = hash * prime + this.skillName.hashCode();
		
		return hash;
	}
}