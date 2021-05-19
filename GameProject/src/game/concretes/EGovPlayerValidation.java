package game.concretes;

import java.rmi.RemoteException;

import game.abstracts.PlayerCheckService;
import game.entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class EGovPlayerValidation implements PlayerCheckService {

	@Override
	public boolean Validate(Player player) {
		boolean result;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			result= client.TCKimlikNoDogrula(player.getIdentitiyNumber(), player.getFirstName().toUpperCase(),
					player.getLastName().toUpperCase(), player.getBirthYear());
		} catch (NumberFormatException e) {
			result = false;
			e.printStackTrace();
		} catch (RemoteException e) {
			result=false;
			e.printStackTrace();
		}
		
		return result;
	}

}
