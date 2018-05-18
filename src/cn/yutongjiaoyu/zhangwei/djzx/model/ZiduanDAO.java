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
 * Ziduan entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Ziduan
 * @author MyEclipse Persistence Tools
 */
public class ZiduanDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ZiduanDAO.class);
	// property constants
	public static final String ZIDUANMING = "ziduanming";
	public static final String CHANGDU = "changdu";
	public static final String BEIZHU = "beizhu";

	public void save(Ziduan transientInstance) {
		log.debug("saving Ziduan instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ziduan persistentInstance) {
		log.debug("deleting Ziduan instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ziduan findById(java.lang.Integer id) {
		log.debug("getting Ziduan instance with id: " + id);
		try {
			Ziduan instance = (Ziduan) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Ziduan", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ziduan instance) {
		log.debug("finding Ziduan instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Ziduan")
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
		log.debug("finding Ziduan instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ziduan as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByZiduanming(Object ziduanming) {
		return findByProperty(ZIDUANMING, ziduanming);
	}

	public List findByChangdu(Object changdu) {
		return findByProperty(CHANGDU, changdu);
	}

	public List findByBeizhu(Object beizhu) {
		return findByProperty(BEIZHU, beizhu);
	}

	public List findAll() {
		log.debug("finding all Ziduan instances");
		try {
			String queryString = "from Ziduan";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ziduan merge(Ziduan detachedInstance) {
		log.debug("merging Ziduan instance");
		try {
			Ziduan result = (Ziduan) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ziduan instance) {
		log.debug("attaching dirty Ziduan instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ziduan instance) {
		log.debug("attaching clean Ziduan instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}