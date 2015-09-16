package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the student_employement_history database table.
 * 
 */
@Embeddable
public class StudentEmployementHistoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="student_id", insertable=false, updatable=false)
	private int studentId;

	@Column(name="company_id", insertable=false, updatable=false)
	private int companyId;

	public StudentEmployementHistoryPK() {
	}
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StudentEmployementHistoryPK)) {
			return false;
		}
		StudentEmployementHistoryPK castOther = (StudentEmployementHistoryPK)other;
		return 
			(this.studentId == castOther.studentId)
			&& (this.companyId == castOther.companyId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.studentId;
		hash = hash * prime + this.companyId;
		
		return hash;
	}
}