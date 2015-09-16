package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the school database table.
 * 
 */
@Entity
@NamedQuery(name="School.findAll", query="SELECT s FROM School s")
public class School implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="school_id")
	private int schoolId;

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

	@Lob
	@Column(name="school_description")
	private byte[] schoolDescription;

	@Column(name="school_name")
	private String schoolName;

	//bi-directional many-to-one association to Department
	@OneToMany(mappedBy="school")
	private List<Department> departments;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="uid")
	private User user;

	//bi-directional many-to-one association to University
	@ManyToOne
	@JoinColumn(name="univ_id")
	private University university;

	//bi-directional many-to-one association to StudentEducationDetail
	@OneToMany(mappedBy="school")
	private List<StudentEducationDetail> studentEducationDetails;

	public School() {
	}

	public int getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
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

	public byte[] getSchoolDescription() {
		return this.schoolDescription;
	}

	public void setSchoolDescription(byte[] schoolDescription) {
		this.schoolDescription = schoolDescription;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<Department> getDepartments() {
		return this.departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Department addDepartment(Department department) {
		getDepartments().add(department);
		department.setSchool(this);

		return department;
	}

	public Department removeDepartment(Department department) {
		getDepartments().remove(department);
		department.setSchool(null);

		return department;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public List<StudentEducationDetail> getStudentEducationDetails() {
		return this.studentEducationDetails;
	}

	public void setStudentEducationDetails(List<StudentEducationDetail> studentEducationDetails) {
		this.studentEducationDetails = studentEducationDetails;
	}

	public StudentEducationDetail addStudentEducationDetail(StudentEducationDetail studentEducationDetail) {
		getStudentEducationDetails().add(studentEducationDetail);
		studentEducationDetail.setSchool(this);

		return studentEducationDetail;
	}

	public StudentEducationDetail removeStudentEducationDetail(StudentEducationDetail studentEducationDetail) {
		getStudentEducationDetails().remove(studentEducationDetail);
		studentEducationDetail.setSchool(null);

		return studentEducationDetail;
	}

}