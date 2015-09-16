package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the student_leadership database table.
 * 
 */
@Embeddable
public class StudentLeadershipPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="student_id", insertable=false, updatable=false)
	private int studentId;

	@Column(name="leadership_role")
	private String leadershipRole;

	public StudentLeadershipPK() {
	}
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getLeadershipRole() {
		return this.leadershipRole;
	}
	public void setLeadershipRole(String leadershipRole) {
		this.leadershipRole = leadershipRole;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StudentLeadershipPK)) {
			return false;
		}
		StudentLeadershipPK castOther = (StudentLeadershipPK)other;
		return 
			(this.studentId == castOther.studentId)
			&& this.leadershipRole.equals(castOther.leadershipRole);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.studentId;
		hash = hash * prime + this.leadershipRole.hashCode();
		
		return hash;
	}
}