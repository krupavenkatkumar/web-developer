package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Dept {
private int deptno;
private String dName;
private String Loc;
@Override
public String toString() {
	return "Dept [deptno=" + deptno + ", dname=" + dName + ", loc=" + Loc + "]";
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public String getLoc() {
	return Loc;
}
public void setLoc(String loc) {
	Loc = loc;
}

}
