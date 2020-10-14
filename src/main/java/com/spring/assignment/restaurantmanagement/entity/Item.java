package com.spring.assignment.restaurantmanagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "item_name")
	private String itemName;

	@Column(name = "status")
	private String status;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "item_options_id")
	private ItemOptions itemOptions;

//	@ManyToMany(mappedBy = "items")
//	private List<ItemOrder> itemOrders;

	public Item() {
	}

	public Item(String itemName, String status) {
		this.itemName = itemName;
		this.status = status;
	}

//	public void addItemOrder(ItemOrder itemOrder) {
//		if (itemOrders == null) {
//			itemOrders = new ArrayList<ItemOrder>();
//		}
//		itemOrders.add(itemOrder);
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ItemOptions getItemOptions() {
		return itemOptions;
	}

	public void setItemOptions(ItemOptions itemOptions) {
		this.itemOptions = itemOptions;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", status=" + status + ", itemOptions=" + itemOptions
				+ "]";
	}

//	public List<ItemOrder> getItemOrder() {
//		return itemOrders;
//	}
//
//	public void setItemOrder(List<ItemOrder> itemOrder) {
//		this.itemOrders = itemOrder;
//	}
	
	

}
