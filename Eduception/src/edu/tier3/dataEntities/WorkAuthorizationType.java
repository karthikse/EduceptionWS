package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the work_authorization_type database table.
 * 
 */
@Entity
@Table(name="work_authorization_type")
@NamedQuery(name="WorkAuthorizationType.findAll", query="SELECT w FROM WorkAuthorizationType w")
public class WorkAuthorizationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="authorization_id")
	private int authorizationId;

	@Column(name="actv_in")
	private String actvIn;

	@Column(name="authorization_name")
	private String authorizationName;

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

	//bi-directional many-to-one association to StudentWorkAuthorization
	@OneToMany(mappedBy="workAuthorizationType")
	private List<StudentWorkAuthorization> studentWorkAuthorizations;

	public WorkAuthorizationType() {
	}

	public int getAuthorizationId() {
		return this.authorizationId;
	}

	public void setAuthorizationId(int authorizationId) {
		this.authorizationId = authorizationId;
	}

	public String getActvIn() {
		return this.actvIn;
	}

	public void setActvIn(String actvIn) {
		this.actvIn = actvIn;
	}

	public String getAuthorizationName() {
		return this.authorizationName;
	}

	public void setAuthorizationName(String authorizationName) {
		this.authorizationName = authorizationName;
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

	public List<StudentWorkAuthorization> getStudentWorkAuthorizations() {
		return this.studentWorkAuthorizations;
	}

	public void setStudentWorkAuthorizations(List<StudentWorkAuthorization> studentWorkAuthorizations) {
		this.studentWorkAuthorizations = studentWorkAuthorizations;
	}

	public StudentWorkAuthorization addStudentWorkAuthorization(StudentWorkAuthorization studentWorkAuthorization) {
		getStudentWorkAuthorizations().add(studentWorkAuthorization);
		studentWorkAuthorization.setWorkAuthorizationType(this);

		return studentWorkAuthorization;
	}

	public StudentWorkAuthorization removeStudentWorkAuthorization(StudentWorkAuthorization studentWorkAuthorization) {
		getStudentWorkAuthorizations().remove(studentWorkAuthorization);
		studentWorkAuthorization.setWorkAuthorizationType(null);

		return studentWorkAuthorization;
	}

}