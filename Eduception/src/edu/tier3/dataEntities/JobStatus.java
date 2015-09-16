package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the job_status database table.
 * 
 */
@Entity
@Table(name="job_status")
@NamedQuery(name="JobStatus.findAll", query="SELECT j FROM JobStatus j")
public class JobStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="status_id")
	private int statusId;

	@Column(name="actv_in")
	private String actvIn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_tz")
	private Date createdTz;

	@Column(name="created_uid")
	private int createdUid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_modified_tz")
	private Date lastModifiedTz;

	@Column(name="last_modified_uid")
	private int lastModifiedUid;

	@Column(name="status_name")
	private String statusName;

	//bi-directional many-to-one association to StudentJob
	@OneToMany(mappedBy="jobStatus")
	private List<StudentJob> studentJobs;

	public JobStatus() {
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getActvIn() {
		return this.actvIn;
	}

	public void setActvIn(String actvIn) {
		this.actvIn = actvIn;
	}

	public Date getCreatedTz() {
		return this.createdTz;
	}

	public void setCreatedTz(Date createdTz) {
		this.createdTz = createdTz;
	}

	public int getCreatedUid() {
		return this.createdUid;
	}

	public void setCreatedUid(int createdUid) {
		this.createdUid = createdUid;
	}

	public Date getLastModifiedTz() {
		return this.lastModifiedTz;
	}

	public void setLastModifiedTz(Date lastModifiedTz) {
		this.lastModifiedTz = lastModifiedTz;
	}

	public int getLastModifiedUid() {
		return this.lastModifiedUid;
	}

	public void setLastModifiedUid(int lastModifiedUid) {
		this.lastModifiedUid = lastModifiedUid;
	}

	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public List<StudentJob> getStudentJobs() {
		return this.studentJobs;
	}

	public void setStudentJobs(List<StudentJob> studentJobs) {
		this.studentJobs = studentJobs;
	}

	public StudentJob addStudentJob(StudentJob studentJob) {
		getStudentJobs().add(studentJob);
		studentJob.setJobStatus(this);

		return studentJob;
	}

	public StudentJob removeStudentJob(StudentJob studentJob) {
		getStudentJobs().remove(studentJob);
		studentJob.setJobStatus(null);

		return studentJob;
	}

}