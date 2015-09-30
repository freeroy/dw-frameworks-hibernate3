package org.developerworld.frameworks.hibernate3.support.dbsource.dynamic.cache.ehcache;

import net.sf.ehcache.hibernate.EhCacheRegionFactory;

import org.developerworld.frameworks.hibernate3.support.dbsource.dynamic.cache.DynamicDataSourceRegionFactory;

/**
 * 针对ehcache的动态数据源工厂
 * @author Roy Huang
 * @version 20140219
 *
 */
public class EhCacheDynamicDataSourceRegionFactory extends DynamicDataSourceRegionFactory{
	
	public EhCacheDynamicDataSourceRegionFactory(){
		super(new EhCacheRegionFactory(null));
	}
}
