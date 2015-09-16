package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="User.findAll", query="SELECT u FROM User u"),
	@NamedQuery(name="User.findByUsername", query="SELECT u FROM User u where u.uName = :username")
})
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int uid;

	@Column(name="actv_in")
	private String actvIn;

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

	private String password;

	@Column(name="role_id")
	private int roleId;

	@Column(name="u_name")
	private String uName;

	//bi-directional many-to-one association to Company
	@OneToMany(mappedBy="user")
	private List<Company> companies;

	//bi-directional many-to-one association to Department
	@OneToMany(mappedBy="user")
	private List<Department> departments;

	//bi-directional many-to-one association to Professor
	@OneToMany(mappedBy="user")
	private List<Professor> professors;

	//bi-directional many-to-one association to School
	@OneToMany(mappedBy="user")
	private List<School> schools;

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="user")
	private List<Student> students;

	//bi-directional many-to-one association to StudentAchievement
	@OneToMany(mappedBy="user")
	private List<StudentAchievement> studentAchievements;

	//bi-directional many-to-one association to StudentEducationDetail
	@OneToMany(mappedBy="user")
	private List<StudentEducationDetail> studentEducationDetails;

	//bi-directional many-to-one association to StudentLeadership
	@OneToMany(mappedBy="user")
	private List<StudentLeadership> studentLeaderships;

	//bi-directional many-to-one association to University
	@OneToMany(mappedBy="user")
	private List<University> universities;

	//bi-directional one-to-one association to UserDetail
	@OneToOne(mappedBy="user")
	private UserDetail userDetail;

	public User() {
	}

	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getUName() {
		return this.uName;
	}

	public void setUName(String uName) {
		this.uName = uName;
	}

	public List<Company> getCompanies() {
		return this.companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	public Company addCompany(Company company) {
		getCompanies().add(company);
		company.setUser(this);

		return company;
	}

	public Company removeCompany(Company company) {
		getCompanies().remove(company);
		company.setUser(null);

		return company;
	}

	public List<Department> getDepartments() {
		return this.departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Department addDepartment(Department department) {
		getDepartments().add(department);
		department.setUser(this);

		return department;
	}

	public Department removeDepartment(Department department) {
		getDepartments().remove(department);
		department.setUser(null);

		return department;
	}

	public List<Professor> getProfessors() {
		return this.professors;
	}

	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}

	public Professor addProfessor(Professor professor) {
		getProfessors().add(professor);
		professor.setUser(this);

		return professor;
	}

	public Professor removeProfessor(Professor professor) {
		getProfessors().remove(professor);
		professor.setUser(null);

		return professor;
	}

	public List<School> getSchools() {
		return this.schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

	public School addSchool(School school) {
		getSchools().add(school);
		school.setUser(this);

		return school;
	}

	public School removeSchool(School school) {
		getSchools().remove(school);
		school.setUser(null);

		return school;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student addStudent(Student student) {
		getStudents().add(student);
		student.setUser(this);

		return student;
	}

	public Student removeStudent(Student student) {
		getStudents().remove(student);
		student.setUser(null);

		return student;
	}

	public List<StudentAchievement> getStudentAchievements() {
		return this.studentAchievements;
	}

	public void setStudentAchievements(List<StudentAchievement> studentAchievements) {
		this.studentAchievements = studentAchievements;
	}

	public StudentAchievement addStudentAchievement(StudentAchievement studentAchievement) {
		getStudentAchievements().add(studentAchievement);
		studentAchievement.setUser(this);

		return studentAchievement;
	}

	public StudentAchievement removeStudentAchievement(StudentAchievement studentAchievement) {
		getStudentAchievements().remove(studentAchievement);
		studentAchievement.setUser(null);

		return studentAchievement;
	}

	public List<StudentEducationDetail> getStudentEducationDetails() {
		return this.studentEducationDetails;
	}

	public void setStudentEducationDetails(List<StudentEducationDetail> studentEducationDetails) {
		this.studentEducationDetails = studentEducationDetails;
	}

	public StudentEducationDetail addStudentEducationDetail(StudentEducationDetail studentEducationDetail) {
		getStudentEducationDetails().add(studentEducationDetail);
		studentEducationDetail.setUser(this);

		return studentEducationDetail;
	}

	public StudentEducationDetail removeStudentEducationDetail(StudentEducationDetail studentEducationDetail) {
		getStudentEducationDetails().remove(studentEducationDetail);
		studentEducationDetail.setUser(null);

		return studentEducationDetail;
	}

	public List<StudentLeadership> getStudentLeaderships() {
		return this.studentLeaderships;
	}

	public void setStudentLeaderships(List<StudentLeadership> studentLeaderships) {
		this.studentLeaderships = studentLeaderships;
	}

	public StudentLeadership addStudentLeadership(StudentLeadership studentLeadership) {
		getStudentLeaderships().add(studentLeadership);
		studentLeadership.setUser(this);

		return studentLeadership;
	}

	public StudentLeadership removeStudentLeadership(StudentLeadership studentLeadership) {
		getStudentLeaderships().remove(studentLeadership);
		studentLeadership.setUser(null);

		return studentLeadership;
	}

	public List<University> getUniversities() {
		return this.universities;
	}

	public void setUniversities(List<University> universities) {
		this.universities = universities;
	}

	public University addUniversity(University university) {
		getUniversities().add(university);
		university.setUser(this);

		return university;
	}

	public University removeUniversity(University university) {
		getUniversities().remove(university);
		university.setUser(null);

		return university;
	}

	public UserDetail getUserDetail() {
		return this.userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}