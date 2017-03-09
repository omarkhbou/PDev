package services;

import javax.ejb.Remote;

import entities.Complaint;

@Remote
public interface ComplaintManagementEJBRemote {
	
	public void addComplaint(Complaint c);
	public Complaint findComplaintById(int id);
	public java.util.List<Complaint> findAllComplaints();
	public Complaint findComplaintByState(String state);
	public void treatComplaint(int id);
	public void updateComplaint(Complaint c);

}
