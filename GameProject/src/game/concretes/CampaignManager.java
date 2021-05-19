package game.concretes;

import game.abstracts.CampaignService;
import game.entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void Add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " eklendi");
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " güncellendi");
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " silindi");
		
	}

}
