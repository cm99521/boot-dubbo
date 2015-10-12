package boot.dubbo.simple.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import boot.dubbo.api.Application;
import boot.dubbo.api.PAIService;

import com.alibaba.dubbo.config.annotation.Service;

@Service(protocol = { "rest", "webservice", "rmi" })
public class PAIServiceImpl implements PAIService {

	private static Map<Integer, Application> apps = new ConcurrentHashMap<Integer, Application>();
	static {
		Application app1 = new Application(1, "SOM", "Gavin");
		Application app2 = new Application(2, "ELK", "Gavin");
		apps.put(app1.getAppId(), app1);
		apps.put(app2.getAppId(), app2);
	}

	@Override
	public List<Application> listApps() {
		return new ArrayList<Application>(apps.values());
	}

}
