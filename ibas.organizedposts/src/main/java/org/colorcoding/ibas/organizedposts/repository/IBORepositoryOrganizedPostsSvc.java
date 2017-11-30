package org.colorcoding.ibas.organizedposts.repository;

import org.colorcoding.ibas.bobas.common.*;
import org.colorcoding.ibas.bobas.data.ArrayList;
import org.colorcoding.ibas.bobas.repository.*;
import org.colorcoding.ibas.organizedposts.bo.ownership.*;
import org.colorcoding.ibas.organizedposts.bo.position.*;
import org.colorcoding.ibas.organizedposts.bo.post.*;

/**
* OrganizedPosts仓库服务
*/
public interface IBORepositoryOrganizedPostsSvc extends IBORepositorySmartService {


    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-数据权限
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    OperationResult<Ownership> fetchOwnership(ICriteria criteria, String token);

    /**
     * 保存-数据权限
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    OperationResult<Ownership> saveOwnership(Ownership bo, String token);

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-职位
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    OperationResult<Position> fetchPosition(ICriteria criteria, String token);

    /**
     * 保存-职位
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    OperationResult<Position> savePosition(Position bo, String token);

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-岗位
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    OperationResult<Post> fetchPost(ICriteria criteria, String token);

    /**
     * 保存-岗位
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    OperationResult<Post> savePost(Post bo, String token);

    //--------------------------------------------------------------------------------------------//

}
