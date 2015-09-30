package org.developerworld.frameworks.hibernate3.support.dbsource.dynamic.cache;

import org.hibernate.cache.CacheDataDescription;
import org.hibernate.cache.TransactionalDataRegion;

/**
 * 动态数据源事务数据缓存
 * @author Roy Huang
 * @version 20111011
 *
 */
public class DynamicDataSourceTransactionalDataRegion extends DynamicDataSourceRegion implements TransactionalDataRegion {

	TransactionalDataRegion transactionalDataRegion;
	
	protected DynamicDataSourceTransactionalDataRegion(TransactionalDataRegion transactionalDataRegion) {
		super(transactionalDataRegion);
		this.transactionalDataRegion=transactionalDataRegion;
	}

	public boolean isTransactionAware() {
		return transactionalDataRegion.isTransactionAware();
	}

	public CacheDataDescription getCacheDataDescription() {
		return transactionalDataRegion.getCacheDataDescription();
	}

}
