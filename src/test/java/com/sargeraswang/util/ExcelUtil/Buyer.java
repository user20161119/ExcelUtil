package com.sargeraswang.util.ExcelUtil;

import com.sargeraswang.util.ExcelUtil.ExcelCell.Valid;

/**
 * Date: 2017年2月13日 下午5:54:15
 * 
 * @author lou jian wen
 */
public class Buyer {


  @Override
  public String toString() {
    return "Buyer [buyerName=" + buyerName + ", contact_person=" + contact_person
        + ", contactPhone=" + contactPhone + ", external_no=" + external_no + ", address=" + address
        + ", remark=" + remark + "]";
  }

  @ExcelCell(index=0,valid=@Valid(allowNull=false))
  private String buyerName;

  @ExcelCell(index=1,valid=@Valid(allowNull=false))
  private String contact_person;

  @ExcelCell(index=2,valid=@Valid(allowNull=false))
  private String contactPhone;

  @ExcelCell(index=3,valid=@Valid(allowNull=true))
  private String external_no;

  @ExcelCell(index=4,valid=@Valid(allowNull=false))
  private String address;

  @ExcelCell(index=5,valid=@Valid(allowNull=true))
  private String remark;


  public String getBuyerName() {
    return buyerName;
  }

  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }

  public String getContact_person() {
    return contact_person;
  }

  public void setContact_person(String contact_person) {
    this.contact_person = contact_person;
  }

  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public String getExternal_no() {
    return external_no;
  }

  public void setExternal_no(String external_no) {
    this.external_no = external_no;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }



}

