package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the university database table.
 * 
 */
@Entity
@NamedQuery(name="University.findAll", query="SELECT u FROM University u")
public class University implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="univ_id")
	private int univId;

	@Column(name="actv_in")
	private String actvIn;

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

	@Column(name="univ_name")
	private String univName;

	@Lob
	@Column(name="university_description")
	private byte[] universityDescription;

	//bi-directional many-to-one association to School
	@OneToMany(mappedBy="university")
	private List<School> schools;

	//bi-directional many-to-one association to StudentEducationDetail
	@OneToMany(mappedBy="university")
	private List<StudentEducationDetail> studentEducationDetails;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="uid")
	private User user;

	//bi-directional many-to-one association to UniversityJob
	@OneToMany(mappedBy="university")
	private List<UniversityJob> universityJobs;

	public University() {
	}

	public int getUnivId() {
		return this.univId;
	}

	public void setUnivId(int univId) {
		this.univId = univId;
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

	public String getUnivName() {
		return this.univName;
	}

	public void setUnivName(String univName) {
		this.univName = univName;
	}

	public byte[] getUniversityDescription() {
		return this.universityDescription;
	}

	public void setUniversityDescription(byte[] universityDescription) {
		this.universityDescription = universityDescription;
	}

	public List<School> getSchools() {
		return this.schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

	public School addSchool(School school) {
		getSchools().add(school);
		school.setUniversity(this);

		return school;
	}

	public School removeSchool(School school) {
		getSchools().remove(school);
		school.setUniversity(null);

		return school;
	}

	public List<StudentEducationDetail> getStudentEducationDetails() {
		return this.studentEducationDetails;
	}

	public void setStudentEducationDetails(List<StudentEducationDetail> studentEducationDetails) {
		this.studentEducationDetails = studentEducationDetails;
	}

	public StudentEducationDetail addStudentEducationDetail(StudentEducationDetail studentEducationDetail) {
		getStudentEducationDetails().add(studentEducationDetail);
		studentEducationDetail.setUniversity(this);

		return studentEducationDetail;
	}

	public StudentEducationDetail removeStudentEducationDetail(StudentEducationDetail studentEducationDetail) {
		getStudentEducationDetails().remove(studentEducationDetail);
		studentEducationDetail.setUniversity(null);

		return studentEducationDetail;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<UniversityJob> getUniversityJobs() {
		return this.universityJobs;
	}

	public void setUniversityJobs(List<UniversityJob> universityJobs) {
		this.universityJobs = universityJobs;
	}

	public UniversityJob addUniversityJob(UniversityJob universityJob) {
		getUniversityJobs().add(universityJob);
		universityJob.setUniversity(this);

		return universityJob;
	}

	public UniversityJob removeUniversityJob(UniversityJob universityJob) {
		getUniversityJobs().remove(universityJob);
		universityJob.setUniversity(null);

		return universityJob;
	}

}