package shop.db;

public class SQL {
	//customer
	public static final String INSERT_CUSTOMER ="insert into `customer` set"
											   + "`custid`= ? ,"
											   + "`name`= ? ,"
											   + "`hp` = ? ,"
											   + "`addr` = ? ,"
											   + "`rdate`= NOW()";
											   
	public static final String SELECT_CUSTOMER ="select * from `customer` where `custId` = ?";
	public static final String SELECT_CUSTOMERS ="select * from `customer`";
	public static final String UPDATE_CUSTOMER ="update `customer` set "
											   + "`name`=? , "
											   + "`hp`=? , "
											   + "`addr`=? "
											   + "where `custId` = ?,";
	public static final String DELETE_CUSTOMER="delete from `customer` where `custId` = ?";
	
	//order
	public static final String SELECT_PRODUCT ="select * from `product`";
	//product
	public static final String INSERT_ORDER = "insert into `order` set"
											+ "`orderId` = ? ,"
											+ "`orderProduct` = ? ,"
											+ "`orderCount` = ? ,"
											+ "`orderDate` = NOW()";
	
	public static final String SELECT_ORDER = "select * from `product` where `orderId` = ?";
	public static final String SELECT_ORDERS_BY_ORDERID = "select "
														+ "`orderNo`,"
														+ "`orderProduct`,"
														+ "`prodName`,"
														+ "`orderCount`,"
														+ "`name`,"
														+ "`orderDate` "
														+ "from `order` as o "
														+ "join `product` as p on o.orderProduct = p.prodNo "
														+ "join `customer` as c on o.orderId = c.custId "
														+ "where `orderId`=?";
}
