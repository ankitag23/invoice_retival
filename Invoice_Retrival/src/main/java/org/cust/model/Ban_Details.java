package org.cust.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Ban_Details {
	
	@Id
	@Column(name = "ban_detail_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ban_detail_id;
	
	@Column(name = "Ban_number")
	String Ban_number;
	@Column(name = "cycle_year")
	int cycle_year;
	@Column(name = "cycle_code")
	int cycle_code;
	@Column(name = "cycle_month")
	int cycle_month;
	
	@Column(name = "totaL_amoun_due")
	float totaL_amoun_due;
	
	@Column(name = "payment_recived")
	float payment_recived ;
	
	@Column(name = "rc_amount")
	float rc_amount;
	
	@Column(name = "oc_amount")
	float oc_amount;
	
	@Column(name = "uc_amount")
	float uc_amount;

	
	public Ban_Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ban_Details(int ban_detail_id, String ban_number, int cycle_year, int cycle_code, int cycle_month,
			float totaL_amoun_due, float payment_recived, float rc_amount, float oc_amount, float uc_amount) {
		super();
		this.ban_detail_id = ban_detail_id;
		Ban_number = ban_number;
		this.cycle_year = cycle_year;
		this.cycle_code = cycle_code;
		this.cycle_month = cycle_month;
		this.totaL_amoun_due = totaL_amoun_due;
		this.payment_recived = payment_recived;
		this.rc_amount = rc_amount;
		this.oc_amount = oc_amount;
		this.uc_amount = uc_amount;
	}

	public int getBan_detail_id() {
		return ban_detail_id;
	}

	public void setBan_detail_id(int ban_detail_id) {
		this.ban_detail_id = ban_detail_id;
	}

	public String getBan_number() {
		return Ban_number;
	}

	public void setBan_number(String ban_number) {
		Ban_number = ban_number;
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

	public float getTotaL_amoun_due() {
		return totaL_amoun_due;
	}

	public void setTotaL_amoun_due(float totaL_amoun_due) {
		this.totaL_amoun_due = totaL_amoun_due;
	}

	public float getPayment_recived() {
		return payment_recived;
	}

	public void setPayment_recived(float payment_recived) {
		this.payment_recived = payment_recived;
	}

	public float getRc_amount() {
		return rc_amount;
	}

	public void setRc_amount(float rc_amount) {
		this.rc_amount = rc_amount;
	}

	public float getOc_amount() {
		return oc_amount;
	}

	public void setOc_amount(float oc_amount) {
		this.oc_amount = oc_amount;
	}

	public float getUc_amount() {
		return uc_amount;
	}

	public void setUc_amount(float uc_amount) {
		this.uc_amount = uc_amount;
	}

	@Override
	public String toString() {
		return "Ban_Details [ban_detail_id=" + ban_detail_id + ", Ban_number=" + Ban_number + ", cycle_year="
				+ cycle_year + ", cycle_code=" + cycle_code + ", cycle_month=" + cycle_month + ", totaL_amoun_due="
				+ totaL_amoun_due + ", payment_recived=" + payment_recived + ", rc_amount=" + rc_amount + ", oc_amount="
				+ oc_amount + ", uc_amount=" + uc_amount + "]";
	}
	

}
