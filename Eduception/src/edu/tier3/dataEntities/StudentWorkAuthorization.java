package edu.tier3.dataEntities;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the student_work_authorization database table.
 * 
 */
@Entity
@Table(name="student_work_authorization")
@NamedQuery(name="StudentWorkAuthorization.findAll", query="SELECT s FROM StudentWorkAuthorization s")
@NamedQueries({
	@NamedQuery(name="StudentWorkAuthorization.findByStudentId", query="SELECT s FROM StudentWorkAuthorization s where s.student = :studentId")
})
public class StudentWorkAuthorization implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StudentWorkAuthorizationPK id;

	@Column(name="actv_in")
	private String actvIn;

	private String country;

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

	//bi-directional many-to-one association to WorkAuthorizationType
	@ManyToOne
	@JoinColumn(name="authorization_type_id")
	private WorkAuthorizationType workAuthorizationType;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	public StudentWorkAuthorization() {
	}

	public StudentWorkAuthorizationPK getId() {
		return this.id;
	}

	public void setId(StudentWorkAuthorizationPK id) {
		this.id = id;
	}

	public String getActvIn() {
		return this.actvIn;
	}

	public void setActvIn(String actvIn) {
		this.actvIn = actvIn;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public WorkAuthorizationType getWorkAuthorizationType() {
		return this.workAuthorizationType;
	}

	public void setWorkAuthorizationType(WorkAuthorizationType workAuthorizationType) {
		this.workAuthorizationType = workAuthorizationType;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}