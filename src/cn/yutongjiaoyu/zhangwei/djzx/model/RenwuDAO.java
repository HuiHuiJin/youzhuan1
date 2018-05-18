package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for Renwu
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Renwu
 * @author MyEclipse Persistence Tools
 */
public class RenwuDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(RenwuDAO.class);
	// property constants
	public static final String RENWUMING = "renwuming";
	public static final String RENWUXIANGXI = "renwuxiangxi";

	public void save(Renwu transientInstance) {
		log.debug("saving Renwu instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Renwu persistentInstance) {
		log.debug("deleting Renwu instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Renwu findById(java.lang.Integer id) {
		log.debug("getting Renwu instance with id: " + id);
		try {
			Renwu instance = (Renwu) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Renwu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Renwu instance) {
		log.debug("finding Renwu instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.yutongjiaoyu.zhangwei.djzx.model.Renwu")
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
		log.debug("finding Renwu instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Renwu as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRenwuming(Object renwuming) {
		return findByProperty(RENWUMING, renwuming);
	}

	public List findByRenwuxiangxi(Object renwuxiangxi) {
		return findByProperty(RENWUXIANGXI, renwuxiangxi);
	}

	public List findAll() {
		log.debug("finding all Renwu instances");
		try {
			String queryString = "from Renwu";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Renwu merge(Renwu detachedInstance) {
		log.debug("merging Renwu instance");
		try {
			Renwu result = (Renwu) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Renwu instance) {
		log.debug("attaching dirty Renwu instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Renwu instance) {
		log.debug("attaching clean Renwu instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}