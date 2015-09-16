package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the major database table.
 * 
 */
@Entity
@NamedQuery(name="Major.findAll", query="SELECT m FROM Major m")
public class Major implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="major_id")
	private int majorId;

	@Column(name="actv_in")
	private String actvIn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_tz")
	private Date createdTz;

	@Column(name="created_uid")
	private int createdUid;

	@Column(name="grad_level")
	private String gradLevel;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_modified_tz")
	private Date lastModifiedTz;

	@Column(name="last_modified_uid")
	private int lastModifiedUid;

	@Column(name="major_name")
	private String majorName;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Department department;

	//bi-directional many-to-one association to StudentEducationDetail
	@OneToMany(mappedBy="major")
	private List<StudentEducationDetail> studentEducationDetails;

	public Major() {
	}

	public int getMajorId() {
		return this.majorId;
	}

	public void setMajorId(int majorId) {
		this.majorId = majorId;
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

	public String getGradLevel() {
		return this.gradLevel;
	}

	public void setGradLevel(String gradLevel) {
		this.gradLevel = gradLevel;
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

	public String getMajorName() {
		return this.majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<StudentEducationDetail> getStudentEducationDetails() {
		return this.studentEducationDetails;
	}

	public void setStudentEducationDetails(List<StudentEducationDetail> studentEducationDetails) {
		this.studentEducationDetails = studentEducationDetails;
	}

	public StudentEducationDetail addStudentEducationDetail(StudentEducationDetail studentEducationDetail) {
		getStudentEducationDetails().add(studentEducationDetail);
		studentEducationDetail.setMajor(this);

		return studentEducationDetail;
	}

	public StudentEducationDetail removeStudentEducationDetail(StudentEducationDetail studentEducationDetail) {
		getStudentEducationDetails().remove(studentEducationDetail);
		studentEducationDetail.setMajor(null);

		return studentEducationDetail;
	}

}