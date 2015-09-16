package edu.tier3.dataEntities;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the student_employement_history database table.
 * 
 */
@Entity
@Table(name="student_employement_history")
@NamedQuery(name="StudentEmployementHistory.findAll", query="SELECT s FROM StudentEmployementHistory s")
@NamedQueries({
	@NamedQuery(name="StudentEmployementHistory.findByStudentId", query="SELECT s FROM StudentEmployementHistory s where s.student = :studentId")
})
public class StudentEmployementHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StudentEmployementHistoryPK id;

	@Column(name="actv_in")
	private String actvIn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_tz")
	private Date createdTz;

	@Column(name="created_uid")
	private int createdUid;

	@Column(name="defend_flag")
	private String defendFlag;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Column(name="job_title")
	private String jobTitle;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_modified_tz")
	private Date lastModifiedTz;

	@Column(name="last_modified_uid")
	private int lastModifiedUid;

	@Column(name="manager_email_id")
	private String managerEmailId;

	@Column(name="manager_link")
	private String managerLink;

	@Column(name="manager_name")
	private String managerName;

	@Column(name="manager_title")
	private String managerTitle;

	@Column(name="other_company")
	private String otherCompany;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	@Lob
	@Column(name="work_description")
	private byte[] workDescription;

	//bi-directional many-to-one association to Company
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	public StudentEmployementHistory() {
	}

	public StudentEmployementHistoryPK getId() {
		return this.id;
	}

	public void setId(StudentEmployementHistoryPK id) {
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

	public String getDefendFlag() {
		return this.defendFlag;
	}

	public void setDefendFlag(String defendFlag) {
		this.defendFlag = defendFlag;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
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

	public String getManagerEmailId() {
		return this.managerEmailId;
	}

	public void setManagerEmailId(String managerEmailId) {
		this.managerEmailId = managerEmailId;
	}

	public String getManagerLink() {
		return this.managerLink;
	}

	public void setManagerLink(String managerLink) {
		this.managerLink = managerLink;
	}

	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerTitle() {
		return this.managerTitle;
	}

	public void setManagerTitle(String managerTitle) {
		this.managerTitle = managerTitle;
	}

	public String getOtherCompany() {
		return this.otherCompany;
	}

	public void setOtherCompany(String otherCompany) {
		this.otherCompany = otherCompany;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public byte[] getWorkDescription() {
		return this.workDescription;
	}

	public void setWorkDescription(byte[] workDescription) {
		this.workDescription = workDescription;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}