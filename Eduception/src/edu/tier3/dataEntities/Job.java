package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the jobs database table.
 * 
 */
@Entity
@Table(name="jobs")
@NamedQuery(name="Job.findAll", query="SELECT j FROM Job j")
public class Job implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="job_id")
	private int jobId;

	@Column(name="actv_in")
	private String actvIn;

	@Column(name="authorization_ids")
	private String authorizationIds;

	@Column(name="cgpa_cutoff")
	private float cgpaCutoff;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_tz")
	private Date createdTz;

	@Column(name="created_uid")
	private int createdUid;

	@Temporal(TemporalType.DATE)
	@Column(name="deadline_date")
	private Date deadlineDate;

	@Column(name="is_coverletter_required")
	private String isCoverletterRequired;

	@Lob
	@Column(name="job_description")
	private byte[] jobDescription;

	@Column(name="job_name")
	private String jobName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_modified_tz")
	private Date lastModifiedTz;

	@Column(name="last_modified_uid")
	private int lastModifiedUid;

	@Column(name="major_ids")
	private String majorIds;

	@Column(name="other_criteria")
	private String otherCriteria;

	@Temporal(TemporalType.DATE)
	@Column(name="post_name")
	private Date postName;

	@Column(name="work_experience_cutoff")
	private int workExperienceCutoff;

	//bi-directional many-to-one association to HrJob
	@OneToMany(mappedBy="job")
	private List<HrJob> hrJobs;

	//bi-directional many-to-one association to Company
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;

	//bi-directional many-to-one association to StudentJob
	@OneToMany(mappedBy="job")
	private List<StudentJob> studentJobs;

	//bi-directional many-to-one association to UniversityJob
	@OneToMany(mappedBy="job")
	private List<UniversityJob> universityJobs;

	public Job() {
	}

	public int getJobId() {
		return this.jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getActvIn() {
		return this.actvIn;
	}

	public void setActvIn(String actvIn) {
		this.actvIn = actvIn;
	}

	public String getAuthorizationIds() {
		return this.authorizationIds;
	}

	public void setAuthorizationIds(String authorizationIds) {
		this.authorizationIds = authorizationIds;
	}

	public float getCgpaCutoff() {
		return this.cgpaCutoff;
	}

	public void setCgpaCutoff(float cgpaCutoff) {
		this.cgpaCutoff = cgpaCutoff;
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

	public Date getDeadlineDate() {
		return this.deadlineDate;
	}

	public void setDeadlineDate(Date deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	public String getIsCoverletterRequired() {
		return this.isCoverletterRequired;
	}

	public void setIsCoverletterRequired(String isCoverletterRequired) {
		this.isCoverletterRequired = isCoverletterRequired;
	}

	public byte[] getJobDescription() {
		return this.jobDescription;
	}

	public void setJobDescription(byte[] jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
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

	public String getMajorIds() {
		return this.majorIds;
	}

	public void setMajorIds(String majorIds) {
		this.majorIds = majorIds;
	}

	public String getOtherCriteria() {
		return this.otherCriteria;
	}

	public void setOtherCriteria(String otherCriteria) {
		this.otherCriteria = otherCriteria;
	}

	public Date getPostName() {
		return this.postName;
	}

	public void setPostName(Date postName) {
		this.postName = postName;
	}

	public int getWorkExperienceCutoff() {
		return this.workExperienceCutoff;
	}

	public void setWorkExperienceCutoff(int workExperienceCutoff) {
		this.workExperienceCutoff = workExperienceCutoff;
	}

	public List<HrJob> getHrJobs() {
		return this.hrJobs;
	}

	public void setHrJobs(List<HrJob> hrJobs) {
		this.hrJobs = hrJobs;
	}

	public HrJob addHrJob(HrJob hrJob) {
		getHrJobs().add(hrJob);
		hrJob.setJob(this);

		return hrJob;
	}

	public HrJob removeHrJob(HrJob hrJob) {
		getHrJobs().remove(hrJob);
		hrJob.setJob(null);

		return hrJob;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<StudentJob> getStudentJobs() {
		return this.studentJobs;
	}

	public void setStudentJobs(List<StudentJob> studentJobs) {
		this.studentJobs = studentJobs;
	}

	public StudentJob addStudentJob(StudentJob studentJob) {
		getStudentJobs().add(studentJob);
		studentJob.setJob(this);

		return studentJob;
	}

	public StudentJob removeStudentJob(StudentJob studentJob) {
		getStudentJobs().remove(studentJob);
		studentJob.setJob(null);

		return studentJob;
	}

	public List<UniversityJob> getUniversityJobs() {
		return this.universityJobs;
	}

	public void setUniversityJobs(List<UniversityJob> universityJobs) {
		this.universityJobs = universityJobs;
	}

	public UniversityJob addUniversityJob(UniversityJob universityJob) {
		getUniversityJobs().add(universityJob);
		universityJob.setJob(this);

		return universityJob;
	}

	public UniversityJob removeUniversityJob(UniversityJob universityJob) {
		getUniversityJobs().remove(universityJob);
		universityJob.setJob(null);

		return universityJob;
	}

}