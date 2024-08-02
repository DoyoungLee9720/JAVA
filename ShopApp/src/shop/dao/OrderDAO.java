package shop.dao;

import java.util.ArrayList;
import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.CustomerVO;
import shop.vo.OrderVO;

//삼품 번호
//상품 수량
//주문자 아이디
//주문 제품
//주문 날짜
public class OrderDAO extends DBHelper{
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	
	public int insertOrder(OrderVO vo) {
		int count = 0;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setString(1, vo.getOrderId());
			psmt.setInt(2, vo.getOrderProduct());
			psmt.setInt(3, vo.getOrderCount());
			count = psmt.executeUpdate();
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	public List<OrderVO> selectOrder(String orderId){
		List<OrderVO> orders = new ArrayList<>();
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ORDERS_BY_ORDERID);
			psmt.setString(1, orderId);
			rs = psmt.executeQuery();
			while(rs.next()) {
				OrderVO order = new OrderVO();
				order.setOrderNo(rs.getInt(1));
				order.setOrderProduct(rs.getInt(2));
				order.setProdName(rs.getString(3));
				order.setOrderCount(rs.getInt(4));
				order.setOrderer(rs.getString(5));
				order.setOrderDate(rs.getString(6).substring(2,10));
				orders.add(order);
			}
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
}
