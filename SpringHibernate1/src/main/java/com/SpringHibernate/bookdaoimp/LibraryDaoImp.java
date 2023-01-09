package com.SpringHibernate.bookdaoimp;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springhibernate.bookdao.LibraryDao;
import com.springhibernate.bookentity.Library;

public class LibraryDaoImp implements LibraryDao {
	
	private HibernateTemplate ht1;

	public HibernateTemplate getHt1() {
		return ht1;
	}

	public void setHt1(HibernateTemplate ht1) {
		this.ht1 = ht1;
	}

	@Transactional
	public int insertLibrary(Library lib) {
		ht1.save(lib);
		return 1;
	}

}
