package game;

import java.time.LocalDate;

import game.concretes.CampaignManager;
import game.concretes.EGovPlayerValidation;
import game.concretes.GameManager;
import game.concretes.OrderManager;
import game.concretes.PlayerManager;
import game.entities.Campaign;
import game.entities.Game;
import game.entities.Player;


public class Main {

	public static void main(String[] args) {
		
		 // oyunlar
        Game game1 = new Game(1,"SEGA PC Football Manager 2021",249,"PC Consol","Spor","5055277040483");
    
        GameManager gameManager = new GameManager();
        gameManager.Add(game1);
        gameManager.Add(new Game (2,"ACTIVISION Call Of Duty Siyah OPS 4",299, "Oyun CD","Spor","5030917257261"));


        //Kampanya Ekleme

        Campaign campaign1 = new Campaign(1,"Yýlbaþý Kampanyasý",40,LocalDate.of(2020, 12, 15),LocalDate.of(2021, 01, 01));

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.Add(campaign1);
        campaignManager.Add(new Campaign( 2,"14 Þubat Kampanyasý",25, LocalDate.of(2021, 2, 8),LocalDate.of(2021, 2, 15)));
        
        campaignManager.Update(campaign1);


        // oyuncu ekleme
        Player player1 = new Player(1,"Ezgi","Mola",1980,Long.parseLong("67557888521"));

        PlayerManager playerManager = new PlayerManager(new EGovPlayerValidation());
        playerManager.Add(player1);
        playerManager.Add(new Player(2,"Berkan","Karabulut",1987, Long.parseLong("45367557190") ));

      
        // kayýt baþarýlý ise oyun satýn al.
        if (playerManager.isSuccess) {

        	playerManager.List();

            System.out.println("\n SATILAN OYUNLAR ");
            OrderManager orderManager = new OrderManager();
            orderManager.Order(player1, game1, campaign1);
        }


	}

}
