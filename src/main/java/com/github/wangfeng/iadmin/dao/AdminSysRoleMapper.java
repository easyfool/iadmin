package com.github.wangfeng.iadmin.dao;

import com.github.wangfeng.iadmin.common.po.dto.AdminSysRoleQueryWithPageDTO;
import com.github.wangfeng.iadmin.common.po.entity.AdminSysRoleDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminSysRoleMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_sys_role
     *
     * @mbg.generated Wed Sep 18 09:47:33 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_sys_role
     *
     * @mbg.generated Wed Sep 18 09:47:33 CST 2019
     */
    int insert(AdminSysRoleDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_sys_role
     *
     * @mbg.generated Wed Sep 18 09:47:33 CST 2019
     */
    int insertSelective(AdminSysRoleDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_sys_role
     *
     * @mbg.generated Wed Sep 18 09:47:33 CST 2019
     */
    AdminSysRoleDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_sys_role
     *
     * @mbg.generated Wed Sep 18 09:47:33 CST 2019
     */
    int updateByPrimaryKeySelective(AdminSysRoleDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_sys_role
     *
     * @mbg.generated Wed Sep 18 09:47:33 CST 2019
     */
    int updateByPrimaryKey(AdminSysRoleDO record);

    List<AdminSysRoleDO> selectAllWithFuzzyConditions(AdminSysRoleQueryWithPageDTO adminSysRoleQueryWithPageDTO);


    long countByRoleName(@Param("roleName") String roleName);

    long countByRoleCode(@Param("roleCode") String roleCode);
}