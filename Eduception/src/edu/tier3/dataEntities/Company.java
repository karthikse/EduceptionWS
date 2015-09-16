package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="company_id")
	private int companyId;

	@Column(name="actv_in")
	private String actvIn;

	@Lob
	@Column(name="company_description")
	private byte[] companyDescription;

	@Column(name="company_name")
	private String companyName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_tz")
	private Date createdTz;

	@Column(name="created_uid")
	private int createdUid;

	@Column(name="display_picture")
	private String displayPicture;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_modified_tz")
	private Date lastModifiedTz;

	@Column(name="last_modified_uid")
	private int lastModifiedUid;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="uid")
	private User user;

	//bi-directional many-to-one association to Job
	@OneToMany(mappedBy="company")
	private List<Job> jobs;

	//bi-directional many-to-one association to StudentEmployementHistory
	@OneToMany(mappedBy="company")
	private List<StudentEmployementHistory> studentEmployementHistories;

	public Company() {
	}

	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getActvIn() {
		return this.actvIn;
	}

	public void setActvIn(String actvIn) {
		this.actvIn = actvIn;
	}

	public byte[] getCompanyDescription() {
		return this.companyDescription;
	}

	public void setCompanyDescription(byte[] companyDescription) {
		this.companyDescription = companyDescription;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getDisplayPicture() {
		return this.displayPicture;
	}

	public void setDisplayPicture(String displayPicture) {
		this.displayPicture = displayPicture;
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

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Job> getJobs() {
		return this.jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public Job addJob(Job job) {
		getJobs().add(job);
		job.setCompany(this);

		return job;
	}

	public Job removeJob(Job job) {
		getJobs().remove(job);
		job.setCompany(null);

		return job;
	}

	public List<StudentEmployementHistory> getStudentEmployementHistories() {
		return this.studentEmployementHistories;
	}

	public void setStudentEmployementHistories(List<StudentEmployementHistory> studentEmployementHistories) {
		this.studentEmployementHistories = studentEmployementHistories;
	}

	public StudentEmployementHistory addStudentEmployementHistory(StudentEmployementHistory studentEmployementHistory) {
		getStudentEmployementHistories().add(studentEmployementHistory);
		studentEmployementHistory.setCompany(this);

		return studentEmployementHistory;
	}

	public StudentEmployementHistory removeStudentEmployementHistory(StudentEmployementHistory studentEmployementHistory) {
		getStudentEmployementHistories().remove(studentEmployementHistory);
		studentEmployementHistory.setCompany(null);

		return studentEmployementHistory;
	}

}