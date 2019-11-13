package factory;

import dao.*;
import dao.impl.*;

public class DAOFactory {
	
	public productDAO getProdutDAO() {
		return new productDAOImpl();
	}

	public order_pDAO getOrder_pDAO() {
		return new order_pDAOImpl();
	}
}
