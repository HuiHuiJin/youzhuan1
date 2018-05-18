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
 * Xinxilei entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Xinxilei
 * @author MyEclipse Persistence Tools
 */
public class XinxileiDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(XinxileiDAO.class);
	// property constants
	public static final String XINXILEIMING = "xinxileiming";
	public static final String XINXISHUOMING = "xinxishuoming";

	public void save(Xinxilei transientInstance) {
		log.debug("saving Xinxilei instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xinxilei persistentInstance) {
		log.debug("deleting Xinxilei instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xinxilei findById(java.lang.Integer id) {
		log.debug("getting Xinxilei instance with id: " + id);
		try {
			Xinxilei instance = (Xinxilei) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Xinxilei", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xinxilei instance) {
		log.debug("finding Xinxilei instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Xinxilei")
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
		log.debug("finding Xinxilei instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Xinxilei as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByXinxileiming(Object xinxileiming) {
		return findByProperty(XINXILEIMING, xinxileiming);
	}

	public List findByXinxishuoming(Object xinxishuoming) {
		return findByProperty(XINXISHUOMING, xinxishuoming);
	}

	public List findAll() {
		log.debug("finding all Xinxilei instances");
		try {
			String queryString = "from Xinxilei";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xinxilei merge(Xinxilei detachedInstance) {
		log.debug("merging Xinxilei instance");
		try {
			Xinxilei result = (Xinxilei) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xinxilei instance) {
		log.debug("attaching dirty Xinxilei instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xinxilei instance) {
		log.debug("attaching clean Xinxilei instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}