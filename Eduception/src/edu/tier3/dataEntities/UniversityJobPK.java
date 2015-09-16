package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the university_jobs database table.
 * 
 */
@Embeddable
public class UniversityJobPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="univ_id", insertable=false, updatable=false)
	private int univId;

	@Column(name="job_id", insertable=false, updatable=false)
	private int jobId;

	@Column(name="hr_id", insertable=false, updatable=false)
	private int hrId;

	@Column(name="professor_id", insertable=false, updatable=false)
	private int professorId;

	public UniversityJobPK() {
	}
	public int getUnivId() {
		return this.univId;
	}
	public void setUnivId(int univId) {
		this.univId = univId;
	}
	public int getJobId() {
		return this.jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getHrId() {
		return this.hrId;
	}
	public void setHrId(int hrId) {
		this.hrId = hrId;
	}
	public int getProfessorId() {
		return this.professorId;
	}
	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UniversityJobPK)) {
			return false;
		}
		UniversityJobPK castOther = (UniversityJobPK)other;
		return 
			(this.univId == castOther.univId)
			&& (this.jobId == castOther.jobId)
			&& (this.hrId == castOther.hrId)
			&& (this.professorId == castOther.professorId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.univId;
		hash = hash * prime + this.jobId;
		hash = hash * prime + this.hrId;
		hash = hash * prime + this.professorId;
		
		return hash;
	}
}