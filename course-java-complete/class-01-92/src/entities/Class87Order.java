package entities;

import java.util.Date;

import entities.enums.Class87OrderStatus;

public class Class87Order {

	private Integer id;
	private Date moment;
	private Class87OrderStatus status;
	
	public Class87Order() {
	}

	public Class87Order(Integer id, Date moment, Class87OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Class87OrderStatus getStatus() {
		return status;
	}

	public void setStatus(Class87OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
}