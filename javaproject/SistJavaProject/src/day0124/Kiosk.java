package day0124;

import java.util.Scanner;

public class Kiosk {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = 0;

		String orderList[] = new String[5];

		int totPrice = 0;

		while (true) {

			System.out.print("============= CAFE ORDER HERE ============="

					+ "\n1.주문하기 2.주문취소 3.결제하기 4.끝내기"

					+ "\n메뉴 선택: ");

			int selectMenu = sc.nextInt();

			System.out.println();

			if (selectMenu == 1) {

				System.out.print("================ 주문가능 메뉴 ================"

						+ "\n1.에스프레소 3000원\n2.아메리카노 3500원\n3.카페라떼 3800원\n4.밀크티 4200원\n5.청귤에이드 4000원"

						+ "\n-------------------------------------------"

						+ "\n주문할 메뉴 선택: ");

				int orderMenu = sc.nextInt();

				String menu = "";

				int menuPrice = 0;

				if (orderMenu == 1) {

					menu = "에스프레소";

					menuPrice = 3000;

					totPrice += menuPrice;

					orderList[cnt] = menu;

					cnt++;

					System.out.println(menu + "가 주문 목록에 추가되었습니다.");

				} else if (orderMenu == 2) {

					menu = "아메리카노";

					menuPrice = 3500;

					totPrice += menuPrice;

					orderList[cnt] = menu;

					cnt++;

					System.out.println(menu + "가 주문 목록에 추가되었습니다.");

				} else if (orderMenu == 3) {

					menu = "카페라떼";

					menuPrice = 3800;

					totPrice += menuPrice;

					orderList[cnt] = menu;

					cnt++;

					System.out.println(menu + "가 주문 목록에 추가되었습니다.");

				} else if (orderMenu == 4) {

					menu = "밀크티";

					menuPrice = 4200;

					totPrice += menuPrice;

					orderList[cnt] = menu;

					cnt++;

					System.out.println(menu + "가 주문 목록에 추가되었습니다.");

				} else if (orderMenu == 5) {

					menu = "청귤에이드";

					menuPrice = 4000;

					totPrice += menuPrice;

					orderList[cnt] = menu;

					cnt++;

					System.out.println(menu + "가 주문 목록에 추가되었습니다.");

				} else {

					System.out.println("잘못된 입력입니다.");

				}

				System.out.println();

			} else if (selectMenu == 2) {

				System.out.println("================== 주문 목록 ==================");

				for (int i = 0; i < cnt; i++) {

					System.out.println("[" + (i + 1) + "]" + orderList[i]);

				}

				System.out.print("-------------------------------------------"

						+ "\n취소할 메뉴 번호 : ");

				int cancelMenu = sc.nextInt();

				String deleteMenu = orderList[cancelMenu - 1];

				if (cancelMenu >= 1 && cancelMenu <= cnt) {

					if (deleteMenu.equals("에스프레소")) {

						totPrice -= 3000;

					} else if (deleteMenu.equals("아메리카노")) {

						totPrice -= 3500;

					} else if (deleteMenu.equals("카페라떼")) {

						totPrice -= 3800;

					} else if (deleteMenu.equals("밀크티")) {

						totPrice -= 4200;

					} else if (deleteMenu.equals("청귤에이드")) {

						totPrice -= 4000;

					}

					cnt--;

				} else {

					System.out.println("잘못된 입력입니다.");

				}

				for (int i = cancelMenu - 1; i < cnt; i++) {

					orderList[i] = orderList[i + 1];

				}

				System.out.println(deleteMenu + "가 주문목록에서 삭제되었습니다.");

				System.out.println();

			} else if (selectMenu == 3) {

				System.out.print("총 주문금액 : " + totPrice

						+ "\n결제할 금액 : ");

				int payment = sc.nextInt();

				if (payment >= totPrice) {

					System.out.println("결제가 완료되었습니다."

							+ "\n거스름돈은 " + (payment - totPrice) + "원 입니다.");

					totPrice = 0;

					for (int i = 0; i < cnt; i++) {

						orderList[i] = "";

					}

				} else {

					System.out.println("금액이 부족합니다.");

				}

				System.out.println();

			} else if (selectMenu == 4) {

				System.out.println("프로그램을 종료합니다.");

				break;

			} else {

				System.out.println("잘못된 입력입니다.");

			}

		}

	}

}