package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the professor database table.
 * 
 */
@Entity
@NamedQuery(name="Professor.findAll", query="SELECT p FROM Professor p")
public class Professor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="professor_id")
	private int professorId;

	@Column(name="actv_in")
	private String actvIn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_tz")
	private Date createdTz;

	@Column(name="created_uid")
	private int createdUid;

	@Column(name="display_picture")
	private String displayPicture;

	@Column(name="first_name")
	private String firstName;

	private String gender;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_modified_tz")
	private Date lastModifiedTz;

	@Column(name="last_modified_uid")
	private int lastModifiedUid;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Lob
	@Column(name="professor_description")
	private byte[] professorDescription;

	@Column(name="professor_title")
	private String professorTitle;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Department department;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="uid")
	private User user;

	//bi-directional many-to-one association to UniversityJob
	@OneToMany(mappedBy="professor")
	private List<UniversityJob> universityJobs;

	public Professor() {
	}

	public int getProfessorId() {
		return this.professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
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

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public byte[] getProfessorDescription() {
		return this.professorDescription;
	}

	public void setProfessorDescription(byte[] professorDescription) {
		this.professorDescription = professorDescription;
	}

	public String getProfessorTitle() {
		return this.professorTitle;
	}

	public void setProfessorTitle(String professorTitle) {
		this.professorTitle = professorTitle;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
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
		universityJob.setProfessor(this);

		return universityJob;
	}

	public UniversityJob removeUniversityJob(UniversityJob universityJob) {
		getUniversityJobs().remove(universityJob);
		universityJob.setProfessor(null);

		return universityJob;
	}

}