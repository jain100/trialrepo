package com.example.demo.resources;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.APPPACKAGETEST;
import com.example.demo.model.appPackageRepo;
import com.example.demo.model.userAppPackage;
import com.example.demo.model.userAppRepo;
import com.example.demo.model.userappmodel;


@Service
public class TrellService {

	//private Map<String,Boolean> appMap;

	@Autowired
	private appPackageRepo apppackagerepo;
	@Autowired
	private userAppRepo userapprepo;

	public void createMapping(userappmodel user) {
		int inputid = Integer.parseInt(user.getUserId());
//		userAppPackage usr=new userAppPackage(inputid);
		List<APPPACKAGETEST> apps = new ArrayList<>();
		List<String> inputapps = Arrays.asList(user.getAppnames().split("\\s*,\\s*"));
      	List<userAppPackage> users=new ArrayList<>();
		for (String i : inputapps) {
			APPPACKAGETEST A = apppackagerepo.findByPackagename(i);
			if (A != null) {
				int appid = A.getId();
				List<userAppPackage> checkuser=A.getUserapppackage();
				boolean userexists=false;
				for(userAppPackage u:checkuser){
					if(u.getUserid()==inputid) {
						userexists = true;
						break;
					}
				}
				if(userexists==false) {
					userapprepo.save(new userAppPackage(inputid, appid));
					users =userapprepo.findByAppid(apppackagerepo.findByPackagename(i).getId());
					A.setUserapppackage(users);
					apppackagerepo.save(A);
				}
			} else {
				apppackagerepo.save(new APPPACKAGETEST(i));
				A = apppackagerepo.findByPackagename(i);
				userapprepo.save(new userAppPackage(inputid, apppackagerepo.findByPackagename(i).getId()));
				users=userapprepo.findByAppid(apppackagerepo.findByPackagename(i).getId());
				apppackagerepo.findByPackagename(i).setUserapppackage(users);
				apppackagerepo.save(A);
			}


//		}
//		usr.setApppackagetest(apps);
//		userapprepo.save(usr);
		}
	}
}

	

