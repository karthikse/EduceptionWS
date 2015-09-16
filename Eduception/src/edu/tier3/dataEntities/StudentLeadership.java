package edu.tier3.dataEntities;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the student_leadership database table.
 * 
 */
@Entity
@Table(name="student_leadership")
@NamedQuery(name="StudentLeadership.findAll", query="SELECT s FROM StudentLeadership s")
@NamedQueries({
	@NamedQuery(name="StudentLeadership.findByStudentId", query="SELECT s FROM StudentLeadership s where s.student = :studentId")
})
public class StudentLeadership implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StudentLeadershipPK id;

	@Column(name="actv_in")
	private String actvIn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_tz")
	private Date createdTz;

	@Column(name="created_uid")
	private int createdUid;

	@Column(name="defend_flag")
	private String defendFlag;

	@Column(name="defend_value")
	private String defendValue;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_modified_tz")
	private Date lastModifiedTz;

	@Column(name="last_modified_uid")
	private int lastModifiedUid;

	@Lob
	@Column(name="leadership_role_description")
	private byte[] leadershipRoleDescription;

	@Column(name="organization_name")
	private String organizationName;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="defend_id")
	private User user;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	public StudentLeadership() {
	}

	public StudentLeadershipPK getId() {
		return this.id;
	}

	public void setId(StudentLeadershipPK id) {
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

	public String getDefendValue() {
		return this.defendValue;
	}

	public void setDefendValue(String defendValue) {
		this.defendValue = defendValue;
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

	public byte[] getLeadershipRoleDescription() {
		return this.leadershipRoleDescription;
	}

	public void setLeadershipRoleDescription(byte[] leadershipRoleDescription) {
		this.leadershipRoleDescription = leadershipRoleDescription;
	}

	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}