package com.company;

import java.util.Date;

public class Transaction {
    Integer tranId;
    Integer memberId;
    String bookTitle;
    Date dueDate;

    public Transaction(){

    }

    public Transaction(Integer tranId, Integer memberId, String bookTitle, Date dueDate) {
        this.tranId = tranId;
        this.memberId = memberId;
        this.bookTitle = bookTitle;
        this.dueDate = dueDate;
    }

    public void createTran(){

    }

    public void DeleteTran(){

    }

    public Integer getTranId() {
        return tranId;
    }

    public void setTranId(Integer tranId) {
        this.tranId = tranId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
