package org.cust.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ban_archive")
public class Ban_archive {
	@Id
	@Column(name = "ban_arch_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ban_arch_id;

	@Column(name = "Ban_number")
	String Ban_number;

	@Column(name = "invocice_path")
	String invocice_path;
	@Column(name = "cycle_year")
	int cycle_year;
	@Column(name = "cycle_code")
	int cycle_code;
	@Column(name = "cycle_month")
	int cycle_month;
	@Column(name = "region")

	String region;

	public Ban_archive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ban_archive(int ban_arch_id, String ban_number, String invocice_path, int cycle_year, int cycle_code,
			int cycle_month, String region) {
		super();
		this.ban_arch_id = ban_arch_id;
		Ban_number = ban_number;
		this.invocice_path = invocice_path;
		this.cycle_year = cycle_year;
		this.cycle_code = cycle_code;
		this.cycle_month = cycle_month;
		this.region = region;
	}

	public int getBan_arch_id() {
		return ban_arch_id;
	}

	public void setBan_arch_id(int ban_arch_id) {
		this.ban_arch_id = ban_arch_id;
	}

	public String getBan_number() {
		return Ban_number;
	}

	public void setBan_number(String ban_number) {
		Ban_number = ban_number;
	}

	public String getInvocice_path() {
		return invocice_path;
	}

	public void setInvocice_path(String invocice_path) {
		this.invocice_path = invocice_path;
	}

	public int getCycle_year() {
		return cycle_year;
	}

	public void setCycle_year(int cycle_year) {
		this.cycle_year = cycle_year;
	}

	public int getCycle_code() {
		return cycle_code;
	}

	public void setCycle_code(int cycle_code) {
		this.cycle_code = cycle_code;
	}

	public int getCycle_month() {
		return cycle_month;
	}

	public void setCycle_month(int cycle_month) {
		this.cycle_month = cycle_month;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Ban_archive [ban_arch_id=" + ban_arch_id + ", Ban_number=" + Ban_number + ", invocice_path="
				+ invocice_path + ", cycle_year=" + cycle_year + ", cycle_code=" + cycle_code + ", cycle_month="
				+ cycle_month + ", region=" + region + "]";
	}

}
