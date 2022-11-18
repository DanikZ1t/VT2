package Lab2.service;

import Lab2.service.implem.ApplianceServiceImpl;
import Lab2.service.implem.HelperServiceImpl;
import Lab2.service.implem.JAXBServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final ApplianceService applianceService = new ApplianceServiceImpl();

	private final HelperService helperService = new HelperServiceImpl();

	private final JAXBService jAXBService = new JAXBServiceImpl();

	private ServiceFactory() {
	}

	public JAXBService getJAXBService() {
		return jAXBService;
	}

	public ApplianceService getApplianceService() {
		return applianceService;
	}

	public HelperService getHelperService() {
		return helperService;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

}

