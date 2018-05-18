package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Caijibiao entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Caijibiao
 * @author MyEclipse Persistence Tools
 */
public class CaijibiaoDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CaijibiaoDAO.class);
	// property constants
	public static final String CAIJIBIAOMING = "caijibiaoming";
	public static final String SHUOMING = "shuoming";

	public void save(Caijibiao transientInstance) {
		log.debug("saving Caijibiao instance");
	
		try {
			
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		 
	}

	public void delete(Caijibiao persistentInstance) {
		log.debug("deleting Caijibiao instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Caijibiao findById(java.lang.Integer id) {
		log.debug("getting Caijibiao instance with id: " + id);
		try {
			Caijibiao instance = (Caijibiao) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Caijibiao", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Caijibiao instance) {
		log.debug("finding Caijibiao instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Caijibiao")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Caijibiao instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Caijibiao as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCaijibiaoming(Object caijibiaoming) {
		return findByProperty(CAIJIBIAOMING, caijibiaoming);
	}

	public List findByShuoming(Object shuoming) {
		return findByProperty(SHUOMING, shuoming);
	}

	public List findAll() {
		log.debug("finding all Caijibiao instances");
		try {
			String queryString = "from Caijibiao";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Caijibiao merge(Caijibiao detachedInstance) {
		log.debug("merging Caijibiao instance");
		try {
			Caijibiao result = (Caijibiao) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Caijibiao instance) {
		log.debug("attaching dirty Caijibiao instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Caijibiao instance) {
		log.debug("attaching clean Caijibiao instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}