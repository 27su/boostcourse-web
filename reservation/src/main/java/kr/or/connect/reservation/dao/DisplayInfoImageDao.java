package kr.or.connect.reservation.dao;

import static kr.or.connect.reservation.dao.DisplayInfoImageDaoSqls.DELETE_BY_ID;
import static kr.or.connect.reservation.dao.DisplayInfoImageDaoSqls.SELECT_COUNT;
import static kr.or.connect.reservation.dao.DisplayInfoImageDaoSqls.SELECT_PAGING;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import kr.or.connect.reservation.dto.DisplayInfoImage;

public class DisplayInfoImageDao {
	private NamedParameterJdbcTemplate jdbc;
    private SimpleJdbcInsert insertAction;
    private RowMapper<DisplayInfoImage> rowMapper = BeanPropertyRowMapper.newInstance(DisplayInfoImage.class);

    public DisplayInfoImageDao(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
        this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("display_info_image")
                .usingGeneratedKeyColumns("id");
    }
    
    public List<DisplayInfoImage> selectAll(Integer start, Integer limit) {
    		Map<String, Integer> params = new HashMap<>();
    		params.put("start", start);
    		params.put("limit", limit);
        return jdbc.query(SELECT_PAGING, params, rowMapper);
    }


	public Long insert(DisplayInfoImage display_info_image) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(display_info_image);
		return insertAction.executeAndReturnKey(params).longValue();
	}
	
	public int deleteById(Long id) {
		Map<String, ?> params = Collections.singletonMap("id", id);
		return jdbc.update(DELETE_BY_ID, params);
	}
	
	public int selectCount() {
		return jdbc.queryForObject(SELECT_COUNT, Collections.emptyMap(), Integer.class);
	}
}
