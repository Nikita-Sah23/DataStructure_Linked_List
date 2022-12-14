package com.linkedList;

public class AddingElementLinkedList {

		Node head;
		static class Node {
			int data;
			Node next;

			Node(int d) {
				data = d;
				next = null;
			}
		}

		public static AddingElementLinkedList insert(AddingElementLinkedList list, int data) {
			Node new_node = new Node(data);
			if (list.head == null) {
				list.head = new_node;
			} else {
				Node last = list.head;
				while (last.next != null) {
					last = last.next;
				}
				last.next = new_node;
			}
			return list;
		}

		public static void printList(AddingElementLinkedList list) {
			Node currNode = list.head;

			System.out.print("LinkedList: ");

			while (currNode != null) {
				System.out.print("key-> " + currNode.data + ", ");
				currNode = currNode.next;
			}
		}

	public static void main(String[] args) {
		AddingElementLinkedList list = new AddingElementLinkedList();
		list = insert(list, 70);
		list = insert(list, 30);
		list = insert(list, 56);
		printList(list);
	}
	}