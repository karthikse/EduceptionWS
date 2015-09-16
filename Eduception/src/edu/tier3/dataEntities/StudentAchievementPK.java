package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the student_achievements database table.
 * 
 */
@Embeddable
public class StudentAchievementPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="defend_id", insertable=false, updatable=false)
	private int defendId;

	@Column(name="student_id", insertable=false, updatable=false)
	private int studentId;

	public StudentAchievementPK() {
	}
	public int getDefendId() {
		return this.defendId;
	}
	public void setDefendId(int defendId) {
		this.defendId = defendId;
	}
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StudentAchievementPK)) {
			return false;
		}
		StudentAchievementPK castOther = (StudentAchievementPK)other;
		return 
			(this.defendId == castOther.defendId)
			&& (this.studentId == castOther.studentId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.defendId;
		hash = hash * prime + this.studentId;
		
		return hash;
	}
}