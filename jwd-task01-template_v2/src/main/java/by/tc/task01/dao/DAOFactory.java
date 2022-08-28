package by.tc.task01.dao;

import by.tc.task01.dao.impl.FileApplianceDAOImpl;
import by.tc.task01.dao.impl.SQLApplianceDAOImpl;

public final class DAOFactory {

	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO applianceDAO = new FileApplianceDAOImpl();
	private final ApplianceDAO sqlApplianceDAO = new SQLApplianceDAOImpl();

	private DAOFactory() {
	}

	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	public ApplianceDAO getSQLApplianceDAO() {
		return sqlApplianceDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}
