package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Juesequanxian entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Juesequanxian
 * @author MyEclipse Persistence Tools
 */
public class JuesequanxianDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(JuesequanxianDAO.class);
	// property constants
	public static final String CAOZUOBIAO = "caozuobiao";
	public static final String QUANXIAN = "quanxian";

	public void save(Juesequanxian transientInstance) {
		log.debug("saving Juesequanxian instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Juesequanxian persistentInstance) {
		log.debug("deleting Juesequanxian instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Juesequanxian findById(java.lang.Integer id) {
		log.debug("getting Juesequanxian instance with id: " + id);
		try {
			Juesequanxian instance = (Juesequanxian) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Juesequanxian", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Juesequanxian instance) {
		log.debug("finding Juesequanxian instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Juesequanxian")
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
		log.debug("finding Juesequanxian instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Juesequanxian as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCaozuobiao(Object caozuobiao) {
		return findByProperty(CAOZUOBIAO, caozuobiao);
	}

	public List findByQuanxian(Object quanxian) {
		return findByProperty(QUANXIAN, quanxian);
	}

	public List findAll() {
		log.debug("finding all Juesequanxian instances");
		try {
			String queryString = "from Juesequanxian";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Juesequanxian merge(Juesequanxian detachedInstance) {
		log.debug("merging Juesequanxian instance");
		try {
			Juesequanxian result = (Juesequanxian) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Juesequanxian instance) {
		log.debug("attaching dirty Juesequanxian instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Juesequanxian instance) {
		log.debug("attaching clean Juesequanxian instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}