package com.wmz.di06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Some {
	
	private School[] schools;
	private String[] arrs;
	
	private List<String> mylist;
	private Set<String> myset;
	private Map<String, Object> mymap;
	private Properties mypros;
	
	public String[] getArrs() {
		return arrs;
	}
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	public School[] getSchools() {
		return schools;
	}
	public void setSchools(School[] schools) {
		this.schools = schools;
	}
	public List<String> getMylist() {
		return mylist;
	}
	public void setMylist(List<String> mylist) {
		this.mylist = mylist;
	}
	public Set<String> getMyset() {
		return myset;
	}
	public void setMyset(Set<String> myset) {
		this.myset = myset;
	}
	public Map<String, Object> getMymap() {
		return mymap;
	}
	public void setMymap(Map<String, Object> mymap) {
		this.mymap = mymap;
	}
	public Properties getMypros() {
		return mypros;
	}
	public void setMypros(Properties mypros) {
		this.mypros = mypros;
	}
	@Override
	public String toString() {
		return "Some [schools=" + Arrays.toString(schools) + ", arrs=" + Arrays.toString(arrs) + ", mylist=" + mylist
				+ ", myset=" + myset + ", mymap=" + mymap + ", mypros=" + mypros + "]";
	}
	
	
}
