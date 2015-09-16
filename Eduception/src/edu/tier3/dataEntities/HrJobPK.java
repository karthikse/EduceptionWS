package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hr_jobs database table.
 * 
 */
@Embeddable
public class HrJobPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="hr_id", insertable=false, updatable=false)
	private int hrId;

	@Column(name="job_id", insertable=false, updatable=false)
	private int jobId;

	public HrJobPK() {
	}
	public int getHrId() {
		return this.hrId;
	}
	public void setHrId(int hrId) {
		this.hrId = hrId;
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
		if (!(other instanceof HrJobPK)) {
			return false;
		}
		HrJobPK castOther = (HrJobPK)other;
		return 
			(this.hrId == castOther.hrId)
			&& (this.jobId == castOther.jobId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.hrId;
		hash = hash * prime + this.jobId;
		
		return hash;
	}
}