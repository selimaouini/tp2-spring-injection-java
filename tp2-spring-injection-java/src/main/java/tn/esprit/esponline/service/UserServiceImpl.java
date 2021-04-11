package tn.esprit.esponline.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.esponline.dao.IUserDAO;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDAO userDAO;

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	
	
}
