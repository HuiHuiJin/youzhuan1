package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for Juese
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Juese
 * @author MyEclipse Persistence Tools
 */
public class JueseDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(JueseDAO.class);
	// property constants
	public static final String JUESEMING = "jueseming";
	public static final String JUESEJIESHAO = "juesejieshao";

	public void save(Juese transientInstance) {
		log.debug("saving Juese instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Juese persistentInstance) {
		log.debug("deleting Juese instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Juese findById(java.lang.Integer id) {
		log.debug("getting Juese instance with id: " + id);
		try {
			Juese instance = (Juese) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Juese", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Juese instance) {
		log.debug("finding Juese instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.yutongjiaoyu.zhangwei.djzx.model.Juese")
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
		log.debug("finding Juese instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Juese as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByJueseming(Object jueseming) {
		return findByProperty(JUESEMING, jueseming);
	}

	public List findByJuesejieshao(Object juesejieshao) {
		return findByProperty(JUESEJIESHAO, juesejieshao);
	}

	public List findAll() {
		log.debug("finding all Juese instances");
		try {
			String queryString = "from Juese";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Juese merge(Juese detachedInstance) {
		log.debug("merging Juese instance");
		try {
			Juese result = (Juese) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Juese instance) {
		log.debug("attaching dirty Juese instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Juese instance) {
		log.debug("attaching clean Juese instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}