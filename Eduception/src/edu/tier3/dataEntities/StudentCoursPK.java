package edu.tier3.dataEntities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the student_courses database table.
 * 
 */
@Embeddable
public class StudentCoursPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="student_id", insertable=false, updatable=false)
	private int studentId;

	@Column(name="course_name")
	private String courseName;

	public StudentCoursPK() {
	}
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCourseName() {
		return this.courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StudentCoursPK)) {
			return false;
		}
		StudentCoursPK castOther = (StudentCoursPK)other;
		return 
			(this.studentId == castOther.studentId)
			&& this.courseName.equals(castOther.courseName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.studentId;
		hash = hash * prime + this.courseName.hashCode();
		
		return hash;
	}
}