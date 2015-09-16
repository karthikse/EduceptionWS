package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the university_jobs database table.
 * 
 */
@Entity
@Table(name="university_jobs")
@NamedQuery(name="UniversityJob.findAll", query="SELECT u FROM UniversityJob u")
public class UniversityJob implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UniversityJobPK id;

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

	//bi-directional many-to-one association to Hr
	@ManyToOne
	@JoinColumn(name="hr_id")
	private Hr hr;

	//bi-directional many-to-one association to Job
	@ManyToOne
	@JoinColumn(name="job_id")
	private Job job;

	//bi-directional many-to-one association to Professor
	@ManyToOne
	@JoinColumn(name="professor_id")
	private Professor professor;

	//bi-directional many-to-one association to University
	@ManyToOne
	@JoinColumn(name="univ_id")
	private University university;

	public UniversityJob() {
	}

	public UniversityJobPK getId() {
		return this.id;
	}

	public void setId(UniversityJobPK id) {
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

	public Hr getHr() {
		return this.hr;
	}

	public void setHr(Hr hr) {
		this.hr = hr;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Professor getProfessor() {
		return this.professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

}