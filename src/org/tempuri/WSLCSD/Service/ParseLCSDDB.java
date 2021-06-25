package org.tempuri.WSLCSD.Service;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ParseLCSDDB {
	public Util util = new Util();
	public DBUtil dbutil = new DBUtil();
	protected final Log logger = LogFactory.getLog(getClass());
	public String job_name="WCISDataIO";
	public void parseSubjectMatter(LCSDSubjectMatterList[] smLists,Connection conn) throws Exception {
		logger.info("parseSubjectMatter");

		try {
			if(smLists!=null && smLists.length!=0) {
				dbutil.getQueryResultSet(conn, "START TRANSACTION;");
				dbutil.getUpdateResultSet(conn,"SET @userid = 'SYS';");
				dbutil.getUpdateResultSet(conn, "DELETE FROM subject_matter_temp;");
				for (int i = 0; i < smLists.length; i++) {
					try {
						
						dbutil.getUpdateResultSet(conn,
								"INSERT INTO `subject_matter_temp`(`SUBJECT_CODE`,`NAME`,`NAME_CHI`,`EFFECTIVE_START_DATE`,`EFFECTIVE_END_DATE`,`LAST_UPD_BY`)VALUES(",
								smLists[i].getId(), ",", smLists[i].getName(), ",", smLists[i].getNameChi(), ",",
								util.dateParser(smLists[i].getEffStartDate()), ",", util.dateParser(smLists[i].getEffEndDate()), ",", "SYS", ");");
					} catch (Exception e) {
						logger.error("Cannot execute the SQL script\tId=" + smLists[i].getId());
						throw new Exception("[insertDB => " + e.toString() + "]");
					}
				}
				dbutil.getUpdateResultSet(conn,
						"INSERT INTO `subject_matter` SELECT * FROM `subject_matter_temp` ON DUPLICATE KEY UPDATE `subject_matter`.NAME = `subject_matter_temp`.NAME, `subject_matter`.NAME_CHI = `subject_matter_temp`.NAME_CHI, `subject_matter`.EFFECTIVE_START_DATE = `subject_matter_temp`.EFFECTIVE_START_DATE, `subject_matter`.EFFECTIVE_END_DATE = `subject_matter_temp`.EFFECTIVE_END_DATE, `subject_matter`.LAST_UPD_BY = `subject_matter_temp`.LAST_UPD_BY, `subject_matter`.LAST_UPD_DATE = `subject_matter_temp`.LAST_UPD_DATE;");
				dbutil.getUpdateResultSet(conn,
						"DELETE FROM `subject_matter` WHERE NOT EXISTS( SELECT * FROM `subject_matter_temp` WHERE `subject_matter`.SUBJECT_CODE = `subject_matter_temp`.SUBJECT_CODE);");
				dbutil.getQueryResultSet(conn, "COMMIT;");
			}
				

		} catch (Exception e) {
			dbutil.getQueryResultSet(conn, "ROLLBACK;");
			logger.error("parseSubjectMatter: ", e);
			throw new Exception("[parseSubjectMatter => " + e.toString() + "]");
		}
	}
	
	public void parseCaseStatus(LCSDMappingList[] csLists,Connection conn) throws Exception {
		logger.info("parseCaseStatus");

		try {
			if(csLists!=null && csLists.length!=0) {
				dbutil.getQueryResultSet(conn, "START TRANSACTION;");
				dbutil.getUpdateResultSet(conn, "DELETE FROM case_status_temp;");
				for (int i = 0; i < csLists.length; i++) {
					try {
						
						dbutil.getUpdateResultSet(conn,
								"INSERT INTO `case_status_temp`(`CASE_STATUS_CODE`,`CASE_STATUS_NAME`,`ACTIVE_FLAG`,`LAST_UPD_BY`)VALUES(",
								csLists[i].getId(), ",", csLists[i].getName(), ",", csLists[i].getActiveflag(), ",", "SYS",
								");");
					} catch (Exception e) {
						logger.error("Cannot execute the SQL script\tId=" + csLists[i].getId());
						throw new Exception("[insertDB => " + e.toString() + "]");
					}
				}
				dbutil.getUpdateResultSet(conn,
						"INSERT INTO `case_status` SELECT * FROM `case_status_temp` ON DUPLICATE KEY UPDATE `case_status`.CASE_STATUS_NAME = `case_status_temp`.CASE_STATUS_NAME, `case_status`.ACTIVE_FLAG = `case_status_temp`.ACTIVE_FLAG, `case_status`.LAST_UPD_BY = `case_status_temp`.LAST_UPD_BY, `case_status`.LAST_UPD_DATE = `case_status_temp`.LAST_UPD_DATE;");
				dbutil.getUpdateResultSet(conn,
						"DELETE FROM `case_status` WHERE NOT EXISTS( SELECT * FROM `case_status_temp` WHERE `case_status`.CASE_STATUS_CODE = `case_status_temp`.CASE_STATUS_CODE);");
				dbutil.getQueryResultSet(conn, "COMMIT;");
			}				

		} catch (Exception e) {
			dbutil.getQueryResultSet(conn, "ROLLBACK;");
			logger.error("parseCaseStatus: ", e);
			throw new Exception("[parseCaseStatus => " + e.toString() + "]");
		}
		
		
	}
	
	public void parseCaseType(LCSDMappingList[] ctLists,Connection conn) throws Exception {
		logger.info("parseCaseType");

		try {
			if(ctLists!=null && ctLists.length!=0) {
				dbutil.getQueryResultSet(conn, "START TRANSACTION;");
				dbutil.getUpdateResultSet(conn, "DELETE FROM case_type_temp;");
				for (int i = 0; i < ctLists.length; i++) {
					try {
						
						dbutil.getUpdateResultSet(conn,
								"INSERT INTO `case_type_temp`(`CASE_TYPE_CODE`,`CASE_TYPE_NAME`,`ACTIVE_FLAG`,`LAST_UPD_BY`)VALUES(",
								ctLists[i].getId(), ",", ctLists[i].getName(), ",", ctLists[i].getActiveflag(), ",", "SYS",
								");");
					} catch (Exception e) {
						logger.error("Cannot execute the SQL script\tId=" + ctLists[i].getId());
						throw new Exception("[insertDB => " + e.toString() + "]");
					}
				}
				dbutil.getUpdateResultSet(conn,
						"INSERT INTO `case_type` SELECT * FROM `case_type_temp` ON DUPLICATE KEY UPDATE `case_type`.CASE_TYPE_NAME = `case_type_temp`.CASE_TYPE_NAME, `case_type`.ACTIVE_FLAG = `case_type_temp`.ACTIVE_FLAG, `case_type`.LAST_UPD_BY = `case_type_temp`.LAST_UPD_BY, `case_type`.LAST_UPD_DATE = `case_type_temp`.LAST_UPD_DATE;");
				dbutil.getUpdateResultSet(conn,
						"DELETE FROM `case_type` WHERE NOT EXISTS( SELECT * FROM `case_type_temp` WHERE `case_type`.CASE_TYPE_CODE = `case_type_temp`.CASE_TYPE_CODE);");
				dbutil.getQueryResultSet(conn, "COMMIT;");
			}				

		} catch (Exception e) {
			dbutil.getQueryResultSet(conn, "ROLLBACK;");
			logger.error("parseCaseType: ", e);
			throw new Exception("[parseCaseType => " + e.toString() + "]");
		}
		
		
	}
	
	public void parseReferralStatus(LCSDMappingList[] rsLists,Connection conn) throws Exception {
		logger.info("parseReferralStatus");

		try {
			if(rsLists!=null && rsLists.length!=0) {
				dbutil.getQueryResultSet(conn, "START TRANSACTION;");
				dbutil.getUpdateResultSet(conn, "DELETE FROM referral_status_temp;");
				for (int i = 0; i < rsLists.length; i++) {
					try {
						
						dbutil.getUpdateResultSet(conn,
								"INSERT INTO `referral_status_temp`(`REFERRAL_STATUS_CODE`,`REFERRAL_STATUS_NAME`,`ACTIVE_FLAG`,`LAST_UPD_BY`)VALUES(",
								rsLists[i].getId(), ",", rsLists[i].getName(), ",", rsLists[i].getActiveflag(), ",",
								"SYS", ");");
					} catch (Exception e) {
						logger.error("Cannot execute the SQL script\tId=" + rsLists[i].getId());
						throw new Exception("[insertDB => " + e.toString() + "]");
					}
				}
				dbutil.getUpdateResultSet(conn,
						"INSERT INTO `referral_status` SELECT * FROM `referral_status_temp` ON DUPLICATE KEY UPDATE `referral_status`.REFERRAL_STATUS_NAME = `referral_status_temp`.REFERRAL_STATUS_NAME, `referral_status`.ACTIVE_FLAG = `referral_status_temp`.ACTIVE_FLAG, `referral_status`.LAST_UPD_BY = `referral_status_temp`.LAST_UPD_BY, `referral_status`.LAST_UPD_DATE = `referral_status_temp`.LAST_UPD_DATE;");
				dbutil.getUpdateResultSet(conn,
						"DELETE FROM `REFERRAL_STATUS` WHERE NOT EXISTS( SELECT * FROM `REFERRAL_STATUS_TEMP` WHERE `REFERRAL_STATUS`.REFERRAL_STATUS_CODE = `REFERRAL_STATUS_TEMP`.REFERRAL_STATUS_CODE);");
				dbutil.getQueryResultSet(conn, "COMMIT;");
			}
				

		} catch (Exception e) {
			dbutil.getQueryResultSet(conn, "ROLLBACK;");
			logger.error("parseReferralStatus: ", e);
			throw new Exception("[parseReferralStatus => " + e.toString() + "]");
		}
		
		
	}
	
	public void parseCase(List<LCSDCaseDetailList> cLists,Connection conn) throws Exception {
		logger.info("parseCase");

		try {
			if(cLists!=null && cLists.size()!=0) {
				dbutil.getQueryResultSet(conn, "START TRANSACTION;");
				dbutil.getUpdateResultSet(conn, "DELETE FROM case_master_temp;");
				for (LCSDCaseDetailList cl:cLists) {

					try {
						dbutil.getUpdateResultSet(conn,
								"INSERT INTO `case_master_temp` (`REFERRAL_NO`,`CASE_NO`,`CASE_DATE`,`CASE_CLOSED_DATE`,`REFERRAL_DONE_DATE`,`CHANNEL_CODE`,`CASE_TITLE`,`CASE_DESCRIPTION`,`BRANCH_CODE`,`DIVISION_CODE`,`SECTION_CODE`,`DISTRICT_CODE`,`VENUE_CODE`,`UNIT_CODE`,`OFFICE_CODE`,`CATEGORY_CODE`,`NATURE_CODE`,`SPEC_VENUE_TYPE_ANS`,`SPEC_NATURE_ANS`,`SPEC_STAFF_RANK_ANS`,`SPEC_VENUE_ANS`,`INVEST_RESULT`,`SPEC_STAFF_GRADE_ANS`,`SPEC_CATEGORY_ANS`,`READY_FOR_RPT`,`SUB_OFFICER_POST`,`SUB_OFFICER_EMAIL`,`SUB_OFFICER_PHONE_NO`,`SUB_OFFICER_FAX_NO`,`ACT_OFFICER_POST`,`ACT_OFFICER_EMAIL`,`ACT_OFFICER_PHONE_NO`,`ACT_OFFICER_FAX_NO`,`last_upd_date`,`REMARKS`,`DUPLICATED_CASE_REF`,`DUPLICATED_CASE`,`REQ_FOR_SERVICE`,`WCIS_URL`,`CASE_STATUS_CODE`,`CASE_TYPE_CODE`,`REFERRAL_STATUS_CODE`,`VENUE_TYPE_CODE`,`STAFF_RANK`,`STAFF_GRADE`,`SUBJECT_CODE`,`CASE_INFO_CHANNEL_DESC`,`CASE_INFO_SOURCE_DESC`,`MISQ_UPD_DATE`,`LCSD_FILE_REF`,`CROSS_DEPT_IND`,`COORDINATOR_IND`,`COORDINATOR`,`CROSS_DEPT`,`ANONYMOUS_IND`,`PROFORMA_IND`,`MASTER_PROFORMA_CASE_NO`,`REFERRAL_CREATE_DATE`,`NO_OF_COMPLAINANT`)VALUES(",
								cl.getReferralNo(), ",", cl.getCaseNo(), ",", cl.getCaseDate(), ",",
								cl.getStatusCodeDate(), ",",  cl.getReferralStatusCodeDate(), ",", cl.getChannelCode(), ",",
								cl.getCaseTitle(), ",", cl.getCaseDesc(), ",", cl.getBranchCode(), ",",
								cl.getDivisionCode(), ",", cl.getSectionCode(), ",", cl.getDistrictCode(), ",",
								cl.getVenueCode(), ",", cl.getUnitCode(), ",", cl.getOfficeCode(), ",", cl.getCatCode(),
								",", cl.getNatureCode(), ",", cl.getSpVenueTypeAns(), ",", cl.getSpNatureAns(), ",",
								null, ",", cl.getSpVenueAns(), ",", cl.getInvtgResult(), ",",
								null, ",", cl.getSpCatAns(), ",", cl.getReadyForReporting(), ",",
								cl.getSubjectOfficerPost(), ",", cl.getSubjectOfficerEmail(), ",",
								cl.getSubjectOfficerPhone(), ",", cl.getSubjectOfficerFax(), ",",
								cl.getActionOfficerPost(), ",", cl.getActionOfficerEmail(), ",",
								cl.getActionOfficerPhone(), ",", cl.getActionOfficerFax(), ",", cl.getLastModifiedDate(),
								",", cl.getRemarks(), ",", util.checkNull(cl.getDuplicatedCaseRe()), ",", util.checkNull(cl.getDuplicatedCase()), ",",
								cl.getReqForService(), ",", cl.getWcisURL(), ",", cl.getCaseStatusCode(), ",",
								cl.getCaseTypeCode(), ",", cl.getReferralStatusCode(), ",", cl.getVenueTypeCode(), ",",
								cl.getStaffRank(), ",", cl.getStaffGrade(), ",", cl.getSubjectMatterCode(), ",",
								cl.getCaseChannel(), ",", cl.getCaseSource(), ",",  cl.getMISUpdateDate(), ",",
								cl.getLcsdFileReference(), ",", util.checkNull(cl.getCrossDeptInd()), ",", util.checkNull(cl.getCoordinatorInd()), ",",
								cl.getCoordinator(), ",", cl.getCrossDept(), ",", cl.getAnonymousInd(), ",",
								util.checkNull(cl.getProformaInd()), ",", util.checkNull(cl.getMasterProformaCaseNo()), ",",  cl.getReferralCreateDate(),
								",", null, ");");
					} catch (Exception e) {						
						logger.error("Error when inserting record to case_temp with referral code " + cl.getReferralStatusCode()+ ", case type code = " + cl.getCaseTypeCode() + ", case status code = "+ cl.getCaseStatusCode() + ", subject matter code = " + cl.getSubjectMatterCode());
						logger.error("parseCase: ", e);
						throw new Exception("[insertDB => " + e.toString() + "]");
					}
				}
				dbutil.getUpdateResultSet(conn,
						"INSERT INTO `case_master` SELECT * FROM `case_master_temp`  ON DUPLICATE KEY UPDATE `case_master`.`CASE_NO` = `case_master_temp`.`CASE_NO`, `case_master`.`CASE_DATE` = `case_master_temp`.`CASE_DATE`, `case_master`.`CASE_CLOSED_DATE` = `case_master_temp`.`CASE_CLOSED_DATE`, `case_master`.`REFERRAL_DONE_DATE` = `case_master_temp`.`REFERRAL_DONE_DATE`, `case_master`.`CHANNEL_CODE` = `case_master_temp`.`CHANNEL_CODE`, `case_master`.`CASE_TITLE` = `case_master_temp`.`CASE_TITLE`, `case_master`.`CASE_DESCRIPTION` = `case_master_temp`.`CASE_DESCRIPTION`, `case_master`.`BRANCH_CODE` = `case_master_temp`.`BRANCH_CODE`, `case_master`.`DIVISION_CODE` = `case_master_temp`.`DIVISION_CODE`, `case_master`.`SECTION_CODE` = `case_master_temp`.`SECTION_CODE`, `case_master`.`DISTRICT_CODE` = `case_master_temp`.`DISTRICT_CODE`, `case_master`.`VENUE_CODE` = `case_master_temp`.`VENUE_CODE`, `case_master`.`UNIT_CODE` = `case_master_temp`.`UNIT_CODE`, `case_master`.`OFFICE_CODE` = `case_master_temp`.`OFFICE_CODE`, `case_master`.`CATEGORY_CODE` = `case_master_temp`.`CATEGORY_CODE`, `case_master`.`NATURE_CODE` = `case_master_temp`.`NATURE_CODE`, `case_master`.`SPEC_VENUE_TYPE_ANS` = `case_master_temp`.`SPEC_VENUE_TYPE_ANS`, `case_master`.`SPEC_NATURE_ANS` = `case_master_temp`.`SPEC_NATURE_ANS`, `case_master`.`SPEC_STAFF_RANK_ANS` = `case_master_temp`.`SPEC_STAFF_RANK_ANS`, `case_master`.`SPEC_VENUE_ANS` = `case_master_temp`.`SPEC_VENUE_ANS`, `case_master`.`INVEST_RESULT` = `case_master_temp`.`INVEST_RESULT`, `case_master`.`SPEC_STAFF_GRADE_ANS` = `case_master_temp`.`SPEC_STAFF_GRADE_ANS`, `case_master`.`SPEC_CATEGORY_ANS` = `case_master_temp`.`SPEC_CATEGORY_ANS`, `case_master`.`READY_FOR_RPT` = `case_master_temp`.`READY_FOR_RPT`, `case_master`.`SUB_OFFICER_POST` = `case_master_temp`.`SUB_OFFICER_POST`, `case_master`.`SUB_OFFICER_EMAIL` = `case_master_temp`.`SUB_OFFICER_EMAIL`, `case_master`.`SUB_OFFICER_PHONE_NO` = `case_master_temp`.`SUB_OFFICER_PHONE_NO`, `case_master`.`SUB_OFFICER_FAX_NO` = `case_master_temp`.`SUB_OFFICER_FAX_NO`, `case_master`.`ACT_OFFICER_POST` = `case_master_temp`.`ACT_OFFICER_POST`, `case_master`.`ACT_OFFICER_EMAIL` = `case_master_temp`.`ACT_OFFICER_EMAIL`, `case_master`.`ACT_OFFICER_PHONE_NO` = `case_master_temp`.`ACT_OFFICER_PHONE_NO`, `case_master`.`ACT_OFFICER_FAX_NO` = `case_master_temp`.`ACT_OFFICER_FAX_NO`, `case_master`.`last_upd_date` = `case_master_temp`.`last_upd_date`, `case_master`.`REMARKS` = `case_master_temp`.`REMARKS`, `case_master`.`DUPLICATED_CASE_REF` = `case_master_temp`.`DUPLICATED_CASE_REF`, `case_master`.`DUPLICATED_CASE` = `case_master_temp`.`DUPLICATED_CASE`, `case_master`.`REQ_FOR_SERVICE` = `case_master_temp`.`REQ_FOR_SERVICE`, `case_master`.`WCIS_URL` = `case_master_temp`.`WCIS_URL`, `case_master`.`CASE_STATUS_CODE` = `case_master_temp`.`CASE_STATUS_CODE`, `case_master`.`CASE_TYPE_CODE` = `case_master_temp`.`CASE_TYPE_CODE`, `case_master`.`REFERRAL_STATUS_CODE` = `case_master_temp`.`REFERRAL_STATUS_CODE`, `case_master`.`VENUE_TYPE_CODE` = `case_master_temp`.`VENUE_TYPE_CODE`, `case_master`.`STAFF_RANK` = `case_master_temp`.`STAFF_RANK`, `case_master`.`STAFF_GRADE` = `case_master_temp`.`STAFF_GRADE`, `case_master`.`SUBJECT_CODE` = `case_master_temp`.`SUBJECT_CODE`, `case_master`.`CASE_INFO_CHANNEL_DESC` = `case_master_temp`.`CASE_INFO_CHANNEL_DESC`, `case_master`.`CASE_INFO_SOURCE_DESC` = `case_master_temp`.`CASE_INFO_SOURCE_DESC`, `case_master`.`MISQ_UPD_DATE` = `case_master_temp`.`MISQ_UPD_DATE`, `case_master`.`LCSD_FILE_REF` = `case_master_temp`.`LCSD_FILE_REF`, `case_master`.`CROSS_DEPT_IND` = `case_master_temp`.`CROSS_DEPT_IND`, `case_master`.`COORDINATOR_IND` = `case_master_temp`.`COORDINATOR_IND`, `case_master`.`COORDINATOR` = `case_master_temp`.`COORDINATOR`, `case_master`.`CROSS_DEPT` = `case_master_temp`.`CROSS_DEPT`, `case_master`.`ANONYMOUS_IND` = `case_master_temp`.`ANONYMOUS_IND`, `case_master`.`PROFORMA_IND` = `case_master_temp`.`PROFORMA_IND`, `case_master`.`MASTER_PROFORMA_CASE_NO` = `case_master_temp`.`MASTER_PROFORMA_CASE_NO`, `case_master`.`REFERRAL_CREATE_DATE` = `case_master_temp`.`REFERRAL_CREATE_DATE`, `case_master`.`NO_OF_COMPLAINANT` = `case_master_temp`.`NO_OF_COMPLAINANT`;");
				dbutil.getUpdateResultSet(conn, "CALL update_case_master_completed_list;");
				dbutil.getUpdateResultSet(conn,
						"DELETE FROM `CASE_MASTER` WHERE REFERRAL_STATUS_CODE IN ('1+1P+26','0-2731','0-2734');");
				dbutil.getUpdateResultSet(conn,
						"DELETE FROM `CASE_MASTER` WHERE CASE_TYPE_CODE NOT IN ('1+1P+71','1-1ZEGG');");				
				dbutil.getUpdateResultSet(conn,
						"INSERT IGNORE INTO `sub_officer_post` (SUB_OFFICER_POST_CODE) SELECT DISTINCT SUB_OFFICER_POST FROM `case_master`;");
				dbutil.getQueryResultSet(conn, "COMMIT;");
				logger.info(cLists.size()+" Cases processed");
				
			}
				

		} catch (Exception e) {
			dbutil.getQueryResultSet(conn, "ROLLBACK;");
			logger.error("parseCases: ", e);
			throw new Exception("[parseCase => " + e.toString() + "]");
		}
				
	}
	
	public String extractCodeTableFromDB(Connection conn)  throws Exception{
		logger.info("extractCodeTableFromDB");
		String[] CODE_TABLE = util.getPath("CODE_TABLES").split(",");
		String update_from ="",update_to =new SimpleDateFormat("yyyyMMddHHmmss").format(new Timestamp(System.currentTimeMillis())),extract_type="";
		String fileContent =null, sql;
		File ctrlFile = new File(util.getPath("WCIS_EXPORT_DIR")+"ctrl.txt");
		try {
			
			update_from=dbutil.simpleQRS(dbutil.getQueryResultSet(conn,
					"SELECT count(*),  DATE_FORMAT(ifnull(JOB_END_DATE,now()),'%Y%m%d%H%i%s') update_from FROM vps2.job_history a where  BATCH_HISTORY_SEQ = (select max(BATCH_HISTORY_SEQ) from  vps2.job_history where job_name ='"+job_name+
					"'and job_exec_status = 'Completed' );")).getString("update_from");
			extract_type=dbutil.simpleQRS(dbutil.getQueryResultSet(conn, "SELECT para_value extract_type FROM vps2.job_para_value a, job_trigger b where a.TRIGGER_NAME = b.TRIGGER_NAME and b.JOB_NAME = '"+job_name+
					"' AND PARA_NAME = 'EXTRACTION_TYPE';")).getString("extract_type");
			/*
			update_from="20200611200012";
			extract_type="D";
			*/
			fileContent = "extraction_type=" + extract_type + "\r\n";
			
			
			for (int i = 0; i < CODE_TABLE.length; i++) {

				sql = util.getPath(CODE_TABLE[i]);
				
				sql += extract_type.equals("D")?" WHERE DATE_FORMAT(LAST_UPD_DATE, '%Y-%m-%d %H:%i:%s') > STR_TO_DATE('"+ update_from + "', '%Y%m%d%H%i%s') OR LAST_UPD_DATE = 'LAST_UPD_DATE' ORDER BY CASE WHEN LAST_UPD_DATE = 'LAST_UPD_DATE' THEN 0 ELSE LAST_UPD_DATE END;":"";
													
				fileContent += CODE_TABLE[i] + "=" + (util.writeFile(new File(util.getPath("WCIS_EXPORT_DIR")+CODE_TABLE[i]+".CSV"),dbutil.getQueryResultSet(conn,sql))) + "\r\n";
				
			}
			
			fileContent += "update_from=" + update_from + "\r\n";
			fileContent += "update_to=" + update_to + "\r\n";
			
			util.writeFile(ctrlFile,fileContent);
			
		}catch(Exception e) {
			logger.error("extractCodeTableFromDB: ", e);
			throw new Exception("[extractCodeTableFromDB => " + e.toString() + "]");
		}
		
		return fileContent;
	}
	
	public long getBatchHistSeq(String status, Connection conn) throws SQLException {
		
		return dbutil.getUpdateResultSet(conn,"INSERT INTO `job_history` (`JOB_START_DATE`, `JOB_EXEC_STATUS`, `TRIGGER_NAME`, `JOB_END_DATE`, `AD_HOC_IND`, `JOB_NAME`, `LOG_FILE_NAME`) VALUES ( now(), ",
				status, ", (SELECT `TRIGGER_NAME` FROM JOB_TRIGGER WHERE JOB_NAME = ", job_name,
				"), now(),", "N", ", ", job_name,
				", 'logging.log');");
		
	}
	
	public List<String> getSysUserId(Connection conn) throws SQLException {
		
		List<String> user_id =new ArrayList<String>();
		ResultSet rs=dbutil.getQueryResultSet(conn,
					"SELECT DISTINCT LCASE(POST_TITLE_WO_CHARACTERS(sys_user.USER_ID)) AS USER_ID FROM sys_user_role, sys_user WHERE sys_user_role.USER_ID = sys_user.USER_ID AND sys_user_role.ROLE_CODE = 'ADM' AND sys_user.ACTIVE_IND = 'Y';");
		while(rs.next()) {
			user_id.add(rs.getString("USER_ID"));
		}
				
		return user_id;
	
	}
	
	public void updateWCISSyncDate(Connection conn, String processDate) throws SQLException {
		System.out.println(processDate);
		dbutil.getUpdateResultSet(conn,"SET @userid = 'SYS';");
		dbutil.getUpdateResultSet(conn,"update `job_history` a set a.JOB_END_DATE=now() where BATCH_HISTORY_SEQ =(select max_id from (select max(BATCH_HISTORY_SEQ) as max_id  FROM `job_history` where JOB_NAME='ImportDataFromWCIS' and JOB_EXEC_STATUS='Completed')as a);");
		dbutil.getUpdateResultSet(conn,"update `job_history` a set a.JOB_END_DATE=now() where BATCH_HISTORY_SEQ =(select max_id from (select max(BATCH_HISTORY_SEQ) as max_id  FROM `job_history` where JOB_NAME='ExportDataToWCIS' and JOB_EXEC_STATUS='Completed')as a);");
		dbutil.getUpdateResultSet(conn,"update `job_history` a set a.REMARKS='"+processDate+"' where BATCH_HISTORY_SEQ =(select max_id from (select max(BATCH_HISTORY_SEQ) as max_id  FROM `job_history` where JOB_NAME='"+job_name+"' and JOB_EXEC_STATUS='Completed')as a);");
	}
	
	public String getLatestProcessDate() throws SQLException {
		
		String latestProcessDate=null;
		
		Connection conn = dbutil.getConnection();
		
		latestProcessDate = dbutil.simpleQRS(dbutil.getQueryResultSet(conn,"select REMARKS from `job_history` where BATCH_HISTORY_SEQ =(select max_id from (select max(BATCH_HISTORY_SEQ) as max_id  FROM `job_history` where JOB_NAME='"+job_name+"' and JOB_EXEC_STATUS='Completed')as a);")).getString("REMARKS");
	
		conn.close();
		
		return (latestProcessDate==null||latestProcessDate.length()==0)?DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now()):latestProcessDate;
	}
	
	
}
