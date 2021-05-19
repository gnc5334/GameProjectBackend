package game.entities;

import java.time.LocalDate;

public class Campaign {
	
	 private int Id;
	 private String CampaignName;
	 private double CampaignPercentDiscount;
	 private LocalDate StartDate;
	 private LocalDate EndDate;
	 
	public Campaign() {}
	
	public Campaign(int id, String campaignName, double campaignPercentDiscount, LocalDate startDate,
			LocalDate endDate) {
		super();
		Id = id;
		CampaignName = campaignName;
		CampaignPercentDiscount = campaignPercentDiscount;
		StartDate = startDate;
		EndDate = endDate;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCampaignName() {
		return CampaignName;
	}

	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}

	public double getCampaignPercentDiscount() {
		return CampaignPercentDiscount;
	}

	public void setCampaignPercentDiscount(double campaignPercentDiscount) {
		CampaignPercentDiscount = campaignPercentDiscount;
	}

	public LocalDate getStartDate() {
		return StartDate;
	}

	public void setStartDate(LocalDate startDate) {
		StartDate = startDate;
	}

	public LocalDate getEndDate() {
		return EndDate;
	}

	public void setEndDate(LocalDate endDate) {
		EndDate = endDate;
	} 

}
