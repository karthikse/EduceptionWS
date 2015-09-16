package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the student_jobs database table.
 * 
 */
@Embeddable
public class StudentJobPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="student_id", insertable=false, updatable=false)
	private int studentId;

	@Column(name="job_id", insertable=false, updatable=false)
	private int jobId;

	public StudentJobPK() {
	}
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getJobId() {
		return this.jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StudentJobPK)) {
			return false;
		}
		StudentJobPK castOther = (StudentJobPK)other;
		return 
			(this.studentId == castOther.studentId)
			&& (this.jobId == castOther.jobId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.studentId;
		hash = hash * prime + this.jobId;
		
		return hash;
	}
}