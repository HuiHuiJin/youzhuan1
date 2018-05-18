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
 * Shipinfenlei entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Shipinfenlei
 * @author MyEclipse Persistence Tools
 */
public class ShipinfenleiDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ShipinfenleiDAO.class);
	// property constants
	public static final String FENLEIMING = "fenleiming";
	public static final String FENLEIJIESHAO = "fenleijieshao";

	public void save(Shipinfenlei transientInstance) {
		log.debug("saving Shipinfenlei instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Shipinfenlei persistentInstance) {
		log.debug("deleting Shipinfenlei instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Shipinfenlei findById(java.lang.Integer id) {
		log.debug("getting Shipinfenlei instance with id: " + id);
		try {
			Shipinfenlei instance = (Shipinfenlei) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Shipinfenlei", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Shipinfenlei instance) {
		log.debug("finding Shipinfenlei instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Shipinfenlei")
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
		log.debug("finding Shipinfenlei instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Shipinfenlei as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFenleiming(Object fenleiming) {
		return findByProperty(FENLEIMING, fenleiming);
	}

	public List findByFenleijieshao(Object fenleijieshao) {
		return findByProperty(FENLEIJIESHAO, fenleijieshao);
	}

	public List findAll() {
		log.debug("finding all Shipinfenlei instances");
		try {
			String queryString = "from Shipinfenlei";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Shipinfenlei merge(Shipinfenlei detachedInstance) {
		log.debug("merging Shipinfenlei instance");
		try {
			Shipinfenlei result = (Shipinfenlei) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Shipinfenlei instance) {
		log.debug("attaching dirty Shipinfenlei instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Shipinfenlei instance) {
		log.debug("attaching clean Shipinfenlei instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}