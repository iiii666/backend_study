package com.kosa;

public class MemberVO {
//	private String id;
//	private String name;
//	private int height;
//	private int weight;
//	private int age;
	private String prod_code;
	private String prod_name;
	private String prod_color;
	private Integer prod_qty;
	public MemberVO() {
	}
	public MemberVO(String prod_code, String prod_name, String prod_color, Integer prod_qty) {
		super();
		this.prod_code = prod_code;
		this.prod_name = prod_name;
		this.prod_color = prod_color;
		this.prod_qty = prod_qty;
	}
	public String getProd_code() {
		return prod_code;
	}
	public void setProd_code(String prod_code) {
		this.prod_code = prod_code;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_color() {
		return prod_color;
	}
	public void setProd_color(String prod_color) {
		this.prod_color = prod_color;
	}
	public Integer getProd_qty() {
		return prod_qty;
	}
	public void setProd_qty(Integer prod_qty) {
		this.prod_qty = prod_qty;
	}
	public MemberVO(String prod_name, int prod_qty) {
	this.prod_name = prod_name;
	this.prod_qty = prod_qty;
	}
//	public MemberVO(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	public MemberVO(String id, String name, int height, int weight, int age) {
//		this.id = id;
//		this.name = name;
//		this.height = height;
//		this.weight = weight;
//		this.age = age;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getHeight() {
//		return height;
//	}
//
//	public void setHeight(int height) {
//		this.height = height;
//	}
//
//	public int getWeight() {
//		return weight;
//	}
//
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

}
