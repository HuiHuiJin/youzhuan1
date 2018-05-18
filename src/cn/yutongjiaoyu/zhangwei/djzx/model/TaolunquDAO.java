package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Taolunqu entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Taolunqu
 * @author MyEclipse Persistence Tools
 */
public class TaolunquDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TaolunquDAO.class);
	// property constants
	public static final String NEIRONG = "neirong";

	public void save(Taolunqu transientInstance) {
		log.debug("saving Taolunqu instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Taolunqu persistentInstance) {
		log.debug("deleting Taolunqu instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Taolunqu findById(java.lang.Integer id) {
		log.debug("getting Taolunqu instance with id: " + id);
		try {
			Taolunqu instance = (Taolunqu) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Taolunqu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Taolunqu instance) {
		log.debug("finding Taolunqu instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Taolunqu")
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
		log.debug("finding Taolunqu instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Taolunqu as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNeirong(Object neirong) {
		return findByProperty(NEIRONG, neirong);
	}

	public List findAll() {
		log.debug("finding all Taolunqu instances");
		try {
			String queryString = "from Taolunqu";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Taolunqu merge(Taolunqu detachedInstance) {
		log.debug("merging Taolunqu instance");
		try {
			Taolunqu result = (Taolunqu) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Taolunqu instance) {
		log.debug("attaching dirty Taolunqu instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Taolunqu instance) {
		log.debug("attaching clean Taolunqu instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}