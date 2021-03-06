package org.mochou.mymall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mochou.mymall.db.domain.MymallAd;
import org.mochou.mymall.db.domain.MymallAdExample;

public interface MymallAdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     */
    long countByExample(MymallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     */
    int deleteByExample(MymallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     */
    int insert(MymallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     */
    int insertSelective(MymallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MymallAd selectOneByExample(MymallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MymallAd selectOneByExampleSelective(@Param("example") MymallAdExample example, @Param("selective") MymallAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<MymallAd> selectByExampleSelective(@Param("example") MymallAdExample example, @Param("selective") MymallAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     */
    List<MymallAd> selectByExample(MymallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MymallAd selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MymallAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     */
    MymallAd selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MymallAd selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MymallAd record, @Param("example") MymallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MymallAd record, @Param("example") MymallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MymallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MymallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") MymallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}