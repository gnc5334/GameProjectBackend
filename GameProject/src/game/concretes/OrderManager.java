package game.concretes;

import game.abstracts.OrderService;
import game.entities.Campaign;
import game.entities.Game;
import game.entities.Player;

public class OrderManager implements OrderService {

	@Override
	public void Order(Player player, Game game, Campaign campaign) {
		
		double price = game.getGamePrice() - game.getGamePrice() * (campaign.getCampaignPercentDiscount() / 100);
        System.out.println(player.getFirstName() +" " + player.getLastName() +" "+ game.getGameName() + " oyununu satýn aldý. \n" +
            "Ýndrimli Oyun Fiyatý: " + price +"TL \n"+
            "Uygulanan Kampanya Ýndirimi: %" +campaign.getCampaignPercentDiscount() );
    
		
	}

}
