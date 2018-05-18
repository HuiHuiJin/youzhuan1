package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * YonghuJuese entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.YonghuJuese
 * @author MyEclipse Persistence Tools
 */
public class YonghuJueseDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(YonghuJueseDAO.class);

	// property constants

	public void save(YonghuJuese transientInstance) {
		log.debug("saving YonghuJuese instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(YonghuJuese persistentInstance) {
		log.debug("deleting YonghuJuese instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public YonghuJuese findById(java.lang.Integer id) {
		log.debug("getting YonghuJuese instance with id: " + id);
		try {
			YonghuJuese instance = (YonghuJuese) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.YonghuJuese", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(YonghuJuese instance) {
		log.debug("finding YonghuJuese instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.YonghuJuese")
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
		log.debug("finding YonghuJuese instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from YonghuJuese as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all YonghuJuese instances");
		try {
			String queryString = "from YonghuJuese";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public YonghuJuese merge(YonghuJuese detachedInstance) {
		log.debug("merging YonghuJuese instance");
		try {
			YonghuJuese result = (YonghuJuese) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(YonghuJuese instance) {
		log.debug("attaching dirty YonghuJuese instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(YonghuJuese instance) {
		log.debug("attaching clean YonghuJuese instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}