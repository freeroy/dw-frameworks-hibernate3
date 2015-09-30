package org.developerworld.frameworks.hibernate3.support.dbsource.dynamic.cache;

import org.hibernate.cache.TimestampsRegion;

/**
 * 动态数据源日期时间缓存
 * 
 * @author Roy Huang
 * @version 20111011
 * 
 */
public class DynamicDataSourceTimestampsRegion extends
		DynamicDataSourceGeneralDataRegion implements TimestampsRegion {

	private DynamicDataSourceTimestampsRegion(TimestampsRegion timestampsRegion) {
		super(timestampsRegion);
	}

	public static TimestampsRegion wrap(TimestampsRegion buildTimestampsRegion) {
		if (!(buildTimestampsRegion instanceof DynamicDataSourceTimestampsRegion))
			buildTimestampsRegion = new DynamicDataSourceTimestampsRegion(
					buildTimestampsRegion);
		return buildTimestampsRegion;
	}

}
