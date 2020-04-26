package nms.rib.service;

import net.named_data.jndn.Name;
import nms.rib.Route;

public interface RibService {

	public void addRoute(Route route, RibHandler handler);

	public void removeRoute(Route route, RibHandler handler);

}