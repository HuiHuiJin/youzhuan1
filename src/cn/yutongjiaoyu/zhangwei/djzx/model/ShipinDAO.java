package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Shipin entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Shipin
 * @author MyEclipse Persistence Tools
 */
public class ShipinDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ShipinDAO.class);
	// property constants
	public static final String SHIPINBIAOTI = "shipinbiaoti";
	public static final String SHIPINGONGZUORENYUAN = "shipingongzuorenyuan";
	public static final String SHIPINURI = "shipinuri";
	public static final String ZHUANGTAI = "zhuangtai";
	public static final String SHUOMING = "shuoming";

	public void save(Shipin transientInstance) {
		log.debug("saving Shipin instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Shipin persistentInstance) {
		log.debug("deleting Shipin instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Shipin findById(java.lang.Integer id) {
		log.debug("getting Shipin instance with id: " + id);
		try {
			Shipin instance = (Shipin) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Shipin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Shipin instance) {
		log.debug("finding Shipin instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Shipin")
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
		log.debug("finding Shipin instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Shipin as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByShipinbiaoti(Object shipinbiaoti) {
		return findByProperty(SHIPINBIAOTI, shipinbiaoti);
	}

	public List findByShipingongzuorenyuan(Object shipingongzuorenyuan) {
		return findByProperty(SHIPINGONGZUORENYUAN, shipingongzuorenyuan);
	}

	public List findByShipinuri(Object shipinuri) {
		return findByProperty(SHIPINURI, shipinuri);
	}

	public List findByZhuangtai(Object zhuangtai) {
		return findByProperty(ZHUANGTAI, zhuangtai);
	}

	public List findByShuoming(Object shuoming) {
		return findByProperty(SHUOMING, shuoming);
	}

	public List findAll() {
		log.debug("finding all Shipin instances");
		try {
			String queryString = "from Shipin";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Shipin merge(Shipin detachedInstance) {
		log.debug("merging Shipin instance");
		try {
			Shipin result = (Shipin) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Shipin instance) {
		log.debug("attaching dirty Shipin instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Shipin instance) {
		log.debug("attaching clean Shipin instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}