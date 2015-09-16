package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the student_jobs database table.
 * 
 */
@Entity
@Table(name="student_jobs")
@NamedQuery(name="StudentJob.findAll", query="SELECT s FROM StudentJob s")
public class StudentJob implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StudentJobPK id;

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

	//bi-directional many-to-one association to Job
	@ManyToOne
	@JoinColumn(name="job_id")
	private Job job;

	//bi-directional many-to-one association to JobStatus
	@ManyToOne
	@JoinColumn(name="status_id")
	private JobStatus jobStatus;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	public StudentJob() {
	}

	public StudentJobPK getId() {
		return this.id;
	}

	public void setId(StudentJobPK id) {
		this.id = id;
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

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public JobStatus getJobStatus() {
		return this.jobStatus;
	}

	public void setJobStatus(JobStatus jobStatus) {
		this.jobStatus = jobStatus;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}