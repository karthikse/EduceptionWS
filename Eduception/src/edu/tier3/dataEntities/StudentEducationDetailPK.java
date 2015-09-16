package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the student_education_details database table.
 * 
 */
@Embeddable
public class StudentEducationDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="student_id", insertable=false, updatable=false)
	private int studentId;

	@Column(name="major_id", insertable=false, updatable=false)
	private int majorId;

	@Column(name="school_id", insertable=false, updatable=false)
	private int schoolId;

	public StudentEducationDetailPK() {
	}
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getMajorId() {
		return this.majorId;
	}
	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}
	public int getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StudentEducationDetailPK)) {
			return false;
		}
		StudentEducationDetailPK castOther = (StudentEducationDetailPK)other;
		return 
			(this.studentId == castOther.studentId)
			&& (this.majorId == castOther.majorId)
			&& (this.schoolId == castOther.schoolId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.studentId;
		hash = hash * prime + this.majorId;
		hash = hash * prime + this.schoolId;
		
		return hash;
	}
}