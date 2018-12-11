package com.taotao.portal.service;

import com.taotao.portal.pojo.SearchResult;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 21:46 2018/2/25
 */
public interface SearchService {
        SearchResult search(String queryString, int page);
}
