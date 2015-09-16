package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the student_work_authorization database table.
 * 
 */
@Embeddable
public class StudentWorkAuthorizationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="student_id", insertable=false, updatable=false)
	private int studentId;

	@Column(name="authorization_type_id", insertable=false, updatable=false)
	private int authorizationTypeId;

	public StudentWorkAuthorizationPK() {
	}
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAuthorizationTypeId() {
		return this.authorizationTypeId;
	}
	public void setAuthorizationTypeId(int authorizationTypeId) {
		this.authorizationTypeId = authorizationTypeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StudentWorkAuthorizationPK)) {
			return false;
		}
		StudentWorkAuthorizationPK castOther = (StudentWorkAuthorizationPK)other;
		return 
			(this.studentId == castOther.studentId)
			&& (this.authorizationTypeId == castOther.authorizationTypeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.studentId;
		hash = hash * prime + this.authorizationTypeId;
		
		return hash;
	}
}